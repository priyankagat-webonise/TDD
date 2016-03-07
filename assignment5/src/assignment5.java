import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment5 {
	Calculator calculator;
	@Before
	public void setUp() throws Exception {
		calculator=new Calculator();
	}

	@Test
	public void test() {
		
		assertEquals(20, calculator.addition(10, 10));
		assertEquals(50, calculator.substraction(70, 20));
		assertEquals(20, calculator.multiply(5, 4));
		assertEquals(20, calculator.division(100, 5));
	}
	
	
}
