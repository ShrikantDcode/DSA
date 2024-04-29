package problemSolving_binarySearch;

public class FindFloorNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 14, 16, 22, 45, 78, 90};
        int target = 35;

        System.out.println(floorFromArray(arr, target));
    }

    static int floorFromArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid -1;
            } else {
                return mid;
            }

        }
        return end;
    }

}
