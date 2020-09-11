package recursion;

public class Number {

	public static void main(String[] args) {
		
		int[] arrGreatest = new int[] {2,1,30,6,88,1};
		int x = getGreatest(arrGreatest, 0, arrGreatest.length-1, 0);

		System.out.println("\nThe greatest number in array is: " + x);

	}
	
public static int getGreatest(int[] arr, int from, int until, int count) {
		
		int half;
		int left;
		int right;
		//int count=arr.length-1;
		//int mayor = 0, other;
		//other = from;

		if(from == until) {		
			System.out.print(arr[from] + " ");
			return arr[from];
		}
		else {
			half = (from + until)/2;
			left = getGreatest(arr, from, half,count+1);
			right = getGreatest(arr, half+1, until, count+1);
		}
		if(right > left) {
			return right;
		}
		else {
			return left;
		}
		
	}

}
