import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.


        String filename = "my-file.txt";

        linesInTheFile(filename);

        System.out.println(linesInTheFile(filename));
    }

    public static int linesInTheFile(String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> myFile = Files.readAllLines(filePath);
            return myFile.size();

        } catch (Exception e) {

        }
        return 0;
    }


}

