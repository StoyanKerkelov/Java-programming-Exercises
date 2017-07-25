import java.util.Scanner;

public class Factorial1DevidebyFactorial2 {

	/*Write a program that calculates N! / K! For given N and K (1 <K <N).
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("for N!/K! , first submit N (larger), then K (smaller), but beware 1<K<N ");
		int N = reader.nextInt();
		int K = reader.nextInt();
		int result = 1;
		
		if (K < 0 || N < 0 || K >= N){
			System.out.println("Wrong input, can\'t compute");
		} else {
			for (int rest  = (N - K); rest > 0; rest--){
				result *= K + rest;
			}
			System.out.printf("%d!/%d! = %d ", N, K, result);
		}
	}
}
