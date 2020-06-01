package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Humantest {
	private Human human;
	
	@Before
	public void before() {
		human= new Human();
		String name="Rafael";
		human.setName(name);
	}

	@Test
	public void testGetNamelenght() {
		assertEquals(6, human.getNamelenght());
	}

}
