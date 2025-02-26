package problemSolving.fastAndSlowPointerMethod;
import java.util.*;

public class FindOnlyDuplicateNumber  {
        public static int findDuplicate(int[] nums) {
            int fast = nums[0];
            int slow = nums[0];

            while (true) {
                slow = nums[slow];
                fast = nums[nums[fast]];

                if (slow == fast) {
                    break;
                }
            }

            slow = nums[0];

            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return fast;
        }
        // Driver code
        public static void main(String[] args) {
            int[][] nums = {
                    {1, 3, 2, 3, 5, 4},
                    {2, 4, 5, 4, 1, 3},
                    {1, 6, 3, 5, 1, 2, 7, 4},
                    {1, 2, 2, 4, 3},
                    {3, 1, 3, 5, 6, 4, 2}
            };
            for (int i = 0; i < nums.length; i++) {
                System.out.print(i + 1);
                System.out.println(".\tnums = "+ Arrays.toString(nums[i]));
                System.out.println("\tDuplicate number = "+ findDuplicate(nums[i]));
                System.out.println(new String(new char[100]).replace('\0', '-'));
            }
        }
    }
