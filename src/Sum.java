
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int tempNumber = Math.abs(number);
        
        int sum = 0;
        
        while (tempNumber > 0) {
            sum += tempNumber % 10; 
            tempNumber /= 10; 
        
        
        scanner.close();
    }System.out.println("The sum of the digits of " + number + " is: " + sum);
}
}