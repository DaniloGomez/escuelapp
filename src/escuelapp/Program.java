package escuelapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args)throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("datos-escuelapp.txt"));
		
		int quantCountry = Integer.parseInt(bf.readLine());
		
		String[]arrDataCountry;
		String[]arrDataCity;
		String[]arrDataSchool;
		String[]arrDataStudent;
		String[]arrDataAsignature;
		
		for(int i=0; i<quantCountry; i++) {
			arrDataCountry = bf.readLine().split(",");
			Country country = new Country(arrDataCountry[0]);
			int quantCity = Integer.parseInt(arrDataCountry[1]);
			
			for(int k=0; k<quantCity; k++) {
				arrDataCity = bf.readLine().split(",");
				City city = new City(arrDataCity[0], Integer.parseInt(arrDataCity[1]));
				int quantSchool = Integer.parseInt(arrDataCity[2]);
				
				for(int j=0; j<quantSchool; j++) {
					arrDataSchool = bf.readLine().split(",");
					School school = new School(arrDataSchool[0], Integer.parseInt(arrDataSchool[1]));
					int quantStudent = Integer.parseInt(arrDataSchool[2]);
					
					for(int l=0; l<quantStudent; l++) {
						arrDataStudent = bf.readLine().split(",");
						Student student = new Student(arrDataStudent[0], Integer.parseInt(arrDataStudent[1]));
						int quantAsignature = Integer.parseInt(arrDataStudent[2]);
						
						for(int t=0; t<quantAsignature; t++) {
							arrDataAsignature = bf.readLine().split(",");
							Asignature asignature = new Asignature(arrDataAsignature[0], Integer.parseInt(arrDataAsignature[1]));
						
							student.asignatureList.add(asignature);
						}
						school.studentList.add(student);
					}
					city.queueSchool.add(school);
				}
				country.addCity(city);
			}
			float totalRating = country.getTotalRating(country.root);
			
		}
		
	}

}
