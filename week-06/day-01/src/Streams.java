import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {


    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        List<String> strings = Arrays.asList("aBc", "", "bC", "eFg", "AbcD", "", "jKl");
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");


        // Write a Stream Expression to get the squared value of the positive numbers from the following list:
        //numbers.stream().filter(x -> x > 0).filter(x -> (x % 2) == 0).forEach(System.out::println);

        //Write a Stream Expression to get the squared value of the positive numbers from the following list:
        //numbers.stream().filter(x -> x > 0).map(x -> x * x).forEach(System.out::println);

        //Write a Stream Expression to find which number squared value is more then 20 from the following list:
        //numbers3.stream().filter(x -> (x * x) > 20).forEach(System.out::println);

        //Write a Stream Expression to get the average value of the odd numbers from the following list:
        //OptionalDouble optionalAverageOdd = numbers4.stream().filter(x -> (x % 2) != 0).mapToInt(Integer::intValue).average();
        //if(optionalAverageOdd.isPresent()){
        //    System.out.println(optionalAverageOdd.getAsDouble());
        //}else{
        //    System.out.println("nincsen");
        //}

        //Write a Stream Expression to get the sum of the odd numbers in the following list:
        //int sumOdd = numbers5.stream().filter(x -> (x % 2) != 0).mapToInt(Integer::intValue).sum();
        //System.out.println(sumOdd);


        //Write a Stream Expression to find the uppercase characters in a string!
//        String test = "HelLO WoRld";
//        List<Character> upper = test.chars()
//                .filter(Character::isUpperCase)
//                .mapToObj(e -> (char)e)
//                .collect(Collectors.toList());
//        System.out.println(upper);

        //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
//        String test = "B";
//        cities.stream()
//                .filter(s -> s.contains(test))
//                .forEach(System.out::println);

        //Write a Stream Expression to concatenate a Character list to a string!
//        List<Character> characters = Arrays.asList('s', 'a', 'g', 'f', 'u');
//        String string = characters.stream()              // Stream<Character>
//                .map(String::valueOf)   // Stream<String>
//                .collect(Collectors.joining());
//
//        System.out.println(string);

        //Write a Stream Expression to find the frequency of characters in a given string!

        String test = "Hello World";

        Map<Character, Long> frequency =
                test.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);



    }


}

