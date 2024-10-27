package reductionProblems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] result = findProduct(new int[]{1, 5, -2, 4});
        Arrays.stream(result).forEach(System.out::println);
    }
    public static int[] findProduct(int arr[]) {

            int[] products = new int[arr.length];
            int leftProduct =1;
            for(int i=0; i< arr.length; i++){
                int product = 1;
                // product of right elements
                for(int k=i+1; k< arr.length; k++){
                    product *= arr[k];
                }
                //product of left elements
                // for(int l =0; l <i+1; l++){
                //     if(l != i){
                //     product *= arr[l];
                //     }
                // }

                products[i] = product * leftProduct;
                leftProduct *= arr[i];

            }
            return products;
        }
    }

