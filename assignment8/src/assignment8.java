import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment8 {

	Person person1;
	Person person2;
	Person person3;
	
	@Before
	public void setUp() throws Exception {
		person1=new Person(1,"abc",32,"Female");
		person2=new Person(2,"sam",35,"male");
		person3=new Person(3,"rina",30,"female");
	}

	@Test
	public void test() {
		
	assertEquals("1abc32Female", person1.toString());
	assertEquals("2sam35male", person2.toString());
	assertEquals("3rina30female", person3.toString());
	
	}

}
