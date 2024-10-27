package binarySearchProblems;


import java.util.Arrays;

public class FindFirstAndLastIndexOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,7,7,7,7,8,8,9};
        int target = 7; // expected ans {2, 5};
        int[] ans = {-1, -1}; //default ans if target not found
        ans[0] = searchFirstIndex(arr, target);
        ans[1] = searchLastIndex(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int searchFirstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                // when target == arr[mid]
                ans = mid;
                //star another set of iterations for binary search on left chunk
                end = mid -1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }

        }
        return ans;
    }

    public static int searchLastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                // when target == arr[mid]
                ans = mid;
                //star another set of iterations for binary search on right chunk
                start = mid + 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }

        }
        return ans;
    }
}
