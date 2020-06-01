package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {
	private Circle circle;
	@Before
	public void before() {
		circle= new Circle(4);
	}
	@Test
	public void testarea() {
	assertEquals(16, circle.area());
	}

	@Test
	public void testpeimeter() {
	assertEquals(16, circle.perimeter());
	}

}
