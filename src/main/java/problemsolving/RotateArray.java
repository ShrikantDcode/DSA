package problemsolving;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] result = rotate(new int[]{10, 20, 30, 40, 50}, 3);
        Arrays.stream(result).forEach(System.out::println);
    }
    public static int[] rotate(int[] nums, int k) {

//        {10 20 30 40 50}
//
//        50 10 20 30 40
//
//        40 50 10 20 30
//
//        30 40 50 10 20 // expected output after rotation by 3 posotopns
        int loop =0;
        while(loop< k){
            int end = nums.length -1;
            int temp = nums[0];
            nums[0] = nums[end];
            nums[end] = temp;
            loop++;
            //if(i> k) break;
        }
         return nums;
        }
    }

