import java.util.Scanner;

public class RepeatedCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string

        findRepeatedCharacters(input); // Call the method to find repeated characters

        scanner.close(); // Close the scanner
    }

    // Method to find and print repeated characters
    public static void findRepeatedCharacters(String str) {
        // Create an array to keep track of character counts (assuming ASCII characters)
        int[] charCount = new int[256]; 

        // Count each character's occurrences
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++; // Increment the count for each character
        }

        System.out.println("Repeated characters:");

        // Check the counts and print repeated characters
        boolean found = false;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) { // If the character appears more than once
                System.out.println((char) i + ": " + charCount[i] + " times"); // Print character and its count
                found = true; // Mark that we found at least one repeated character
            }
        }

        if (!found) {
            System.out.println("No repeated characters found."); // Message if none are repeated
        }
    }
}
