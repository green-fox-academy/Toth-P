import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt 

        try {
            Path filePath = Paths.get("duplicated-chars.txt");
            List<String> lines = Files.readAllLines(filePath);


            for (int i = 0; i < lines.size(); i++) {
                String lineOfLines = lines.get(i);
                for (int j = 0; j < lineOfLines.length(); j = j + 2) {
                    System.out.print(lineOfLines.charAt(j));
                }
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }

    }
}