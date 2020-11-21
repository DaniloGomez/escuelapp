package escuelapp;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;


public class Student {

	String nameStudent;
	int id;
	float valueEnrollment;
	
	
	ArrayList<Asignature> asignatureList = new ArrayList<Asignature>();

	public Student(String name, int id, float enrollment) {
		this.nameStudent = name;
		this.id = id;
		this.valueEnrollment = enrollment;
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
	
	public String asignatureMoreRepeat() {
		Hashtable<String, Integer> asignatureHash = new Hashtable<String, Integer>();
		for(Asignature asignature : asignatureList) {
			int cant = 1;
			if(asignatureHash.containsKey(asignature)) {
				cant = asignatureHash.get(asignature);
				cant++;
			}
			asignatureHash.put(asignature.nameAsignature, cant);
		}
		
		int biggest=0;
		String asignatureMostRepeat="";
		
		Enumeration<String> enumeration = asignatureHash.keys();
		while(enumeration.hasMoreElements()){
			String key = enumeration.nextElement();
			if(asignatureHash.get(key)> biggest) {
				biggest = asignatureHash.get(key);
				asignatureMostRepeat = key;
			}
		}
		return asignatureMostRepeat;
	}
}
