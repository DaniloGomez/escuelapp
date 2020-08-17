package student;

public class Program {
	
	public static void main(String[] args) {
		
		Student S1 = new Student("Juan", 2000);
		Student S2 = new Student("Ana", 2500);
		Student S3 = new Student("Pedro", 3500);
		
		School High = new School();
		High.addStudent(S1);
		High.addStudent(S2);
		High.addStudent(S3);
		
		float getAverage = High.calculateAverage();
		System.out.println("Average payment students: $" + getAverage);
		
		float maxPayment = High.maxPayment();
		System.out.println("Maximum payment of students is: " + maxPayment);
		
		float diffAverage = High.sum - High.maxPayment;
		System.out.println("The difference between average and maximum payment is: " + diffAverage);
	}

}
