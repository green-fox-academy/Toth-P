public class Summing {

    public static int sum(int input) {
        int output = 0;
        for (int i = 0; i <= input; i++) {
            output = output + i;

        }
        return output;
    }

    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        int theNum = 9;
        System.out.println(sum(theNum));

    }
}
