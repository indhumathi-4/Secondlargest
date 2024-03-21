import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("The factorial of a negative number is undefined.");
        } else {
            long factorial = 1; // Initialize the factorial result variable

            // Loop to calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.printf("The factorial of %d is: %d%n", number, factorial);
        }

        scanner.close(); // Close the scanner object
    }
}
