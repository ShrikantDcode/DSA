package rearrangeArray;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] result = rotate(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rotate(int[] nums, int k) {
        if (nums.length == 0) {
            k = 0;
        } else {
            //if k > array length reminder will be considered, deducting one rotaion
            k = k % nums.length;
        }

        //shift k elements from left
        int[] rotatedArray = new int[nums.length];
        for(int i=0; i< k; i++){
            rotatedArray[i] = nums[nums.length - k +i];
            System.out.println(Arrays.toString(rotatedArray));
        }

        //shift 0 to k th position elements
        for(int i = k; i< nums.length; i++){
            rotatedArray[i] = nums[i -k];
            System.out.println(Arrays.toString(rotatedArray));
        }

        return rotatedArray;

    }

    public static int[] rotateBySliceShift(int[] nums, int k){
        if (nums.length == 0) {
            k = 0;  // If the list is empty, no rotation needed
        } else {
            k = k % nums.length;  // Calculate effective rotation amount
        }

        // Perform rotation by slicing the array
        int[] rotatedArray = new int[nums.length];
        System.arraycopy(nums, nums.length - k, rotatedArray, 0, k);
        System.arraycopy(nums, 0, rotatedArray, k, nums.length - k);

        return rotatedArray;
    }
}

