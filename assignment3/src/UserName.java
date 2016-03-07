import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class UserName {
	
	public boolean ValidUserName(String username)
	{
		String regex="[^0-9]+";
		Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(username);
		
		 if(username.length()>5 && matcher.matches()==true)
			return true;
		else 
			return false;
	}

}
