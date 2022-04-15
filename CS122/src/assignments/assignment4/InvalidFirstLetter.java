package assignments.assignment4;

import java.util.Scanner;

public class InvalidFirstLetter {

	public static void main(String[] args) throws InvalidDocumentCodeException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter Your Document ID");
		String goofy = in.nextLine();
		
		
		try {
		
			
			
		if((goofy.substring(0,1).equals("U") || goofy.substring(0,1).equals("C") || goofy.substring(0,1).equals("P")) && goofy.length() == 2) {
			System.out.println("You put in the correct ID, you're not a silly goose");
		}else {
			throw new InvalidDocumentCodeException("Try again bozo, you put in the wrong ID");
		}
	
		
		}catch(InvalidDocumentCodeException e) {
			System.out.println("Whelp you entered it in wrong, but you can keep entering more");
			
		}
	}
}


