package assignments.assignment4;

import java.util.Scanner;

public class baseConversion {

	
	public static void main (String[] args) {
		int base10Num;
		int base;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.println("Enter an integer: ");
		base10Num = scan.nextInt();
		System.out.println("Enter the base ");
		base = scan.nextInt();
		
		System.out.println(convert(base10Num, base));
	}
	
	public static String convert (int num, int b) {
		int quotient;
		int remainder;
		
		quotient = num/b;
		remainder = num%b;
		
		
		
		if(num == 0) {
			return " ";
		}
		else {
			
			return convert(quotient, b) + remainder;
		}
	}
	
}
