package add;

public class Array {

	public static void main(String[] args) {
	
		int[] arreglo = new int[] {3, 2, 5};
		int adder = calculator(arreglo, arreglo.length - 1);
		System.out.println("Resultado: " + adder);
	}

	public static int calculator(int adder[], int position) {
		int arrayPos = position;
		int result;
		
		if(arrayPos ==0) {
			return adder[arrayPos];
		}
		else {
			result = (adder[arrayPos]) + calculator(adder, position-1);
		}
		return result;
	}
	
}
