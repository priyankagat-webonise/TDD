
public class ConcatString {
	public String ArrayString(String [] stringArray)
	{
		String word ="" ;
		
		for(int i=0;i<stringArray.length;i++)
		{
			word=word.concat(stringArray[i]);
		}
		
		return word;
	}

}
