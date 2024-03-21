
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        
        while(number != 0) {
            int lastDigit = number % 10; 
            reversedNumber = reversedNumber * 10 + lastDigit; 
            number /= 10; 
        
        
        scanner.close(); 
    }        System.out.println("Reversed number: " + reversedNumber);

}
}
