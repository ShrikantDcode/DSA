package binarySearchProblems.searching;

public class TestBinarySearchInfiniteArray {
    public static void main(String[] args) {
        searchable iSearch = new BinarySearch();
        int[] arr = {1, 5, 14, 16, 22, 45, 78, 90, 112, 120, 140,233};
        //int[] arr = {90, 78, 45, 22, 16, 6, 5, 1};
        int target = 233;
        //search target number in infinite array i.e. without using arr.length
        int indexOfTarget =  iSearch.searchInfiniteAarray(arr, target);

        System.out.println("ans= "+indexOfTarget);
    }
}
