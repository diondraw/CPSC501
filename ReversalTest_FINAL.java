//Diondra A. Whindleton
//never had to write my own tests before :( | no method makes it hard to do

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import org.junit.Test;

public class ReversalTest extends Reversal {

	@Test
	public void testIfStringExists() {
		String txtfl = null;
		//int actual =  Reversal.main(new FileReader("/Users/dionwhindleton/CNU Grad School/Fall 2015/CPSC 501 - Software Engineering/rats.txt"));
		Reversal r = new Reversal();
		String actual = r.toString();
		String expected = txtfl;
		assertEquals("File strings don't exist", expected, actual);
	}
	
	@Test
	public void testBufferReader() {
		String br = null;
		Reversal r = new Reversal();
		String actual = new BufferedReader(new FileReader("/Users/dionwhindleton/CNU Grad School/Fall 2015/CPSC 501 - Software Engineering/rats.txt"));
		String expected
	}
	
	public void testBufferWriter() {
		
	}
	
	public void testReverseOrder() {
		
	}
}







//EXAMPLES FROM NOTES FOR ME TO REFERENCE
/* @Test
public void testConstructor() {
	Person p = new Person(37);
	int actual = p.getAge();
	int expected = 37;
	assertEquals("Constructor is broke", expected, actual);
}

@Test
public void testAgeChange() {
	Person p = new Person(1);
	p.setAge(13);
	int actual = p.getAge();
	int expected = 13;
	assertEquals("Age Change is broke", expected, actual);
} */
