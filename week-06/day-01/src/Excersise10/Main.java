package Excersise10;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        Write a Stream Expression to find the foxes with green color!
//        Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//        Write a Stream Expression to find the frequency of foxes by color!


        List<Fox> foxes = Arrays.asList(
                new Fox("Vuk", "Orange", 1),
                new Fox("Karak", "Gray", 3),
                new Fox("Íny", "Green", 6),
                new Fox("Kag", "Orange", 5),
                new Fox("Asixsix", "Green", 4));


        List<String> greenFoxes = foxes.stream()
                .filter(fox -> fox.getColor() == "Green")
                .map(Fox::getName)
                .collect(Collectors.toList());

        System.out.println(greenFoxes);

        List<String> greenFoxesUnder5 = foxes.stream()
                .filter(fox -> fox.getColor() == "Green")
                .filter(fox -> fox.getAge()<5)
                .map(Fox::getName)
                .collect(Collectors.toList());

        System.out.println(greenFoxesUnder5);


        Map<String, Long> foxColor = foxes.stream().collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));

        System.out.println(foxColor);


    }
}
