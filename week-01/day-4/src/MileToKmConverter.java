import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        System.out.println("Type the number of miles you want to convert to kilometers:");
        Scanner scanner = new Scanner(System.in);
        double userInputMiles = scanner.nextDouble();

        double uIKilometer = userInputMiles *1.6;
        System.out.println(uIKilometer + "kilometers");

    }
}
