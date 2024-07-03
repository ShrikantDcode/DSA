package binarySearch_problems;

public class FindCeilingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 14, 16, 22, 45, 78, 90};
        int target = 47;
        int index = ceilingFromArray(arr, target);
        System.out.println("index:"+index);
        System.out.println("ceiling Number:"+(index>-1 ? arr[index] : null));

    }

    static int ceilingFromArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {

            int mid = start + (end - start) / 2;
            System.out.println(" mid "+mid);
            if(target > arr[mid]) {
                start = mid + 1;
                System.out.println(" start "+start);
            } else if(target < arr[mid]) {
                end = mid -1;
                System.out.println(" end "+end);
            } else {
                // when target == arr[mid]
                return mid;
            }

        }
        if(start > arr.length -1){
            return -1;
        } else {
            return start;
        }
    }

}
