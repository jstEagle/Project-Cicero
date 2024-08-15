import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filePath = "fileExample.md";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String newFilePath = "htmlFile.html";
        File file = new File(newFilePath);

        try {
            if(file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println("An error occured while creating the file!");
            e.printStackTrace();
            return;
        }

        // Translate all the lines
        String[] result = translate(lines);

        // Output all the lines to an html file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for(String s : result) {
                System.out.println(s);
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing the html file.");
            e.printStackTrace();
        }

    }

    public static String[] translate(List<String> lines) {
        String[] result = new String[lines.size()];

        int index = 0;
        for(String line : lines) {
            line = "<p>" + line + "</p>";
            line = translateHeadings(line);
            line = translateDisplayEquations(line);
            line = translateInlineEquations(line);
            result[index] = line;
            index++;
        }

        return result;
    }

    public static String translateHeadings(String line) {
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

        int headingLevel = Math.min(num, 6);
        if(flag) {
            return "<h" + headingLevel + ">" + line.replace("#", "") + "</h" + headingLevel + ">";
        }
        return line;
    }

    public static String translateDisplayEquations(String line) {
        line = line.trim();
        return line.replaceAll("\\$\\$(.*?)\\$\\$", "<Katex math={\"" + "$1" + "\"} displayMode/>");
    }

    public static String translateInlineEquations(String line) {
        line = line.trim();
        return line.replaceAll("\\$(.*?)\\$", "<Katex math={\"" + "$1" + "\"}/>");
    }
}