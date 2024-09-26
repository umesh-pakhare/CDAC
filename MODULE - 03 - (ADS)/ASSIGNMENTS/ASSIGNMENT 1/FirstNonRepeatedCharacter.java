import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string

        char result = findFirstNonRepeatedCharacter(input); // Find the first non-repeated character
        
        // Print the result
        if (result != '\u0000') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }

        scanner.close(); // Close the scanner
    }

    // Method to find the first non-repeated character
    public static char findFirstNonRepeatedCharacter(String str) {
        // Create an array to count each character's occurrences
        int[] charCount = new int[256]; // Array for all ASCII characters

        // Count each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++; // Increment the count for the character
        }

        // Find the first character that appears only once
        for (int i = 0; i < str.length(); i++) {
            // If the character's count is 1, return it
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i); // This is the first non-repeated character
            }
        }

        return '\u0000'; // Return null character if none found
    }
}
