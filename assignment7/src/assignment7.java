import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment7 {

	ConcatString concatstring;
	@Before
	public void setUp() throws Exception {
		concatstring=new ConcatString();
	}

	@Test
	public void test() {
		
		assertEquals( "HelloEveryOne", concatstring.ArrayString(new String[] {"Hello","Every","One"}));
		assertEquals( "123456789", concatstring.ArrayString(new String[] {"123","456","789"}));
		assertEquals( "onetwothree", concatstring.ArrayString(new String[] {"one","two","three"}));
		assertEquals( "abcpqr", concatstring.ArrayString(new String[] {"abc","pqr"}));
	}

}
