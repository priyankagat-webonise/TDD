import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment3 {

	UserName name;
	@Before
	public void setUp() throws Exception {
		name=new UserName();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(false,name.ValidUserName(" "));
		assertEquals(false,name.ValidUserName("abc"));
		assertEquals(false,name.ValidUserName("abc123"));
		assertEquals(false,name.ValidUserName("4568123"));
	}
	
	@Test
	public void Successtest() {
		//fail("Not yet implemented");
		assertEquals(true,name.ValidUserName("abcduser"));
		assertEquals(true,name.ValidUserName("abc.user"));
		assertEquals(true,name.ValidUserName("abc_user"));
	}

}
