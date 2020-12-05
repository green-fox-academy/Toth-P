import java.util.ArrayList;

public class Fibonacci {
    // The fibonacci sequence is a famous bit of mathematics,
    // and it happens to have a recursive definition.
    // The first two values in the sequence are 0 and 1 (essentially 2 base cases).
    // Each subsequent value is the sum of the previous two values,
    // so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    // Define a recursive fibonacci(n) method that
    // returns the nth fibonacci number,
    // with n=0 representing the start of the sequence.


    public static void main(String[] args) {


        for (int i = 0; i < 15; i++) {
            System.out.println(fibonacciNth(i));
        }


    }


    public static int fibonacciNth(int nthNumber) {
        if (nthNumber <= 0) {
            return 0;
        } else if (nthNumber == 1) {
            return 1;
        }

        return fibonacciNth(nthNumber - 2) + fibonacciNth(nthNumber - 1);

    }


}




