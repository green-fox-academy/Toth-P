import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30

        System.out.println("Type a number:");
        Scanner scanner = new Scanner(System.in);
        int scanNum = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            int equal = i * scanNum;

            System.out.println(i + " * " + scanNum + " = " + equal);
        }
    }
}
