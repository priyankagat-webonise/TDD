import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IFSCValidation {
	
	public boolean CheckIFSC(String IFSCCode)
	{
		String regex="[A-Za-z]{4}[0-9]{7}$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(IFSCCode);
		return matcher.matches();
	}

}
