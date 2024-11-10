package problemSolving.recursion;

public class Fibonacci {
    public static void main (String args[]) {
        for(long i=1; i<=6; i++){
            System.out.println("***");
            fibonacci(i);
        }
        System.out.println();
    }
/*
* 1 - 1
* 2 - 1
* 3 - 2
* 4 - 3
* 5 - 5
* */
    /* A recursive Fibonnaci sequence in Java program */
    public static long fibonacci(long number) {
        System.out.println("number : "+number);
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
