import java.util.Scanner;

public class SimpleSquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // To read user input
        System.out.print("Enter a number to find its square root: ");
        int number = scanner.nextInt(); // Get the number from the user

        if (number < 0) {
            // Handle negative numbers
            System.out.println("Cannot compute square root of a negative number.");
        } else {
            int result = findSquareRoot(number); // Call the method to find the square root
            System.out.println("The integer approximation of the square root of " + number + " is: " + result);
        }

        scanner.close(); // Close the scanner
    }

    // Method to find the square root using simple logic
    public static int findSquareRoot(int num) {
        int approx = num; // Start with a rough guess
        int betterApprox;

        // Loop to improve the guess
        while (true) {
            betterApprox = (approx + num / approx) / 2; // Calculate a better guess
            if (betterApprox == approx) { // If no change, we're done
                break; // Exit the loop
            }
            approx = betterApprox; // Update the guess
        }

        return approx; // Return the final guess
    }
}
