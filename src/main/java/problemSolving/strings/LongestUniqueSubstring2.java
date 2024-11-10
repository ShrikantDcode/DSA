package problemSolving.strings;

import java.util.HashMap;

public class LongestUniqueSubstring2 {
    public static String getLongestUniqueSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int maxStart = 0;  // Start index of the longest unique substring
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If character is already in the map and within the current window
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                // Move the start pointer to the right of the duplicate character
                start = charIndexMap.get(currentChar) + 1;
            }
            System.out.println(charIndexMap+" start "+start+" maxStart "+maxStart);
            // Update the latest index of the current character
            charIndexMap.put(currentChar, end);

            // Check if we have a new longest unique substring
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        // Return the longest unique substring
        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println("Longest unique substring: " + getLongestUniqueSubstring(s));
    }
}

