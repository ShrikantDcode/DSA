package problemsolving;

import java.util.Arrays;

public class FindMaxSumOfSubArrNoSize {
    public static void main(String[] args) {
        //System.out.println(findMaxSumSubArray(new int[]{3, 4, 5, -8, 2, 1}));
        int[][] inputs = {
                {1, 2, 2, 3, 3, 1, 4},
                {5, 4, 5, -8, 2, 1},
                {4, 1, 2, 1, 2},
                {-4, -1, -2, -1, -2},
                {-4, 2, -5, 1, 2, 3, 6, -5, 1},
                {25}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tArray: " + Arrays.toString(inputs[i]));
            System.out.println("\tMaximum Sum: " + findMaxSumSubArray(inputs[i]));
            System.out.println(new String(new char[75]).replace('\0', '-'));
        }
    }
    public static int findMaxSumSubArray(int[] nums) {

            int currentMax = nums[0];
            int globalMax = nums[0];
            for(int i = 1; i< nums.length; i++){
                System.out.println("currentMax: "+currentMax+" nums[i]: "+nums[i]);
                if(currentMax < 0) {
                    currentMax = nums[i];
                } else {
                    currentMax += nums[i];
                }
                if(currentMax > globalMax){
                    globalMax = currentMax;
                }

            }
            return globalMax;
        }
    }

