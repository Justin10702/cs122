package classlab.week10;

public class Fibonacci {

	public static int fib(int num) {
		int result;
		// fib(0) = 1;
		if(num == 0 || num == 1) {
			//System.out.println(num + "\t");
			return num;
		}
		//fib(1) = 1;
		// if(num == 1) {
			//System.out.println(1 + "\t");
			//return 1;
		//}

		//fib(index) = fib(index - 1) + fib(index - 2); 

		else {
			result = fib(num - 1) + fib(num - 2);
			//System.out.println(result + "\t");
			return result;
		}
	}
	
	public static void main(String[] args) {
	
	
		for(int i = 0; i<=11; i++) {
		System.out.println(fib(i) + "\t");
	}
	}
	
}
