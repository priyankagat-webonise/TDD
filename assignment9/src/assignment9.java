import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class assignment9 {

	GradeMarks grademarks;
	@Before
	public void setUp() throws Exception {
		grademarks=new GradeMarks();
	}

	@Test
	public void test() {
	
		assertEquals('A', grademarks.CalculateGrade(75));
		assertEquals('B', grademarks.CalculateGrade(65));
		assertEquals('C', grademarks.CalculateGrade(55));
		assertEquals('D', grademarks.CalculateGrade(45));
		assertEquals('D', grademarks.CalculateGrade(40));
		assertEquals('F', grademarks.CalculateGrade(39));
	}

}
