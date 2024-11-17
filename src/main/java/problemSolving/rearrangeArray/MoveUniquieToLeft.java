package problemSolving.rearrangeArray;

import java.util.Arrays;

public class MoveUniquieToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

   static public int[] removeDuplicates(int[] arr) {
       int uniqueIndex = 0; // Index for placing unique elements

       for (int i = 0; i < arr.length; i++) {
           // If the current element is unique (either the first element or different from previous)
           if (i == 0 || arr[i] != arr[i - 1]) {
               arr[uniqueIndex++] = arr[i];
           }
       }

       // Fill the rest with duplicate elements (arbitrary choice as 0, could be other placeholder if needed)
       for (int i = uniqueIndex; i < arr.length; i++) {
           arr[i] = 0; // Optional: Change to a placeholder or simply retain the duplicates if needed
       }
       return arr;
   }
}
