
public class GradeMarks {
	public char CalculateGrade(int marks)
	{
		if(marks>=70)
			return 'A';
		else if(marks>=60)
			return 'B';
		else if(marks>=50)
			return 'C';
		else if(marks>=40)
			return 'D';
		else 
			return 'F';
	}

}
