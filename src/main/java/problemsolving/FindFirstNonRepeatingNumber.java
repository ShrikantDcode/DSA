package problemsolving;
//IN Progress
public class FindFirstNonRepeatingNumber {
    public static void main(String[] args) {
        System.out.println(findFirstUnique(new int[]{2,2, -6}));
    }
    //Brute force tenchnique
   public static int findFirstUnique(int[] nums) {
            //to traverse whole array
            for(int p1=0; p1< nums.length; p1++){
                int p2 =0; // pointer for second number to compare with p1
                while(p2 < nums.length){
                    if(p1 != p2 && nums[p1] == nums[p2]) {// repeating number found at p2 index
                        break;
                    }
                    p2++;
                }
                // p2 reached end of nums array, didn't find any matching number hence was not breaked loop
                if(p2 == nums.length) {
                    return nums[p1];
                }
            }
            return -1;
        }

    }


