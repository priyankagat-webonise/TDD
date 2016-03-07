import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment2 {

	Email email;
	@Before
	public void setUp() throws Exception {
		email=new Email();
	}

	

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(false, email.ValidEmail(" "));
		assertEquals(false, email.ValidEmail(""));
		assertEquals(false, email.ValidEmail("fdsg."));
		assertEquals(false, email.ValidEmail("fd@sg"));
		assertEquals(false, email.ValidEmail("@fdsg."));
		assertEquals(false, email.ValidEmail("gfd#dhg.lk"));
	}
	
	@Test
	public void SuccessTest() {
		//fail("Not yet implemented");
		assertEquals(true, email.ValidEmail("abc@kh.com"));
		assertEquals(true, email.ValidEmail("abc12@sdf.in"));
		assertEquals(true, email.ValidEmail("abc12@sdf.co.in"));
		
	}
	


}
