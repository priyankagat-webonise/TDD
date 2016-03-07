import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment10 {

	IFSCValidation ifscCode;
	@Before
	public void setUp() throws Exception {
		ifscCode= new IFSCValidation();
	}

	@Test
	public void test() {
		
		assertEquals(false,ifscCode.CheckIFSC("ugIK14565345"));
		assertEquals(false,ifscCode.CheckIFSC("455814565345"));
		assertEquals(false,ifscCode.CheckIFSC("ICICI4789562"));
		assertEquals(false,ifscCode.CheckIFSC("4bank789561"));
		assertEquals(false,ifscCode.CheckIFSC("icicibank01"));
	}

	@Test
	public void Successtest() {
		assertEquals(true,ifscCode.CheckIFSC("BKID0000915"));
		assertEquals(true,ifscCode.CheckIFSC("BKID0000920"));
		assertEquals(true,ifscCode.CheckIFSC("ICIC0006975"));
		
	}
}
