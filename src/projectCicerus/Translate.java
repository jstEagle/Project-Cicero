package projectCicerus;

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
                return "<h3 class=\"divider\">___</h3>";
            }
        }
        
        line = line.replaceAll("\\*\\*(.*?)\\*\\*", "<b>" + "$1" + "</b>");
        return line.replaceAll("_(.?)_", "<i>" + "$1" + "</i>");
    }
}