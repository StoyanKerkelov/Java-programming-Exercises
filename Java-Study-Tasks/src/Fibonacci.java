import java.util.Scanner;

public class Fibonacci {

	/*Write a program that reads the number N from the console and prints it
	* The sum of the first N members of the Fibonacci line:
	*  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Please submit count number for the length of  Fibonacci series");
		int length = reader.nextInt();

		long first = 0; 		// by default
		long second = 1;		// by default
		long third = 0;

		System.out.printf("%d,%d", first, second);

		for (int i = 3; i <= length; i++) {		//you start the count from third digit
			third = first + second;
			System.out.printf(", %d", third);
			first = second;
			second = third;
		}
	}
}
