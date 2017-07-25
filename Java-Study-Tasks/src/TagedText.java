import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagedText {
	/*
	Write a program that changes the registry of letters form a fiven text.
	In all the places in the text enclosed with the <upcase> and </ upcase> tags.
	Tags can not be pasted.

	Example: We are living in a <upcase> yellow submarine </ upcase>. We do not have it
	  <Upcase> anything </ upcase> else.
	Result: We are living in a YELLOW SUBMARINE. We do not have ANYTHING else.
	  */

	public static void main(String[] args) {
		
		String text =  "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
		StringBuffer strbuff = new StringBuffer();

		Pattern pattern = Pattern.compile("<upcase>(.*?)</upcase>",Pattern.DOTALL);//pattern of regex   <tag> BETWEEN </tag> 
		Matcher matcher = pattern.matcher(text);									//matches of this pattern in the text

		while(matcher.find()){
		    String valueFromTags = matcher.group(1);
		    matcher.appendReplacement(strbuff, valueFromTags.toUpperCase());
		}
		matcher.appendTail(strbuff);
		
		System.out.println(strbuff.toString());
	}
}
