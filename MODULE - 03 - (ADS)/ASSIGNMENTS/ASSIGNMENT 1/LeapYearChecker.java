import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); // Read the input year

        // Check if the year is a leap year
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Print the result
        if (isLeap) {
            //System.out.println(year + " is a leap year.");
			System.out.println(isLeap);
        } else {
           // System.out.println(year + " is not a leap year.");
			System.out.println(isLeap);
		}

        scanner.close(); // Close the scanner
    }
}
