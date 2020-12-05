
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumFinder {
    // Write a function that finds the largest element of an array using recursion.

    public static void main(String[] args) {
        Integer[] list = {3, 5, 48, 34, 12, 1, 3, 45, 2};
        List<Integer> intList = new ArrayList<>(Arrays.asList(list));

        Integer max = intList.get(0);
        System.out.println(largestNumber(intList, max));
    }

    public static int largestNumber(List<Integer> list, Integer max) {

        if (list.get(0) > max) {
            max = list.get(0);
        }

        if (list.size() == 1) {

            return max;
        }
        System.out.println(list);
        list.remove(0);

        return largestNumber(list, max);
    }

}
