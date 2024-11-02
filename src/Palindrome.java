
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Palindrome
{
	public static void main(String[] args) {
	    String str=" A man, a plan, a canal: Panama";
		Pattern pattern=Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher=pattern.matcher(str);
		String cleanedStr=matcher.replaceAll("");
		cleanedStr=cleanedStr.toLowerCase();
		StringBuilder revStr=new StringBuilder();
		revStr.append(cleanedStr);
		revStr.reverse();
		System.out.println(revStr.toString().equals(cleanedStr));
		
	}
}