import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String... args) {
        //Create an empty map where the keys are integers and the values are characters

        Map<Integer, Character> firstMap = new HashMap<>();

        //Print out whether the map is empty or not
        boolean empty = firstMap.isEmpty();
        if (!empty) {
            System.out.println("The map isn't empty");
        } else {
            System.out.println("The map is empty");
        }

        //Add the following key-value pairs to the map

        firstMap.put(97, 'a');
        firstMap.put(98, 'b');
        firstMap.put(99, 'c');
        firstMap.put(65, 'A');
        firstMap.put(66, 'B');
        firstMap.put(67, 'C');

        //Print all the keys

        for (int theKey : firstMap.keySet()) {

            System.out.println(theKey);
        }

        //Print all the values
        for (Character theValue : firstMap.values()) {

            System.out.println(theValue);
        }

        //Add value D with the key 68

        firstMap.put(68, 'D');

        //Print how many key-value pairs are in the map

        for (int theKey : firstMap.keySet()) {
            Character theValue = firstMap.get(theKey);
            System.out.println(theKey + " " + theValue);
        }

        //Print the value that is associated with key 99

        System.out.println("The value of key 99 : " + firstMap.get(99));

        //Remove the key-value pair where with key 97

        firstMap.remove(97);

        //Print whether there is an associated value with key 100 or not

        boolean searchForKey = firstMap.containsKey(100);

        if (searchForKey) {
            System.out.println("there is an associated value with key 100 and the value is : " + firstMap.get(100));
        }
        else{
            System.out.println("there isn't an associated value with key 100");
        }

        //Remove all the key-value pairs

        firstMap.clear();
    }
}
