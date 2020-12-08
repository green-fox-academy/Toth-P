import java.util.Arrays;

public class SubInt {


    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[]{1, 11, 34, 52, 61})));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function as a way to print
        // array returned from subInt(). You could just as well iterate over array to print it.


    }

    private static int[] subInt(int a, int[] ints) {

        int arrNum = 6;
        int[] out = new int[arrNum];
        for (int j = 0; j < out.length; j++) {

            for (int i = 0; i < ints.length; i++) {
                String b = String.valueOf(ints[i]);
                if (b.contains(String.valueOf(a))) {
                    out[j] = i + 1;
                    arrNum++;
                    break;
                }

            }
        }
        return out;


    }
}