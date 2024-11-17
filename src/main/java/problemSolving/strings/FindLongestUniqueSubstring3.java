package problemSolving.strings;

import java.time.LocalDateTime;
import java.util.HashSet;

public class FindLongestUniqueSubstring3 {
    public static void main(String[] args) {
        String s = "xxyxyzabcddbb";
        //System.out.println(lengthOfLongestSubstring(s));
        long startTime = System.currentTimeMillis();
        int result = lengthOfLongestSubstring_v2(s);
        System.out.println("Length of longest substring: " + result);
        // Log the end time
        long endTime = System.currentTimeMillis();
        // Calculate and display time spent
        System.out.println("Time Spent: " + (endTime - startTime) + " ms");
    }
    //O(n*m)
 public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
     if(s.isEmpty())
         return 0;
     if(n == 1)
         return 1;

     int maxLength = Integer.MAX_VALUE;
     for(int i =0; i < n; i++){
         StringBuilder sb = new StringBuilder();
         for(int j = i; j < n; j++){
             if(sb.toString().contains(String.valueOf(s.charAt(j)))){
                 j = j+ sb.length() -1;
                 break;
             } else {
                 sb.append(s.charAt(j));
             }
         }
         if(maxLength == Integer.MAX_VALUE) {
             maxLength = sb.length();
         }
         /*
         option 1
         if(sb.length() > maxLength) {
             maxLength = sb.length();
         }
         option 2
         */
         maxLength = Math.max(maxLength, sb.length());

     }
     return maxLength;
    }

    //optimised version O(n log n)
    public static int lengthOfLongestSubstring_optimised(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int maxLength = 0;
        int left = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < n; right++) {
            // Shrink the window if the character is already in the set
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            // Add the character to the current window
            seen.add(s.charAt(right));
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
            System.out.print(" maxLength: "+maxLength+" sub: "+s.substring(left, right+1));
        }
        System.out.println();
        return maxLength;
    }

    public static int lengthOfLongestSubstring_v2(String s) {
        int n = s.length();
        if(s.isEmpty())
            return 0;
        if(n == 1)
            return 1;

        int maxLength = Integer.MAX_VALUE, left =0;
        for(int i =0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            while(sb.toString().contains(String.valueOf(s.charAt(i)))){
                    sb.delete(left, i-1);
                    left++;
                }
                    sb.append(s.charAt(i));


            if(maxLength == Integer.MAX_VALUE) {
                maxLength = sb.length();
            }

            maxLength = Math.max(maxLength, sb.length());

        }
        return maxLength;
    }
}