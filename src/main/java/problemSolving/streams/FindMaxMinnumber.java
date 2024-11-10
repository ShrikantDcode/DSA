package problemSolving.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindMaxMinnumber {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 22, 11, 33, 5 };
        Stream<Integer> numbers = Arrays.stream(arr).boxed();
        Optional<Integer> max = numbers.max(Integer::compareTo);

        Integer min = Arrays.stream(arr).boxed().min(Integer::compareTo).get();
        max.ifPresent(System.out::println);
        System.out.println(" min = "+min);
    }
}
