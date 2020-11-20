import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        int theNumber = 8;
        int userGuess = 0;
        do {
            System.out.println("Guess the number:");
            Scanner scanner = new Scanner(System.in);
            userGuess = scanner.nextInt();

            if (theNumber > userGuess) {
                System.out.println("The stored number is higher");

            } else if (theNumber < userGuess) {
                System.out.println("The stored number is lower");

            } else if (theNumber == userGuess) {
                System.out.println("You found the number: " + theNumber);
            }
        } while (theNumber != userGuess);
    }
}
