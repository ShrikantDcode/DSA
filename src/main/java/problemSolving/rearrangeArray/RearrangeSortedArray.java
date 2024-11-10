package problemSolving.rearrangeArray;

import java.util.Arrays;

public class RearrangeSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int end = arr.length -1;
        int[] newArr = new int[arr.length];
        //loop for even indices
        for(int i =0; i< arr.length -1; i++){
            if(i % 2 == 0){
                newArr[i] = arr[end - i];
            } else {
                newArr[i+1] = arr[i];
            }
            System.out.println(Arrays.toString(newArr));
        }
    }
}
