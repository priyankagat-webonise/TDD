import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment4 {

	Password password;
	@Before
	public void setUp() throws Exception {
		password=new Password();
	}

	@Test
	public void test() {
		assertEquals(false, password.validPassword("hello1@"));
		assertEquals(false, password.validPassword("hellohgk"));
		assertEquals(false, password.validPassword("hello1123"));
		assertEquals(false, password.validPassword("@helloghg"));
		assertEquals(false, password.validPassword("helloabcd"));
		assertEquals(false, password.validPassword("12345678!@"));
		assertEquals(false, password.validPassword(""));
		
	}

	@Test
	public void Successtest() {
		assertEquals(true, password.validPassword("hello12@"));
		assertEquals(true, password.validPassword("@hello12"));
		assertEquals(true, password.validPassword("@!hello1245"));
		assertEquals(true, password.validPassword("@hello#124"));
	}
}
