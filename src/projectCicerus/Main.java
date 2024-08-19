package projectCicerus;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("folderTest");

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath)) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path)) {
                    // Read lines from the file and add to the list
                    List<String> fileLines = Files.readAllLines(path, StandardCharsets.UTF_8);
                    String fileName = path.getFileName().toString().replace(".md", "");

                    // Create the new directory for the file
                    Path newRoute = Paths.get(fileName);
                    if (Files.notExists(newRoute)) {
                        Files.createDirectory(newRoute);
                        System.out.println("Directory Created: " + newRoute.toString());
                    } else {
                        System.out.println("Directory already exists!");
                    }

                    // Create the new file inside the new directory
                    Path newFilePath = Paths.get(newRoute.toString(), "+page.svelte");
                    if (Files.notExists(newFilePath)) {
                        Files.createFile(newFilePath);
                        System.out.println("File Created: " + newFilePath.getFileName());
                    } else {
                        System.out.println("File already exists!");
                    }

                    // Translate all the lines
                    String[] result = translate(fileLines);

                    // Prepare content for writing
                    StringBuilder contentBuilder = new StringBuilder();
                    String boilerPlate = "<script>\n    import Katex from '$lib/Katex.svelte';\n    import '$lib/global.css'\n</script>\n\n<svelte:head><title>" + fileName + "</title></svelte:head><div class=\"note\">\n   <h1 class=\"title\">" + fileName + "</h1>\n";
                    contentBuilder.append(boilerPlate);
                    for (String s : result) {
                        contentBuilder.append(s).append("\n");
                    }
                    String end = "</div>";
                    contentBuilder.append(end);

                    // Write all the lines to the new file
                    try {
                        Files.write(newFilePath, contentBuilder.toString().getBytes(StandardCharsets.UTF_8));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] translate(List<String> lines) {
        String[] result = new String[lines.size()];

        int index = 0;
        for (String line : lines) {
            line = "<p>" + line + "</p>";
            line = Translate.headings(line);
            line = Translate.displayEquations(line);
            line = Translate.inlineEquations(line);
            line = Translate.textStyling(line);
            line = Translate.imageLinks(line);
            line = Translate.pageLinks(line);

            // Escape backslashes
            line = line.replace("\\", "\\\\");

            result[index] = line;
            index++;
        }

        return result;
    }
}