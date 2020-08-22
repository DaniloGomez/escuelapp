package dividir;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x = dividir(60, 15);
		System.out.println("Resultado: " + x);
	}
	
	public static int dividir(int a, int b) {
		if(a<b) {
			return 0;
		}
		return 1 + dividir(a-b, b);
	}

}
