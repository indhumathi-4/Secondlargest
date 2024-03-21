
import java.util.Arrays;  
public class Second{  
public static int getSecondLargestandsmallest(int[] a, int total){  
Arrays.sort(a);  
return a[total-2];

}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
System.out.println("Second Largest: "+getSecondLargestandsmallest(a,6));  
System.out.println("Second smallest: "+getSecondLargestandsmallest(a,6));  
}}  