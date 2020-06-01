package unibe.edu.ec.examen;

public class Numbers {

	private int number;
	
	private int number2;

	public Numbers(int number, int number2) {
		super();
		this.number = number;
		this.number2 = number2;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public int multiplication() {
		return this.number*this.number2;
		
	}
	
	public int division() {
		return this.number/this.number2;
		
	}
	
}
