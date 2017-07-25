
public class ReplaceSubstring {

	public static void main(String[] args) {
		//examine how replacing substring works. Try making some examples.
		
		String document = "Hello, some@mail.bg user, "  + "you have been using some@mail.bg in your registration.";
		String fixedDoc = document.replace("some@mail.bg", "other@mail.bg");
		System.out.println(fixedDoc);
		
		String Johny = " Johny is cool, but Jerry is not cool";
		String newSentance =Johny.replaceAll("cool", "smart");
		System.out.println(newSentance);
		
		String numbs = "Smith's number: 0892880022 \n"+
				"Franky can be found at 0853445566 \n" +
				"so as Steven - 0811654321";
		
		String replacedNumbs = numbs.replaceAll("(08)[0-9]{8}", "$1********");
		
		//"(stays as it is) [take that]{this many times}, "replace it like so"
		System.out.println(replacedNumbs);
		
	}
}
