import java.util.Scanner;


public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The factorial of a negative number is undefined.");
        } else {
            long factorial = 1; // Initialize the factorial result variable

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.printf("The factorial of %d is: %d%n", number, factorial);
        }

        scanner.close(); 
    }
}
