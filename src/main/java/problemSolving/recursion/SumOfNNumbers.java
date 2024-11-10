package problemSolving.recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Ans : "+sum(n));

    }

    static int sum(int i){
        if(i == 1){
            return i;
        }
        return sum(i-1)+i;
    }
}
