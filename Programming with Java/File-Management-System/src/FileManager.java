import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class FileManager {

    // Define the copyFile method with two parameters: sourcePath and targetPath
    private static void copyFile(String sourcePath, String targetPath) {

        // Convert the sourcePath string into a Path object
        Path source = Paths.get(sourcePath);
        Path target = Paths.get(targetPath);

        // Use a try-catch block to handle potential I/O exceptions
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully from " + sourcePath + " to " + targetPath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Main method to test the copyFile function
    public static void main(String[] args) {
        // Specify the source and target file paths
        String sourceFile = "./source_folder/textFile1.txt";
        String targetFile = "./target_folder/textFile1.txt";

        // Call the copyFile method with the specified source and target paths
        copyFile(sourceFile, targetFile);
    }
}
