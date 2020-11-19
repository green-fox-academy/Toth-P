public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22

        // Print the result of 13 substracted from 22

        // Print the result of 22 multiplied by 13

        // Print the result of 22 divided by 13 (as a decimal fraction)

        // Print the integer part of 22 divided by 13

        // Print the remainder of 22 divided by 13

        long num1 = 22;
        long num2 = 13;

        long add = num1 + num2;
        long sub = num1 - num2;
        long mult = num1 * num2;
        double div = (double) num1 / num2;
        //long rem = num1-((num1 / num2) * num2) ; Először olvass utána gondolkozz !!!
        long rem = num1 % num2;


        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println((int) div);
        System.out.println(rem);
    }
}
