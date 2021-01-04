package fileRead;

import Excersise10.Fox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        mostCommonWords();
    }

    public static void mostCommonWords() {

        Path textPath = Paths.get("Wiki.txt");

        List<String> example = new ArrayList<>();
        try {
            example = Files.readAllLines(textPath);
        } catch (IOException e) {
            System.out.println("File does not exist!");
            System.exit(1);
        }

        String text;
        text = example.toString();
        List<String> wordsList = Arrays.asList(text.split("\\W+"));


        Map<String, Long> top100 = wordsList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
              //.sorted().limit(100).forEach(System.out::println);


    }
}