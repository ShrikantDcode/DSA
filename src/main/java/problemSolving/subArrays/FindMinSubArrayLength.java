package problemSolving.subArrays;

public class FindMinSubArrayLength {
    public static void main(String[] args) {
        int[] nums = {5,1,3,5,10,7,4,9,2,8};
        int target = 15;
        System.out.println("Ans= "+minSubArrayLen(target, nums));
    }
    // not working for sum greater than equal to target
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = 0;
        for(int i = 0; i < nums.length; i++){
            int subArrLength =0, sum = 0;
            for(int j = i; j < nums.length; j++) {
                if(sum < target) {
                    sum += nums[j];
                    subArrLength++;
                    if(i == 0 && sum >= target){
                        minLength = subArrLength;
                    }
                }
            }
            if( subArrLength < minLength && sum >= target){
                minLength = subArrLength;
            }
            if(subArrLength == nums.length && sum < target){
                return 0;
            }

        }
        return minLength;
    }
}
