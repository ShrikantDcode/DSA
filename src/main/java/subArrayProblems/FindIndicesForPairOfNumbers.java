package subArrayProblems;

import java.util.HashMap;

public class FindIndicesForPairOfNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, -11, 3, -6, 4};
        int target = 9;
        int[] result = findIndices(nums, target);
        System.out.println("result = " +result[0]+" "+ result[1]);
    }
    static int[] findIndices(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>(2);
        for(int i =0; i< arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }
            map.put(arr[i],i);
            System.out.println(map +" "+complement);

        }

        return new int[]{-1, -1}; // empty array
    }
}
