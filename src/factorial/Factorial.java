package factorial;

public class Factorial {

	public static void main(String[] args) {
		
		int x = calculateFactorial(6);
		System.out.println("Factorial is: " + x);

	}
	
	public static int calculateFactorial(int n) {
		
		if(n==1) {
			return n;
		}
		return n * calculateFactorial(n-1);
	}

}
