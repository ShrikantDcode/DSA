package rearrangeArray;

import java.util.Arrays;

public class MoveZerosToStart {
    public static void main(String[] args) {
        int[] arr = {1,0, 2, 0, 0, 5, 8,0,3,0};
        int count = 0;  // Count of non-zero elements

        // Traverse the array and move non-zero elements to the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[arr.length - 1 - count] = arr[i];
                count++;
            }
            System.out.println(Arrays.toString(arr));
        }

        // Fill the beginning of the array with zeros
        for (int i = 0; i < arr.length - count; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }



}
