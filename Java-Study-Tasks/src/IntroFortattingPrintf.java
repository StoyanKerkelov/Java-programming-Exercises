import java.util.Scanner;

public class IntroFortattingPrintf {
	/* Every line of input will contain a String followed by an integer. 
		Each String will have a maximum of  10 alphabetic characters, and each integer will be
 		in the inclusive range from  0 to  999.
 		
		The first column contains the String and is left justified using exactly  15 characters. 
		The second column contains the integer, expressed in exactly 3 digits; 
		if the original input has less than three digits, you must pad your output's leading digits with zeroes.*/
	    public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
	            System.out.println("================================");
			/*Sample Input
			java 100
			cpp 65
			python 50
			
			Sample Output
			================================
			java           100 
			cpp            065 
			python         050 
			================================
			*/
			 for(int i=0;i<3;i++){
	                String s1=sc.next();
	                int x=sc.nextInt();
	                System.out.printf("%-15s", s1);
	                System.out.printf("%03d",x);
	                System.out.println();
	               
	            }
	            System.out.println("================================");
	    }

}
//