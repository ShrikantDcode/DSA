package problemSolving.binarySearch.searching;

public class Test {
    public static void main(String[] args) {
        searchable iSearch = new BinarySearch();
        int[] arr = {1, 5, 14, 16, 22, 45, 78, 90};
        //int[] arr = {90, 78, 45, 22, 16, 6, 5, 1};
        int target = 16;
        //search target number in sorted (asc or dsc ordered) array
        int indexOfTarget =  iSearch.search(arr, target);

        System.out.println(indexOfTarget);
    }
}
