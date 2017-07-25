import java.util.Scanner;


public class MoveBit2 {

	/*Given a number n, value v (v = 0 or 1) and position p. Write 
	a series of operations to change the value of n, so that the bit on
	position p has a value v. 
	Example: 
	n = 35, p = 5, v = 0-> n = 3. 
	n = 35, p = 2, v = 1 -> n = 39.
	 */
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		
		int num = reader.nextInt();	//input num
		int pos = reader.nextInt();	// bit position
		int value = reader.nextInt(); //bit value
		
		int mask = value << pos;
		
		int newNum = num | mask;
		
		System.out.println(num +" with bit position " + pos + " and new bit value of " + value + " now is " + newNum);
		
	}
}
