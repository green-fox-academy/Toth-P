import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        try {
            Path filePath = Paths.get("reversed-order.txt");
            List<String> lines = Files.readAllLines(filePath);


            for (int i = lines.size(); i > 0; i--) {
                String lineOfLines = lines.get(i - 1);
                for (int j = 0; j < lineOfLines.length(); j++) {
                    System.out.print(lineOfLines.charAt(j));
                }
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }

    }
}