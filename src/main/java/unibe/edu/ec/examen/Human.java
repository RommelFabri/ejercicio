package unibe.edu.ec.examen;

public class Human {
	private String name,lastname;
	private double high;
	private int age ;
	
	public Human(String name, String lastname, double high, int age) {
		this.name = name;
		this.lastname = lastname;
		this.high = high;
		this.age = age;
	}
	

	public Human() {
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNamelenght() {
		return this.name.length();
	}
	

}
