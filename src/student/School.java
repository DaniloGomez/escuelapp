package student;

public class School {

	int MAXIMUM_CAPACITY = 1000;
	int quantity = 0;
	Student[] arrStudent = new Student[MAXIMUM_CAPACITY];
	
	public void addStudent(Student student) {
		if(quantity > MAXIMUM_CAPACITY - 1) {
			System.out.println("Wrong, maximum capacity of students");
		}
		else {
			arrStudent[quantity] = student;
			quantity++;
		}
	}
	float sum = 0;
	public float calculateAverage() {
				
		for(int i=0; i<quantity; i++) {
			sum = sum + arrStudent[i].payment;
		}
		obtAverage();
		return average;
	}
	float average =0;
	public float obtAverage() {
		
		average = sum / quantity;
		
		return average;
	}
	
	float maxPayment = 0;
	public float maxPayment() {
		
		for(int i=0; i<quantity; i++) {
			for(int j=i+1; j<quantity; j++) {
				if(arrStudent[i].payment > arrStudent[j].payment) {
					maxPayment = arrStudent[i].payment;
				}
				else {
					maxPayment = arrStudent[j].payment;
				}
			}
		}
		return maxPayment;
	}
}
