import java.util.Scanner;


public class CheckForPrime {

	/*Write a program that checks whether a given number (n <100) is odd.
	 */
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		int num = reader.nextInt();
	
		if (  (num < 1) || ( num > 100) ) {
	        	    System.out.println("Out of reach");
	            } else if ( num == 2 || num == 3 || num == 5 || num == 7) {
	        	    	System.out.println("Prime");
	            } else if ( num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) { // Checks division with reminder
	        		    System.out.println("Truly Prime");
	            } else {
	        	    System.out.println("No, not a prime");
	            }
	}
}
