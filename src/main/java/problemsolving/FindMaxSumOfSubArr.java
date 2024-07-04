package problemsolving;

public class FindMaxSumOfSubArr {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 8, 2, 1, 3, 1,2};
        int k = 3;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;
        System.out.println(maxSum);
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            System.out.println("i "+arr[i]+" k "+arr[i - k]+" currentsum:"+ currentSum);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}

