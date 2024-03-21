
import java.util.Scanner;

public class Fibonacii {

    public static void main(String[] args) {
    	int n,a=0,b=0,c=1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        n = scanner.nextInt();
        for(int i=1; i<=n; i++)
        {
        a=b;
        b=c;
        c=a+b;
        System.out.println(a+""); 
        }System.out.println("fibonaci series");
    }
}
        