import java.io.IOException;
import java.nio.file.*;

public class RenameFilesInDirectory {
    public static void main(String[] args) {
        String[] dirs = {"A2Stats", "ASPure", "ASStats"};

        for(String s : dirs) {
            Path directoryPath = Paths.get(s); // Replace with your directory path
            rename(directoryPath);
        }
    }

    public static void rename(Path directoryPath) {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath)) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path)) {
                    // Get the current file name
                    String oldFileName = path.getFileName().toString();
                    
                    // Generate the new file name (for example, prefixing with "new_")
                    String newFileName = oldFileName.replace(" ", "");
                    
                    // Create the path for the new file name
                    Path newFilePath = path.resolveSibling(newFileName);

                    // Rename the file
                    Files.move(path, newFilePath);
                    
                    System.out.println("Renamed: " + oldFileName + " to " + newFileName);
                }
                else if(Files.isDirectory(directoryPath)) {
                    rename(path);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

