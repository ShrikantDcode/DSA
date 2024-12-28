package problemSolving.fastAndSlowPointerMethod;

public class FindHappyNumber_mySoln {
    //number is happy number when sum of all digits of number reduces to 1
    // 23 = 4 + 9 = 13 => 1+9 = 10 => 1 + 0 = 1
    public static void main(String[] args) {
        System.out.println("given number is Happy Number: "+isHappyNumber(23));
    }

    public static boolean isHappyNumber(int num){
        int number = num, sum = 0;
        int n = number;
        int digit;
        //looping all digits of number
        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            sum += digit * digit;
            if(n == 0){ // got sum of all digits in number
                if(sum == 1){
                    return true; //System.out.println(number +" is Happy number!");
                    //break;
                } else if(sum > 1 && sum < 10) {
                    return false; //System.out.println(number+ " is NOT Happy number");
                    //break;
                } else {
                    n = sum;
                    sum = 0;
                }
            }

        }

        return false;
    }
}
