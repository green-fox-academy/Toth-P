import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String... args) {
        //Create an empty list which will contain names (strings)
        List<String> names = new ArrayList<>();

        //Print out the number of elements in the list
        System.out.println(names);

        //Add William to the list
        names.add("William");

        //Print out whether the list is empty or not
        boolean empty = names.isEmpty();
        if (!empty) {
            System.out.println("The list isn't empty");
        } else {
            System.out.println("The list is empty");
        }

        //Add John to the list
        names.add("John");

        //Add Amanda to the list
        names.add("Amanda");

        //Print out the number of elements in the list
        int numOfElements = names.size();
        System.out.println("The number of elements in the list: " + numOfElements);

        //Print out the 3rd element
        String nthElement = names.get(2);

        System.out.println(nthElement);
        //System.out.println(names.get(2));


        //Iterate through the list and print out each name
        for (String theNames : names) {
            System.out.println(theNames);

        }

        //Iterate through the list and print
        int ind = 1;
        for (String theNames : names) {
            System.out.println(ind + ". " + theNames);
            ind = ind + 1;
        }

        //Remove the 2nd element
        names.remove(1);

        //Iterate through the list in a reversed order and print out each name
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        //Remove all elements
        names.clear();

    }
}
