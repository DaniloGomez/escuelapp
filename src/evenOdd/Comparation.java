package evenOdd;

public class Comparation {

	public static void main(String[] args) {
		
		int[] array = new int[] {2, 4, 9, 6};
		int total = compareArray(array, array.length-1);
	}

	
	public static int compareArray(int arr[], int position) {
	
		//int pos = arr[position];
		int compare=0;
		int even;
		int odd;
		

		if(position >= 0 ) {
			even = arr[position];
			compare = (even % 2);
			if(compare == 0) {
				
				 //9
				System.out.print("Even: " + even + ", ");
				
						
			}
			else {
				System.out.print("Odd: " + even + ", ");
				
			}
			
		}
		if(position < 0) {
			return position;
		}
		return compareArray(arr, position-1);
	}
}
