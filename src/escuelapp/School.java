package escuelapp;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.print.attribute.standard.MediaSize.Other;

public class School  implements Comparable<School>{

	String nameSchool;
	int id;
	
	/*
	 * Prioridad ALTA: Mayor promedio de notas de los estudiantes
	 * 
	 * */
	
	ArrayList<Student>studentList = new ArrayList<Student>();
	
	public School(String name, int id) {
		this.nameSchool = name;
		this.id = id;
	}
	int ratingStudent = 0;
	int i = 0;
	Hashtable<String, Float>compareSchool = new Hashtable<String, Float>();
	int getRatingStudent() {
		if(studentList.size() == 0) {
			return 0;
		}
		for(Student student : studentList) {
			ratingStudent = ratingStudent + student.calculateRatingStudent();
			i++;
		}
		
		ratingStudent = ratingStudent /i;
		
		return ratingStudent;
	}
	
	public int compareTo(School OtherSchool) {
		System.out.println("Rating ordened: " + OtherSchool.getRatingStudent());
		return OtherSchool.getRatingStudent() - this.getRatingStudent();
	}
	
	float totalEnrollment;
	public float getTotalEnrollment() {
		if(studentList.size() == 0) {
			return 0;
		}
		for(Student student : studentList) {
			totalEnrollment = totalEnrollment + student.valueEnrollment;
		}
		return totalEnrollment;
	}
	
	String AsMostRep;
	String asignatureMostBiggest() {
		for(Student student : studentList) {
			AsMostRep = student.asignatureMoreRepeat();
		}
		return AsMostRep;
	}

}
