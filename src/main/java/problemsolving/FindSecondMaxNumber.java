package problemsolving;

public class FindSecondMaxNumber {
    public static void main(String[] args) {
        System.out.println(findSecondMaximum(new int[]{2, 4, 0, -1, 8}));
    }
    public static int findSecondMaximum(int[] nums) {

            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for(int n: nums){
                if(n > firstMax){
                    secondMax = firstMax; //assigning max value so far before assigning value greater than current max
                    firstMax = n;
                } else if(n > secondMax && n != firstMax){
                    secondMax = n;
                }
            }


            return secondMax;
        }
    }

