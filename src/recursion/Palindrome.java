package recursion;

public class Palindrome {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,3,3,3,3,2};
		int x = getPalindrome(arr, 0, arr.length-1);
		System.out.println("Result: " + x);

	}
	
public static int getPalindrome(int[] arr, int from, int until) {
		
		int half;

		if(from == until) {
			System.out.print(arr[from] + " ");
			return arr[from];
		}
		
		if(arr[from] == arr[until]) {
			
			half = getPalindrome(arr, from+1, until);
			return 1;
		}
		
		else {
			return 0;
		}

	}

}
