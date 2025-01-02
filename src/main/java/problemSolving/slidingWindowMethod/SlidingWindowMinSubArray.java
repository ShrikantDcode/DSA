package problemSolving.slidingWindowMethod;

public class SlidingWindowMinSubArray {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right]; // Add current element to the window

            // Shrink the window until the sum is less than the target
            while (sum >= target) {
                int subArrLength = (right - left)+1;
                minLength = Math.min(minLength, subArrLength);
                sum -= nums[left]; // Shrink the window from the left
                left++;
            }
        }

        // Return 0 if no subarray is found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        SlidingWindowMinSubArray solution = new SlidingWindowMinSubArray();
        int target = 11;
        int[] nums = {1, 2, 3, 4, 5};

        int result = solution.minSubArrayLen(target, nums);
        System.out.println("Minimum subarray length: " + result);

    }
}
