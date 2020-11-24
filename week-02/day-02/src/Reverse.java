public class Reverse {

    public static String reverse(String input) {

        String output = "";

        for (int i = input.length()-1; i >= 0; i--) {
            output = output + input.charAt(i);

        }
        return output;
    }



    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(toBeReversed));


    }
}
