package binarySearch_problems;

public class FindTwoNumbers {

    public static void main(String[] args) {
        int[] result = findSum(new int[]{2, 5, 7, 8, 20}, 12);
        System.out.println(result[0]+" "+result[1]);
    }

        public static int[] findSum(int[] arr, int k) {

            int[] result = new int[2];
            for(int i =0; i< arr.length; i++){
                int index = binarySearch(arr, k - arr[i]);
                if(index != -1 && index != i){
                    // i.e. if valid index found and index found is not same as i (first number)
                    result[0] = arr[i];
                    result[1] = arr[index];
                    break;
                }

            }
            return result;

        }

        public static int binarySearch(int[] arr, int target){
            int start = 0;
            int end = arr.length - 1;
            while(start <= end){
                int mid = start + end - start/2;
                if(arr[mid] == target){
                    return mid;
                } else if(arr[mid] < target) {
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            }
            return -1;
        }
    }

