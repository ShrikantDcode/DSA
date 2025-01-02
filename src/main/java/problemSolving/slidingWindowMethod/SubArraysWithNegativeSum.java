package problemSolving.slidingWindowMethod;

import java.util.Scanner;

public class SubArraysWithNegativeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        int negativeSubarrayCount = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += array[end];
                if (sum < 0) {
                    negativeSubarrayCount++;
                }
                System.out.print("");
            }
        }

        System.out.println(negativeSubarrayCount);

        scan.close();
    }
}
