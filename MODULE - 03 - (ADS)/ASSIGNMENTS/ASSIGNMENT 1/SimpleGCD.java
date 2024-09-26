import java.util.Scanner;

public class SimpleGCD {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Find the GCD
        int gcd = findGCD(num1, num2);
        
        // Output the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to find GCD using a simple loop
    public static int findGCD(int a, int b) {
        int gcd = 1; // Start with GCD as 1
        
        // Loop from 1 to the smaller of the two numbers
        for (int i = 1; i <= Math.min(a, b); i++) {
            // Check if i is a divisor of both a and b
            if (a % i == 0 && b % i == 0) {
                gcd = i; // Update gcd if i is a divisor
            }
        }
        
        return gcd; // Return the GCD
    }
}
