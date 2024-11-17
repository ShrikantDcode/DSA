package problemSolving.streams;

import java.util.HashMap;
import java.util.Map;

public class CharCountMap {

    static void showCountSequence(String str) {
        Map<Character, Long> map = new HashMap<>();
        //char current;
        str.chars().forEach(c -> map.put((char)c,map.getOrDefault((char)c, 0L)+1));
        System.out.println(">> "+map.toString());
    }
    static void showCountSequence1(String str) {

        StringBuilder reduce = str.chars()
                .mapToObj(c -> (char) c)
                .reduce(new StringBuilder(),
                        (sb, c) -> {
                            System.out.println("Current StringBuilder: " + sb + ", Current Char: " + c);
                            if (!sb.isEmpty() && sb.charAt(sb.length() - 2) == c) {
                                int count = sb.charAt(sb.length() - 1) + 1;
                                sb.replace(sb.length() - 1, sb.length(), String.valueOf(count));
                                System.out.println("Updated StringBuilder (count increment): " + sb);
                            } else {
                                sb.append(c).append(1);
                                System.out.println("Updated StringBuilder (new char): " + sb);
                            }
                            return sb;
                        },
                        StringBuilder::append);

        System.out.println("Final Result: " + reduce);
    }
    public static void main(String[] args) {
        String str="abbcccabc";
        //showTotalCount(str);
        showCountSequence1(str);
        //showCountSequence1(str);

    }
}
