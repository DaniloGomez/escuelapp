package recursion;

public class Digit {

	public static void main(String[] args) {
		
		int x = countDigits(105);
		System.out.println("The number digits is: " + x);
		
	}
	
	public static int countDigits(int n) {

		if(n<10) {
			return 1;
		}
		
		else {
			return 1 + countDigits(n/10);
		}
		
	}

}
