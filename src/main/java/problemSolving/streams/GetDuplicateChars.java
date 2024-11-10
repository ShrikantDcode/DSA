package problemSolving.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetDuplicateChars {
    public static void main(String[] args) {
        String s = "MyJavamy";
        //converts string to char intStream
        IntStream cIntStream = s.chars();
        //Converts int char value to Character object i.e. stream of Characters
        Stream<Character> chars = cIntStream.mapToObj(c -> Character.toLowerCase((char)c));

        //create map of character as key and occurrence as value
        Map<Character, Long> charMap = chars
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(charMap.toString());
        charMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                        .map(Map.Entry::getKey)
                                .forEach(System.out::println);

        getFirstNonRepeatingChar();
        //checkIfAllDigitAreEven2();
        checkIfAllDigitAreEven3();
    }

    static void getFirstNonRepeatingChar(){
        String s = "aaHiThere";

        s.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .ifPresentOrElse(System.out::println, () -> System.out.println("NA"));
    }

    static void checkIfAllDigitAreEven() {

        int num = 22446678;
        boolean isEven = String.valueOf(num)
                .chars()
                .map(c -> c - '0')
                .allMatch(d -> d % 2 == 0);
        System.out.println("isEven: "+isEven);

    }

    static void checkIfAllDigitAreEven2() {

        int num = 2244688;
        while(num > 0){
            int d = num % 10;
            num = num / 10;

            System.out.println(num +" "+d);
            if(d % 2 != 0){
                System.out.println("All digits are not even");
                return;
            }
        }
        System.out.println("isEven: true");

    }

    static void checkIfAllDigitAreEven3() {
        int num = 2268844;
        boolean isEven = Stream.iterate(num, n -> n >0, n -> n / 10)
                .peek(System.out::println)
                .map(n -> n % 10)
                .peek(System.out::println)
                .allMatch(digit -> digit % 2 ==0);
        System.out.println("isEven: "+isEven);
    }
}
