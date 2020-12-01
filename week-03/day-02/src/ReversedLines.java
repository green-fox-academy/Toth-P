import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        try {
            Path filePath = Paths.get("reversed-lines.txt");
            List<String> lines = Files.readAllLines(filePath);


            for (int i = 0; i < lines.size(); i++) {
                String lineOfLines = lines.get(i);
                for (int j = lineOfLines.length(); j > 0; j--) {
                    System.out.print(lineOfLines.charAt(j - 1));
                }
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }


    }
}