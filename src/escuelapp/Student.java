package escuelapp;

import java.util.ArrayList;
import java.util.Hashtable;


public class Student {

	String nameStudent;
	int id;
	
	
	ArrayList<Asignature> asignatureList = new ArrayList<Asignature>();

	Hashtable<String, Integer> hashAsignature = new Hashtable<String, Integer>();
	
	public Student(String name, int id) {
		this.nameStudent = name;
		this.id = id;
	}

	int calculateRatingStudent() {
		int totalRating = 0;
		int t = 0;
		
		for(Asignature asignature : asignatureList) {
			totalRating = totalRating + asignature.rating;
			t++;
		}
		totalRating = totalRating /t;
		//System.out.println("Rating Student: " + totalRating);
		return totalRating;
	}
}
