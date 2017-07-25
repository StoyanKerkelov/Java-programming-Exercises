import java.util.Scanner;


public class Palindrome {
	//check for polidromes
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word = reader.nextLine();
		String result = "Yes";
		int i1 = 0;
		int i2 = word.length() - 1;
		/*First loop iteration we will compare word[0] and word[4]. 
		They're equal, so we increment i1 (it's now 1) and decrement i2 (it's now 3).
		So we then compare the n's. They're equal, so we increment i1 (it's now 2) and decrement i2 (it's 2).
		Now i1 and i2 are equal (they're both 2), so the condition for the while loop is no longer true so the
		 loop terminates and we return true.*/
		
		    while ( i2 > i1 ) {//in odd-length when i1 = i2 loop get terminate
			   if ( word.charAt(i1) != word.charAt(i2)){
				  result = "No";
				   break;
			   }
			   ++i1;
			    --i2;
		    }
		    System.out.println(result);
	}
}
