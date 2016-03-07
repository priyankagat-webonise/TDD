import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment6 {

	SortArray sortarray;
	@Before
	public void setUp() throws Exception {
		sortarray=new SortArray();
	}

	@Test
	public void test() {
		
		assertArrayEquals(new int[]{1,2,3,4,5}, sortarray.sort_array(new int[]{1,2,5,4,3}));
		assertArrayEquals(new int[]{1,2,3,4,5}, sortarray.sort_array(new int[]{2,1,5,4,3}));
		assertArrayEquals(new int[]{1,2,3,4,5}, sortarray.sort_array(new int[]{3,2,5,1,4}));
	
	}

}
