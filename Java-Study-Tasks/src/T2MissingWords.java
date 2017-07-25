import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class T2MissingWords {
	/*Function Parameter
	You are given a function missingWords that takes the strings S and T as its arguments.
	 
	Function Return Value
	Return an array of the missing words.

	Sample Input
	I am using hackerrank to improve programming
	am hackerrank to improve

	Sample Output
	I
	using
	programming

	Explanation
	Missing words are:
	1. I  
	2. using  
	3. programming  */
	
	static String[] missingWords(String s, String t) {
		//this is the code from Hackerrank
		List<String> first = new ArrayList<>();
		for(String word: s.split(" ")) {
			first.add(word);
		}
		String second [] = t.split(" ");
		
		for(String word : second){
			first.remove(word);
		}
		return (String[]) first.toArray(new String[first.size()]);
		//return (String[]) first.toArray();// original hackerrank code
		
	}
		
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String _s = in.nextLine();
		String _t = in.nextLine();
		String[] res= missingWords(_s, _t);
		for (int res_i = 0; res_i < res.length; res_i++) {
			System.out.println(String.valueOf(res[res_i]));
			System.out.println();
		}
		in.close();
	}
}

