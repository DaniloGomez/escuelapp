package recursion;

public class Palindrome {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,3,3,1,3,3,2};
		int x = getPalindrome(arr, 0, arr.length-1);
		
		System.out.println("Result: " + x);

	}
	
public static int getPalindrome(int[] arr, int from, int until) {
		
	if(from == until) {
		return 1;
	}
	
	if(arr[from] != arr[until]) {
		return 0 * getPalindrome(arr, from+1, until-1);
	}
		return getPalindrome(arr, from+1, until-1);

}

}
