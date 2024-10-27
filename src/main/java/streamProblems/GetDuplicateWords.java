package streamProblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetDuplicateWords {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java 8 introduces functional programming",
                "Functional programming is powerful",
                "Learn Java 8 features"
        );
        //getDuplicateWordsTrivial(sentences);
        //getDuplicateWordsJava8(sentences);
        getDuplicateWordsWay2(sentences);
    }

    private static void getDuplicateWordsJava8(List<String> sentences) {
        //get list of all words
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // get duplicate words
        Set<String> duplicates = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) //map
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

    }

    private static void getDuplicateWordsWay2(List<String> sentences) {
        //get list of all words
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // get duplicate words
        Set<String> duplicates = words.stream()
                .filter(x -> Collections.frequency(words, x) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

    }
    private static void getDuplicateWordsTrivial(List<String> sentences) {
        List<String> words = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();

        for(String sentence: sentences){
            String[] sArr = sentence.split(" ");
            for(String s: sArr){
                m.put(s.toLowerCase(), m.getOrDefault(s.toLowerCase(), 0)+1);
            }
        }

        System.out.println(words.toString());
        System.out.println(m);
        m.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key);
            }
        });
    }
}
