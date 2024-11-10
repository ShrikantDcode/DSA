package problemSolving.interviewFaqs;

public class Fibonacci2 {
    public static void main(String[] args) {
        int n = 6;
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series for n = " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}

