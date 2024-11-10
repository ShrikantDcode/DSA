package problemSolving.binarySearch.searching;

public interface searchable {
     int search(int[] arr, int target);
     int searchAsc(int[] arr, int start, int end, int target);
     int searchDesc(int[] arr, int start, int end, int target);

     int searchInfiniteAarray(int[] arr, int target);
}
