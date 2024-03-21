import java.util.Scanner;

public class Stringsjava  {
	private static String s1;
	private static String s2;

	public static void main(String[] args) {
		String s = "Hiii";
		System.out.println(s.length());
		
		//indexof 
		System.out.println(s.indexOf('i'));
		
		// charAt(index);
		System.out.println(s.charAt(0));
		
		//touppercase,tolowercase;
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

        //concat
		System.out.println(s.concat("bro"));
		s=s+"everyone";
        System.out.println(s);
        
        //compareTo();
        String s1="Heaven";
        String s2="heaven";
        System.out.println(s1.compareTo(s2));
        		
	}
}

   