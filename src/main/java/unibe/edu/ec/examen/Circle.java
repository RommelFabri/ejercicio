package unibe.edu.ec.examen;

public class Circle {
	public int slie;

	
	public Circle(int slie) {
		super();
		this.slie = slie;
	}
	
	public int getSlie() {
		return slie;
	}

	public void setSlie(int slie) {
		this.slie = slie;
	}

	public int area () {
		return this.slie*this.slie;
	}
	public int perimeter () {
		return this.slie*4;
	}
}

