package problemSolving.interviewFaqs;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        // Compare the original number with the reversed number
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int number = 252;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

