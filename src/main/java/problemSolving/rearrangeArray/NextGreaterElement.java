package problemSolving.rearrangeArray;

public class NextGreaterElement {
    public static void main(String[] args) {
               int[] arr = {2, 8, 5, 4, 9, 1}; // input
                   //output 8 9 9 9 -1 -1
                for (int i = 0; i < arr.length; i++) {
                    int nextGreater = -1;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] > arr[i]) {
                            nextGreater = arr[j];
                            break;
                        }
                    }
                    arr[i] = nextGreater;
                }
                // Print the output array
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
