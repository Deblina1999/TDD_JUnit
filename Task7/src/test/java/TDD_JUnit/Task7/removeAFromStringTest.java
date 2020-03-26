package TDD_JUnit.Task7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class removeAFromStringTest {
	/* TODO list for my feature
	 * 1. "ABCD" => "BCD"
	 * 2. "AABCD" => "BCD"
	 * 3. "BACD" => "BCD"
	 * 6. "A" => ""
	 */
	Scanner sc = new Scanner(System.in);
	String string = sc.next();
	@Test
	void testFirstAOnly()
	{
		RemoveA r = new RemoveA();
		String actual = r.remove(string);
		assertEquals("BCD", actual);
	}
	void testFirstAOnly1()
	{
		RemoveA r = new RemoveA();
		String actual = r.remove(string);
		assertEquals("BCD", actual);
	}
	void testFirstAOnly2()
	{
		RemoveA r = new RemoveA();
		String actual = r.remove(string);
		assertEquals("", actual);
	}

}
