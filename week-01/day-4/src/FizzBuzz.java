public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.

        for (int i = 1; i <=100 ; i++) {

            int multi3 = i % 3;
            int multi5 = i % 5;

            boolean mult3 = multi3 == 0;
            boolean mult5 = multi5 == 0;

            if (mult3 && mult5){
                System.out.println("FizzBuzz");
            }
            else if (mult3){
                System.out.println("Fizz");
            }
            else if (mult5){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

}
