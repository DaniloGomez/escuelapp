package escuelapp;


public class Country {

	String countryName;
	CityNode root;
	
	public Country(String country) {
		this.countryName = country;
	}


	public void addCity(City city) {
		if(root == null) {
			root = new CityNode(city);
			return;
		}
		addCity(root, city);
	}
	
	private void addCity(CityNode node, City city) {
		if(node==null) {
			return;
		}
		if(city.id > node.city.id) {
			if(node.right == null) {
				if(city.id != node.city.id) {
					node.right = new CityNode(city);
				}
				else {
					System.out.println("City " + city.nameCity + " with ID " + city.id + " duplicated");
				}
			}
			else {
				addCity(node.right, city);
			}
		}
		else {
			if(node.left==null) {
				if(city.id != node.city.id) {
					node.left = new CityNode(city);
				}
				else {
					System.out.println("City " + city.nameCity + " with ID " + city.id + " duplicated");
				}
				
			}
			else {
				addCity(root.left, city);
			}
		}
	}
	
	public City search(int id) {
		return search(root, id);
	}
	
	public City search(CityNode node, int id) {
		if(node==null) {
			return null;
		}
		if(node.city.id == id) {
			return node.city;
		}
		if(node.city.id < id) {
			return search(node.right, id);
		}
		return search(node.left, id);
	}

	CityNode cityRoot;
	public void totalRating() {
		cityRoot = root;
	}
	int right;
	int left;
	String nameMost;
	
	public int getTotalRating(CityNode node) {
		int total = 0;
		int most = 0;
		
		if(node == null) {
			return 0;
		}
		
		total = total + node.city.getTotalRatingCity();
		right = getTotalRating(node.right);
		left = getTotalRating(node.left);
		
		if(node != null) {
			if(node.city.totalRatingCity > right) {
				most = total;
			}
			else if(right > left) {
				most = right;
			}
			else {
				if(node.city.totalRatingCity > left) {
					most = total;
				}
				else {
					most = left;
				}
			}
		}
		
		return most;
	}
	
	public void totalEnrollment() {
		calculateTotalEnrollment(root);
	}
	
	float totalEnroll;
	float calculateTotalEnrollment(CityNode node) {
		if(node==null) {
			return 0;
		}
		totalEnroll = totalEnroll + node.city.getEnrollmentFull();
		calculateTotalEnrollment(node.right);
		calculateTotalEnrollment(node.left);
		
		return totalEnroll;
		
	}
	
	public void mostRepeat() {
		mostRepeat(root);
	}
	
	String mostRepeat;
	String mostRepeat(CityNode node) {
		if(node == null) {
			return null;
		}
		mostRepeat = node.city.AsignatureMostRep();
		mostRepeat(node.right);
		mostRepeat(node.left);
		
		return mostRepeat;
	}
	
	/*Hashtable<String, Integer> enrollment = new Hashtable<String, Integer>();
	Enumeration names;
	String key;
	 
	enrollment.put(arrDataStudent[0], Integer.parseInt(arrDataStudent[1]));
	names = enrollment.keys();
	
	while(names.hasMoreElements()) {
		key = (String) names.nextElement();
		System.out.println("Student: " + key + " ID: " + enrollment.get(key));
	}*/
	
}
