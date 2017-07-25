import java.util.Scanner;

public class NfacMULTKfacDIVNMinKfac {

	/* Write a program that calculates N! * K! / (N-K)! For given N and K.
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("for N!*K!/(N-K)! , first submit N, then K, but beware N>K>1 ");
		int N = reader.nextInt();
		int K = reader.nextInt();
		int result = 1;

		if (K < 0 || N < 0 || K >= N) {
			System.out.println("Wrong input, can\'t compute");
		} else {
			for (int rest = K; rest > 0; rest--) {
				result *= rest;
			}
		}
		result = result * result;
		System.out.printf("%1$d!/%2$d!/ (%1$d-%2$d)!= %3$d ", N, K, result);
	}
}
