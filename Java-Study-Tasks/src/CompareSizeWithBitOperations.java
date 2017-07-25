import java.util.Scanner;


public class CompareSizeWithBitOperations {

	/*Write a program that reads from the console two integers and prints
	The greater of them. The algorithm of the program mustn't use 
	comparison!
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = a - b;
		int k = (c >> 31) & 0x1;//will result either 1 or -1
		    
		    /*c >> 31) shifts the number down 31 bits, leaving the highest bit of the number in the 
		      spot for the lowest bit. The next step of taking this number and ANDing it with 1 (whose 
		      binary representation is 0 everywhere except the last bit) erases all the higher bits and 
		      just gives you the lowest bit. Since the lowest bit of  c >> 31 is the highest bit of c, this
		      reads the highest bit of c as either 0 or 1. Since the highest bit is 1 iff c is 1, this is a way
		      of checking whether c is negative (1) or positive (0). Combining this reasoning with the 
		      above, k is 1 if a < b and is 0 otherwise.
		     */
		int max = a - k * c; 
		    //If a < b, then k == 1 and k * c = c = a - b, and so  a - k * c = a - (a - b) = a - a + b = b
		    // a>= b, then k == 0 and a - k * c = a - 0 = a
		System.out.println(max);
	}
}
