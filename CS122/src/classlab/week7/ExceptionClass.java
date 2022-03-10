package classlab.week7;

import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		// take input from user 
		// if the character at position 10 (index 9) in string is y, print yes
		// if the substring from position 5-10 is Cs122, print inclass
		
		Scanner s = new Scanner(System.in);
		
		String test = s.nextLine();
		
		try {
			if(test.charAt(9) == 'Y') {
				System.out.println("Yes");
			}
			if(test.substring(2,8).equals(("CS122"))){
				System.out.println("inclass");
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}