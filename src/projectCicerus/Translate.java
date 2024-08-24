package projectCicerus;

import java.nio.file.*;
import java.io.IOException;

public class Translate {
    public static String headings(String line) {
        line = line.trim();
        char[] chars = line.toCharArray();
        int num = 0;
        boolean flag = false;

        if (chars.length > 0) {
            for(int i = 0; i < chars.length; i++) {
                if(chars[i] == '#') {
                    flag = true;
                    while(chars[i] == '#') {
                        num++;
                        i++;
                    }
                    break;
                }
            }
        } else {
            return line;
        }

        int headingLevel = Math.min(Math.max(num-1, 1), 6);
        if(flag) {
            line = line.replace("<p>", "").replace("</p>", "");
            return "<h" + headingLevel + " class=\"heading\">" + line.replace("#", "") + "</h" + headingLevel + ">";
        }
        return line;
    }

    public static String displayEquations(String line) {
        line = line.trim();
        return line.replaceAll("\\$\\$(.*?)\\$\\$", "<Katex math={\"" + "$1" + "\"} displayMode/>");
    }

    public static String inlineEquations(String line) {
        line = line.trim();
        return line.replaceAll("\\$(.*?)\\$", "<Katex math={\"" + "$1" + "\"}/>");
    }

    public static String textStyling(String line) {
        line = line.trim();
        String test = line.replace("<p>", "").replace("</p>", "");

        if (test.length() > 0) {
            boolean flag = true;
            char[] c = test.toCharArray();
            for (char x : c) {
                if (x != '-' && x != '_') {
                    flag = false;
                    break;
                }
            }

            if (flag && test.length() >= 3) {
                return "<h3 class=\"divider\">Made by jstEagle ;)</h3>";
            }
        }
        
        line = line.replaceAll("\\*\\*(.*?)\\*\\*", "<b>" + "$1" + "</b>");
        return line.replaceAll("_(.?)_", "<i>" + "$1" + "</i>");
    }

    public static String imageLinks(String line) {
        line = line.trim();
        String test = line.replace("<p>", "").replace("</p>", "");

        if(test.length() < 3) {
            return line;
        }

        if(test.substring(0, 3).equals("![[")) {
            line = test.substring(3, test.length()-2);
            line = "<img src=\"/Attachements/" + line.replace(" ", "") + "\" alt=\"diagram\">";
            return line;
        }
        return line;
    }

    public static String graphs(String fileName, int num) {
        return "<img src=\"/graphs/" + fileName + num + ".png\" alt=\"graph\">";
    }

    public static String pageLinks(String line, Path inputDirectory) {
        line = line.trim();
        String test = line.replace("<p>", "").replace("</p>", "");
        String copy = test;

        if (test.replaceAll("\\[\\[(.*?)\\]\\]", "$1").length() < copy.length()) {
            line = test.replaceAll("\\[\\[(.*?)\\]\\]", "$1").trim();
            String link = line.replace(" ", "-");
            link = getPageLink(link, inputDirectory);
            line = "<div class=\"link-container\"><a href=\"/" + link + "\">" + line + "</a></div>";
            return line;
        }
        return line;
    }

    public static String getPageLink(String link, Path inputDirectory) {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(inputDirectory)) {
            for(Path path : directoryStream) {
                if(Files.isRegularFile(path)) {
                    String fileName = path.getFileName().toString();
                    if(fileName.replace(" ", "-").equals(link)) {
                        return path.toString();
                    }
                } else if(Files.isDirectory(path)) {
                    return getPageLink(link, path);
                }
            }
        } catch(IOException e) {
            System.out.println("Error getting page link for link: " + link);
            e.printStackTrace();
        }
        return "/";
    }
}