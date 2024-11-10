package problemSolving.streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
        int secondMax = Arrays.stream(arr).boxed()
                            .sorted(Comparator.reverseOrder())
                            //.skip(1)
                            .findAny()
                            .get();
        System.out.println(secondMax);
    }
}
