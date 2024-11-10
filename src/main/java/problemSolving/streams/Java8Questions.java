package problemSolving.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Questions {
    public static void main(String[] args) {
        // sum of all numbers
        int[] nums = {3, 4, 1, 7, 8};
        int sum = Arrays.stream(nums).boxed()
                .collect(Collectors.summingInt(Integer::intValue))
                .intValue();
        System.out.println("SUM= "+sum);
        int sum2 = Arrays.stream(nums).boxed()
                .reduce(0, (x, y) -> x + y)
                .intValue();
        System.out.println("SUM= "+sum2);

        //sort words in increasing order of length and remove duplicate words
        List<String> sentences = Arrays.asList(
                "Java 8 introduces functional programming",
                "Functional programming is powerful",
                "Learn Java 8 features"
        );

        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(words);

        //reverse each word in sentence
        String line = "Java 8 introduces functional  programming";
        String s1 = Arrays.stream(line.split("\\s+"))
                .map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(s1);

        //wrap number in brackets
        line = "Java 8 introduces 3 changes ";
        String result = Arrays.stream(line.split("\\s+"))
                .map(s -> s.matches("\\d+") ? "("+s+")" : s)
                .collect(Collectors.joining(" "));
        System.out.println(result);

    }
}
