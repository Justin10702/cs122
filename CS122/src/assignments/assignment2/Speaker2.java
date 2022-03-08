package assignments.assignment2;

public class Speaker2 implements Speaker{

	public void Speak(){
		System.out.println("Test 2");
	}

	@Override
	public void announce(String str) {
		
		System.out.println(str + "This is test 2");
	}
}
