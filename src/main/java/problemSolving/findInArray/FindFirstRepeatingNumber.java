package problemSolving.findInArray;
//IN Progress
public class FindFirstRepeatingNumber {
    public static void main(String[] args) {
        System.out.println(findFirstRepeatingNumber(new int[]{1,2,2, -6}));
    }
    //Brute force tenchnique
   public static int findFirstRepeatingNumber(int[] nums) {
            //to traverse whole array
            for(int p1=0; p1< nums.length; p1++){
                int p2 =0; // pointer for second number to compare with p1
                while(p2 < nums.length){
                    if(p1 != p2 && nums[p1] == nums[p2]) {// repeating number found at p2 index
                        return nums[p1];
                    }
                    p2++;
                }
            }
            return -1;
        }

    }
    

