import java.util.Scanner;


public class NumbersOfNfactorielResult {

	/* calculate the number of digits in the result of N! without actual factoriel calculation
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		double digits = 1;
		for (int i = 1; i < n ; i++){
			digits += Math.log10(i);
		}
		System.out.println((int)(Math.ceil(digits)));
	}
}
