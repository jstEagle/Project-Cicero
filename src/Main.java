import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "../example/file-example.md";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String newFilePath = "../example/htmlFile.html";
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



    }

    public static String[] translate(List<String> lines) {
        String[] result = new String[lines.size()];

        for(String line : lines) {

        }
    }

    public static String checkHeadings(String line) {
        line = line.trim();
        char[] chars = line.toCharArray();
        int num = 0;

        if (chars.length > 0 && chars[0] == '#') {
            num = 1;
            while (num < chars.length && chars[num] == '#') {
                num++;
            }
        } else {
            return line;
        }

        int headingLevel = Math.min(num, 6);
        return "<h" + headingLevel + ">" + line.substring(num).trim() + "</h" + headingLevel + ">";
    }
}