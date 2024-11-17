package problemSolving.interviewFaqs;

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = "j,:mj";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase();//.replaceAll("[^a-z0-9]","");
        int left =0, right = s.length() - 1;
        while(left <= right) {
            while(left <= right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left <= right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}