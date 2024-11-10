package problemSolving.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetDuplicateNumbers {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 5, 2, 12, 34, 2, 11 };
        Stream<Integer> intStream = Arrays.stream(arr).boxed();
        Map<Integer, Long> m = intStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m);
        m.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
