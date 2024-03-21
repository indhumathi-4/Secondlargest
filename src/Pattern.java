import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = rows; i > 0; i--) { 
            for (int j = 0; j < i; j++) { 
                System.out.print("@");
            }
            System.out.println(); 
        }
        
        scanner.close(); 
    }
}
