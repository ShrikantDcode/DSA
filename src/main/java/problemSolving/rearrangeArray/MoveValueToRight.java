package problemSolving.rearrangeArray;

import java.util.Arrays;

public class MoveValueToRight {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 5, 8, 0, 3, 0};
        removeElement(arr, 0);
        System.out.println("Final Array: " + Arrays.toString(arr));
    }
    public static int removeElement(int[] nums, int valueToMove) {
        //int valueToMove = 3;

        int insertPos = 0, validNumberLength = 0, count = 0; // Position to insert non-value elements

        // Move non-value elements to the left side
        for (int num : nums) {
            if (num != valueToMove) {
                nums[insertPos++] = num;
                count++;
            }
        }
        validNumberLength = insertPos;
        // Fill remaining positions with the specified value
        while (insertPos < nums.length) {
            nums[insertPos++] = valueToMove;
        }
        System.out.println(validNumberLength);
        resizeArray(nums, validNumberLength);
        return count;
    }

    static void resizeArray(int[] nums, int pos){
        int[] newArr = Arrays.copyOf(nums, pos);
        System.out.println("new trimmed array: "+Arrays.toString(newArr));
    }
}