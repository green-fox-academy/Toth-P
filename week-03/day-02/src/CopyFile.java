import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        String fileName = "my-file.txt";

        String newName = "my-file2.txt";
        original(fileName, newName);
        System.out.println(original(fileName, newName));

    }

    public static boolean original(String fileName, String newName) {
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            Path newFilePath = Paths.get(newName);
            Files.write(newFilePath, lines);
            return true;
        } catch (Exception e) {
            return false;
        }

    }


}

