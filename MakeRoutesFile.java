import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MakeRoutesFile {
    public static Map<String, String> result = new HashMap<>();
   public static void main(String[] args) {
        String folderPath = "AS-Math-Pure";
        Path directoryPath = Paths.get(folderPath); // Replace with your directory path

        getRoutes(directoryPath);
        makeRoutes(folderPath);
    }

    public static void getRoutes(Path directoryPath) {
        List<Path> paths = new ArrayList<>();
        
        //Get all the routes
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath)) {
            for (Path path : directoryStream) {
                if(Files.isDirectory(path)) {
                    String key = path.getFileName().toString().replace("-", " ");
                    String value = path.toString();
                    result.put(key, value);
                    paths.add(path);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Path path : paths) {
            getRoutes(path);
        }
    }

    public static void makeRoutes(String path) {
        Path newFilePath = Paths.get(path + "Routes.js");
        if (Files.notExists(newFilePath)) {
            try {
                Files.createFile(newFilePath);
                System.out.println("File created: " + newFilePath.getFileName());
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + newFilePath.getFileName());
        }

        // Prepare content for writing
        StringBuilder contentBuilder = new StringBuilder();
        String boilerPlate = "export const routes = [ \n";
        contentBuilder.append(boilerPlate);
        for (Map.Entry<String, String> entry : result.entrySet()) {
            contentBuilder.append(" { path: '/" + entry.getValue().replace("\\", "/").replace("'", "\\'") + "', title: '" + entry.getKey().replace("'", "\\'") + "' },\n");
        }
        String end = "];";
        contentBuilder.append(end);

        // Write all the lines to the new file
        try {
            Files.write(newFilePath, contentBuilder.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
}
