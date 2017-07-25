import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	/*
	 * Two strings and are called anagrams if they consist same characters,
	 * but may be in different orders. So the list of anagrams of is . Given
	 * two strings, print Anagrams if they are anagrams, print Not Anagrams
	 * if they are not. The strings may consist at most 50 English
	 * characters; the comparison should NOT be case sensitive.
	 * 
	 * If we only by sum the lexicographic values of the strings
	 * the verification will give false equal value :
	 * bbcc != dabc  , but       98+98 +99+99 = 100+97+98+99    , witch
	 * returns wrong  "true" result!!
	 */

	static boolean isAnagram(String a, String b) {

		String sortedStringA = sortingChars(a);
		String sortedStringB = sortingChars(b);
		if (sortedStringA.equals(sortedStringB)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
	public static String sortingChars(String word){
		
		word = word.toLowerCase();
		char[] charsWord = word.toCharArray();
		Arrays.sort(charsWord);
		return String.valueOf(charsWord);
		//valueOf(char[] data) − Returns the string representation of the char array argument.
	}
}
