package problemSolving.strings;

import java.util.HashMap;

public class AanagramStrings {
    public static void main(String[] args) {
        String s1 = "mangooaamgcdefghijklmnopqrstuvwxyzg";
        String s2 = "imnogomgcjklmanxyzgoaadefghpqrstuvw";
        System.out.println("Is anagrams: "+isAnagram(s1, s2));
        System.out.println("Is anagrams 2: "+isAnagramWithMap(s1, s2));
    }

    static boolean isAnagram(String a, String b) {
        // Remove whitespaces and convert strings to lowercase
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        // If lengths don't match, they're not anagrams
        if (a.length() != b.length()) return false;

        // Create a frequency array for characters
        int[] charCount = new int[26]; // Assuming only lowercase a-z characters

        // Increment count for characters in `a` and decrement for characters in `b`
        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++;
            charCount[b.charAt(i) - 'a']--;
            System.out.print("");
        }

        // Check if all values in charCount array are zero
        for (int count : charCount) {
            if (count != 0) return false;
        }

        return true;
    }

    static boolean isAnagramWithMap(String a, String b){
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        // If lengths don't match, they're not anagrams
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<a.length(); i++){
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
            map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0)-1);
            System.out.print("");
        }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
