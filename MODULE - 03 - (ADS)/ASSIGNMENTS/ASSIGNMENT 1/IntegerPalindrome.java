import java.util.Scanner;

public class IntegerPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Read the input integer

        // Check if the number is a palindrome and print the result
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
			
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close(); // Close the scanner
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int reversed = 0; // Variable to hold the reversed number
        int original = num; // Store the original number

        // Reverse the integer
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit from num
        }

        // Check if the original and reversed numbers are the same
        return original == reversed; // Return true if they are the same
    }
}
