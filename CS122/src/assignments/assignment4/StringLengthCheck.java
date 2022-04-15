package assignments.assignment4;

import java.util.Scanner;

public class StringLengthCheck {

	public static void main(String[] args) throws StringTooLongException {

		Scanner in = new Scanner(System.in);
		
		String bruh = null;
        String bruh2 = "";
		
      
        
		while(true) {
			
			  try {
			
			System.out.println("Please Enter a String");
			 bruh = in.nextLine();
			
		 if(bruh.length() > 20) {
			throw new StringTooLongException("This string is too long");
		}else if(bruh.equalsIgnoreCase("DONE")){
			break;
		}else {
			 bruh2 = bruh2 + " " + bruh;
			 System.out.println(bruh2);
		}
		}
        catch(StringTooLongException e) {
        	System.out.println("You made an error you silly goose, stop trying to make it longer than 20 characters");
        }
	}	
}
}

