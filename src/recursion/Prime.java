package recursion;

public class Prime {

	public static void main(String[] args) {
		
		int x = p(7, 1);
		if(x ==1) {
			System.out.println("Yes, your number is prime");
		}
		else {
			System.out.println("NO, your number isn't prime");
		}

	}
	
	public static int p(int n, int from) {
		int count= 0;
		
		if(n == from) {
			return count;
		}
		
		int c;
		c = n % from;
		if(c == 0) {
			count++;
		}
		
		return count + p(n, from + 1);
		
	}

}
