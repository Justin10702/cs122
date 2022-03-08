package assignments.assignment2;

public class Speaker1 implements Speaker{

	public void Speak(){
		System.out.println("Test 1");
	}

	@Override
	public void announce(String str) {
		
		System.out.println(str + "This is test 1");
		
	}
}
