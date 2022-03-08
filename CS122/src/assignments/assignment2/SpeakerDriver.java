package assignments.assignment2;

public class SpeakerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Speaker t1;
			t1 = new Speaker1();
			
			Speaker t2;
			t2 = new Speaker2();
			
			Speaker t3;
			t3 = new Speaker3();
		
			System.out.println("This is the first class \n");
			t1.Speak();
			t1.announce("bruh ");
			
			System.out.println("\n This is the second class \n");
			t2.Speak();
			t2.announce("bruh ");
			
			System.out.println("\n This is the third class \n");
			t3.Speak();
			t3.announce("bruh ");
			
			
	}

}
