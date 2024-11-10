package problemSolving.interviewFaqs;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abbdbba";
        System.out.println("is Palindrome: "+ checkIfPalindrome(s));
    }
    static boolean checkIfPalindrome(String s){
        int left = 0, right = s.length() -1;
        while(left < right){
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
