import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String... args) {
        //Create a list ('List A') which contains the following values
        List<String> fruits1 = new ArrayList<>();

        fruits1.add("Apple");
        fruits1.add("Avocado");
        fruits1.add("Blueberries");
        fruits1.add("Durian");
        fruits1.add("Lychee");

        //Create a new list ('List B') with the values of List A
        List<String> fruits2 = new ArrayList<>();

        fruits2.addAll(fruits1);

        //Print out whether List A contains Durian or not

        boolean contDurian = fruits1.contains("Durian");

        if (contDurian) {
            System.out.println("List A contains Durian");
        } else {
            System.out.println("List A don't contains Durian");
        }

        //Remove Durian from List B

        fruits2.remove("Durian");

        //Add Kiwifruit to List A after the 4th element

        fruits1.add(4, "Kiwifruit");

        //Compare the size of List A and List B

        boolean compareSize = fruits1.size() == fruits2.size();

        //Get the index of Avocado from List A

        fruits1.indexOf("Avocado");
        System.out.println("The index of Avocado: " + fruits1.indexOf("Avocado"));

        //Get the index of Durian from List B

        fruits2.indexOf("Durian");
        System.out.println("The index of Durian: " + fruits2.indexOf("Durian"));

        //Add Passion Fruit and Pomelo to List B in a single statement

        List<String> fruits3 = new ArrayList<>();
        fruits3.add("Passion Fruit");
        fruits3.add("Pomelo");

        fruits2.addAll(fruits3);

        //Print out the 3rd element from List A

        System.out.println("The 3rd element of List A: " + fruits1.get(2));

        System.out.println(fruits1);
        System.out.println(fruits2);

    }
}

