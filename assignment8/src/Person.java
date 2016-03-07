
public class Person {
	int id;
	String name;
	int age;
	String gender;
	
	public Person(int p_id, String p_name, int p_age, String p_gender) {
		id=p_id;
		name=p_name;
		age=p_age;
		gender=p_gender;
		
	}

	public String toString()
	{
		return id+name+age+gender;
	}
	

}
