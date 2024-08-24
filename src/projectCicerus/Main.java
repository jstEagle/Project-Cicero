package projectCicerus;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static Path directoryPath;
    public static void main(String[] args) {
        directoryPath = Paths.get("A2Pure");
        Path outputDirectoryPath = Paths.get("A2Output");

        createFiles(directoryPath, outputDirectoryPath);
    }

    public static void createFiles(Path inputDirectoryPath, Path outputDirectoryPath) {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(inputDirectoryPath)) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path)) {
                    // Read lines from the file
                    List<String> fileLines = Files.readAllLines(path, StandardCharsets.UTF_8);
                    String fileName = path.getFileName().toString().replace(".md", "");

                    // Delete the original file if it doesn't have the .md extension
                    if (fileName.equals(path.getFileName().toString())) {
                        try {
                            boolean deleted = Files.deleteIfExists(path);
                            if (deleted) {
                                System.out.println("File deleted successfully: " + path.getFileName());
                            } else {
                                System.out.println("File does not exist: " + path.getFileName());
                            }
                            continue;
                        } catch (IOException e) {
                            System.out.println("An error occurred while deleting the file: " + path.getFileName());
                            e.printStackTrace();
                        }
                    }

                    // Create the new directory for the file within the output directory
                    Path newRoute = outputDirectoryPath.resolve(fileName);
                    if (Files.notExists(newRoute)) {
                        Files.createDirectory(newRoute);
                        System.out.println("Directory created: " + newRoute.toString());
                    } else {
                        System.out.println("Directory already exists: " + newRoute.toString());
                    }

                    // Create the new file inside the new directory
                    Path newFilePath = newRoute.resolve("+page.svelte");
                    if (Files.notExists(newFilePath)) {
                        Files.createFile(newFilePath);
                        System.out.println("File created: " + newFilePath.getFileName());
                    } else {
                        System.out.println("File already exists: " + newFilePath.getFileName());
                    }

                    // Translate all the lines
                    String[] result = translate(fileLines, fileName);

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
                } else if (Files.isDirectory(path)) {
                    // Recursively process the directory within the output directory
                    Path newOutputDir = outputDirectoryPath.resolve(path.getFileName().toString());
                    try {
                        Files.createDirectory(newOutputDir);
                        System.out.println("Directory created: " + newOutputDir.toString());
                    } catch (IOException e) {
                        System.out.println("An error occured while creating: " + newOutputDir.toString());
                        e.printStackTrace();
                    }
                    createFiles(path, newOutputDir);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] translate(List<String> lines, String fileName) {
        List<String> result = new ArrayList<>();

        int count = 0;
        boolean flag = false;
        for (String line : lines) {
            if(line.trim().equals("```desmos-graph")) {
                line = Translate.graphs(fileName.replace("-", ""), count);
                result.add(line);
                count++;
                flag = true;
                continue;
            } else if(flag && line.trim().equals("```")) {
                flag = false;
                continue;
            } else if(!flag) {
                line = "<p>" + line + "</p>";
                line = Translate.headings(line);
                line = Translate.displayEquations(line);
                line = Translate.inlineEquations(line);
                line = Translate.textStyling(line);
                line = Translate.imageLinks(line);
                line = Translate.pageLinks(line, directoryPath);

                // Escape backslashes
                line = line.replace("\\", "\\\\");

                result.add(line);
            }
            
        }
        String[] temp = new String[result.size()];
        int index = 0;
        for(String item : result) {
            temp[index] = item;
            index++;
        }
        return temp;
    }
}