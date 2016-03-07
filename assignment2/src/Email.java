import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email {

	public boolean ValidEmail(String sample_email)
	{
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(sample_email);
		
			return matcher.matches();
	}
	
}
