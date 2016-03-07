import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Password {
	public boolean validPassword(String password)
	{
		String regex="[A-Za-z0-9]*+[!@#$%^&*]+[A-Za-z0-9]*+";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		
		if(password.length()>=8 && matcher.matches()==true)
			return true;
		else
			return false;
	}
	
}
