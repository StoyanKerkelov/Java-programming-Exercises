import java.util.Scanner;

public class LexicographicalSum {

	/* Write a program that compares two char types
	lexicographically (letter-by-letter) and check which of the two is earlier in
	lexicographical layout.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int sumFirst = 0;
		int sumSecond = 0;

		System.out.println("Submit char array size and it members:");
		int n = reader.nextInt();
		char[] arrayFirst = new char[n];
		for (int i = 0; i < n; i++) {
			arrayFirst[i] = reader.next().charAt(0);
		}
		for (int lexic : arrayFirst) {
			sumFirst += lexic;							//lexicographical sum 1
		}
		System.out.println(java.util.Arrays.toString(arrayFirst));

		System.out.println("Submit second char array size and it members:");
		int m = reader.nextInt();
		char[] arraySecond = new char[m];
		for (int j = 0; j < m; j++) {
			arraySecond[j] = reader.next().charAt(0);
		}
		for (int lexic2 : arraySecond) {
			sumSecond += lexic2;						//lexicographical sum 2
		}
		System.out.println(java.util.Arrays.toString(arraySecond));

		if (sumFirst == sumSecond) {
			System.out.println("lexicographically, the char arrays are equal");
		} else if (sumFirst > sumSecond) {
			System.out.println("lexicographically, the first char array is bigger");
		} else { // sumFirst < sumSecond
			System.out.println("lexicographically, the first char array is smaller");
		}
	}
}
