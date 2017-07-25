import java.util.Scanner;


public class MoveBit {

	/*Given a Number n and position p, write a series of operations that
	To print the value of the bits to position p of the number n (0 or 1).
	Example: n = 35 (0010 0011), p = 5 -> 1. Another example: n = 35 (0010 0011), p = 6 -> 0.
	 */
	public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	
	int begin = 1; // 0000 0001
	int num = reader.nextInt();	//input num
	int pos = reader.nextInt();	// position of num that we want to print

	int mask = begin << pos; // shift mask from begin to position pos
	
	// If i & mask are positive then the pos-th bit of num is 1
	
	System.out.println((num & mask) != 0 ? 1 : 0);
		
	}
}
