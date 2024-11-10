package problemSolving.binarySearch;

public class FindCeilingCharactor {
    public static void main(String[] args) {
        String input = "cfj"; //sorted
        char target = 'd';
        char[] arr = input.toCharArray();
        System.out.println("Ans= "+findNextChar2(arr, target));
    }

    static char findNextChar(char[] arr, char target){
        if(target > arr[arr.length -1]) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else if(target == arr[mid]){
                return mid+1 > arr.length-1 ? arr[0] : arr[mid+1];
            }

        }

        return arr[start];
    }

    static char findNextChar2(char[] arr, char target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target >= arr[mid]){
                start = mid + 1;
            }

        }

        return arr[start % arr.length];
    }
}
