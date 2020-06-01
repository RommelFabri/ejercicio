package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Numbertest {
	
	private Numbers number;
	
	@Before
	public void before() {
		number= new Numbers(10,2);
	}

	@Test
	public void testmultiplication() {
	assertEquals(20, number.multiplication());
	}

	@Test
	public void testdivision() {
	assertEquals(5, number.division());
	}
}
