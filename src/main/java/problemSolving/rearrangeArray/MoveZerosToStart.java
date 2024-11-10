package problemSolving.rearrangeArray;

import java.util.Arrays;

import java.util.Arrays;

public class MoveZerosToStart {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 5, 8, 0, 3, 0};
        moveZerosToStart(arr);
        System.out.println("Final Array: " + Arrays.toString(arr));
    }

    public static void moveZerosToStart(int[] arr) {
        int insertPos = arr.length - 1;

        // Move non-zero elements to the end
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos--;
            }
        }

        // Fill the beginning of the array with zeros
        while (insertPos >= 0) {
            arr[insertPos] = 0;
            insertPos--;
        }
    }
}
