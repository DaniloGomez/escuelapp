package pow;


public class Pow {

	public static void main(String[] args) {
	
		int x = calculatePow(4, 4);
		System.out.println("A pow b: " + x);

	}
	
	public static int calculatePow(int a, int b) {
	
		if(b==1) {
			return a; 
		}
		return a * calculatePow(a, b-1);
	}

}
