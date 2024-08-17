package projectCicerus;

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
        String filePath = "FileExample.md";
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String newFilePath = "App.svelte";
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
            String boilerPlate = "<script>\n    import Katex from './Katex.svelte';\n</script>\n\n";	
            writer.write(boilerPlate);
            for(String s : result) {
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
            line = Translate.headings(line);
            line = Translate.displayEquations(line);
            line = Translate.inlineEquations(line);
            line = Translate.textStyling(line);

            char[] chars = line.toCharArray();
            line  = "";
            for(char c : chars) {
                if(c == '\\') {
                    line += "\\\\";
                } else {
                    line += c;
                }
            } 
            result[index] = line;
            index++;
        }

        return result;
    }
}