import java.util.Arrays;
import java.util.Scanner;

	//write an algorithm that compares the size of substrings from a single string and 
	//finds the biggest and smallest ones

public class FindBiggestSubstring {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		//String [] text = reader.nextLine().split("[\\d\\s,.]+");
		String word = reader.nextLine();
		int num = reader.nextInt();
		reader.close();
		
		String [] subStr = new String[word.length()+1-num];
		for (int i = 0; i < subStr.length; i++){ 
			subStr[i] = word.substring(i, i+num);
		}
		//System.out.println(Arrays.toString(subs));
		String bgst = subStr[0];
		String smst = subStr[0];
		for (int j = 0; j < subStr.length; j++){
			if( subStr[j].compareTo(bgst) >0){
				bgst = subStr[j];
			}
			if( subStr[j].compareTo(smst) <0){
				smst = subStr[j];
			}
		}
		System.out.println("Smallest substring: " + smst);
		System.out.println("Biggest substring: " + bgst);
	}
}
