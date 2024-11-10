package problemSolving.interviewFaqs;

public class PalindromeStringSpecialChar {
    public static void main(String[] args) {
        String s = "a@b#bdg%ba"; //ignore special char
        System.out.println("is Palindrome: "+ checkIfPalindrome(s));
    }
    static boolean checkIfPalindrome(String s){
        int left = 0, right = s.length() -1;
        while(left < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
