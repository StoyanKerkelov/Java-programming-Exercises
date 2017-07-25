import java.util.Scanner;
import static java.lang.Math.abs;

public class SumOfProgression {

	/*Write a program that for a given integer N computes the sum: S = 1 + 1! / X + 2! / X ^ 2 + ... + n! / Z ^ n
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("for S= 1+ 1!/x + 2!/x^2 + ...+ n!/x^n, first submit N, then x");
		double n = reader.nextDouble();
		double x = reader.nextDouble();
		double result = 1;
		double XtoPower = 1;
		double factorielN = 1;
		if (n < 1 || Math.abs(n) > 10 || Math.abs(x) < 0.5
				|| Math.abs(x) > 100) {
			System.out.println("Invalid input");
		} else {
			for (int i = 1; i < n; i++) {
				factorielN *= i;
				XtoPower *= x;
				result += (factorielN / XtoPower);
			}
		}
		System.out.printf("%.4f", result);
	}
}
