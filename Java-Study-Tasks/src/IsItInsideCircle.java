import java.util.Scanner;


public class IsItInsideCircle {

	/*Write a program that checks whether a point O (x, y) is inside
	a circle K ((0,0), 5).
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		int a = reader.nextInt();
		int b = reader.nextInt();

		if ( ((a*a) + (b*b)) <= 25) {
			System.out.println("It\'s within the circle with radius of 5");
		} else {
			System.out.println("It\'s outside the circle with radius of 5");
		}
	}
}
