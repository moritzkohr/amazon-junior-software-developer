import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DirectoryManager {
    public static void listFilesAndDirectories(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            // If it is empty or null, print an appropriate message indicating the same
            System.out.println("No files or directories found in the directory");
        } else {
            // If not, loop through the array and print each file's name
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    public static void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            // If the directory does not exist, create the directory using the mkdirs() method from the File class
            if (!directory.mkdirs()) {
            }
            // Print a message indicating that the directory was created
            System.out.println("Directory created successfully: " + directoryPath);
        } else {
            // If the directory already exists, print a message indicating the same
            System.out.println("Failed to create directory");
            return;
        }
    }

    public static void renameDirectory(String currentDirectory, String newDirectory) {
        File oldDir = new File(currentDirectory);
        File newDir = new File(newDirectory);

        if (newDir.exists()) {
            System.err.println("Error: The new directory name already exists.");
        }

        if (!oldDir.renameTo(newDir)) {
            // If the rename fails, print an error message
            System.err.println("Failed to rename directory.");

        } else {
            // If the rename is successful, print a success message
            System.out.println("Directory has been renamed successfully.");

        }
    }

    public static void copyFiles(String sourceDir, String destDir) {
        Path sourcePath = Paths.get(sourceDir);
        Path destPath = Paths.get(destDir);

        try {
            if (!Files.exists(destPath)) {
                // If the destination directory does not exist, create the directory using the createDirectories() method from the Files class
                Files.createDirectory(destPath);
            }

            File sourceDirectory = new File(sourceDir);
            File[] files = sourceDirectory.listFiles();
            // For each file, create a Path object using the file's name and the destDir
            for (File file : files) {

                // Use the copy() method from the Files class to copy the file to the destination directory
                Files.copy(sourcePath.resolve(file.getName()), destPath.resolve(file.getName()));
                // Print a message indicating that the file was copied
                System.out.println("File copied successfully: " + file.getName());

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);

        if (file.delete()) {
            // If the file is deleted successfully, print a message indicating the same
            System.out.println("File deleted successfully: " + fileName);
        } else {
            // If the file deletion fails, print an error message
            System.err.println("Failed to delete file: " + fileName);
        }
    }

}

