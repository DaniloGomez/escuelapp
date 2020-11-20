package escuelapp;

import java.util.PriorityQueue;

public class City {

	String nameCity;
	int id;
	
	PriorityQueue<School>queueSchool = new PriorityQueue<School>();
	
	public City(String name, int id) {
		this.nameCity = name;
		this.id = id;
	}
	int count=0;

	public void addSchool(School school) {
		queueSchool.add(school);
	}
	int totalRatingCity = 0;
	float bonus=10000;
	int getTotalRatingCity() {	
		
		if(queueSchool.size() == 0) {
			return 0;
		}
		
		for(School school : queueSchool) {

			bonus = bonus - (1000*count);
			System.out.println("Name School: " + school.nameSchool + " Bonus: " + " $" + (bonus));
			totalRatingCity = totalRatingCity + school.getRatingStudent();
			count++;

		}
		totalRatingCity = totalRatingCity / count;
			
		return totalRatingCity;
	}
	
}
