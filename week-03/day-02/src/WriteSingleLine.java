import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //String name = "Peter Toth";


        manipulate(name);

    }

    public static void manipulate(String name) {
        List<String> manipuleteFile = new ArrayList();
        manipuleteFile.add(name);
        //manipuleteFile.add(name);
        try {
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, manipuleteFile);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}