package binarySearchProblems.searching;

public class BinarySearch implements searchable {
    @Override
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        if(arr[start] < arr[end]) {
            return searchAsc(arr, start, end, target);
        } else if(arr[start] > arr[end]) {
            return searchDesc(arr, start, end, target);
        } else {
            return -100; //array is not sorted
        }
    }

    @Override
    public int searchAsc(int[] arr, int start, int end, int target) {
        System.out.println("Searching in asc ordered array");
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        // we reach here when element not present in an array
        return -1;

    }

    @Override
    public int searchDesc(int[] arr, int start, int end, int target) {
        System.out.println("Searching in desc ordered array");
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // we reach here when element not present in an array
        return -1;
    }

    @Override
    public int searchInfiniteAarray(int[] arr, int target) {
        //start with box of size 2
        int start = 0;
        int end = 1;
        try {
            int[] newIndices = resizeArray(arr, start, end, target);
            start = newIndices[0];
            end = newIndices[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            //when array size is shorter than doubled end index
            end = start+1;

            int[] newIndices = resizeByOne(arr, start, end, target);
            start = newIndices[0];
            end = newIndices[1];
            return searchAsc(arr, start, end, target);
        }

        return searchAsc(arr, start, end, target);
    }

    private int[] resizeArray(int[] arr, int start, int end, int target) {
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;

            start = temp;

        }
        return new int[]{start, end};
    }

    private int[] resizeByOne(int[] arr, int start, int end, int target) {
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1);

            start = temp;
        }
        return new int[]{start, end};
    }
}



