import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {

        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `numbers`
        // - Print the elements of the reversed `numbers`

        int[] numbers = {3, 4, 5, 6, 7};
        int lengthNum = numbers.length - 1;
        int[] reverseNumbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            reverseNumbers[lengthNum] = numbers[i];
            lengthNum--;
        }

        System.out.println(Arrays.toString(reverseNumbers));
    }
}
