import java.util.Scanner;

public class BrakedownNumber {

	/*
	 * By a given natural number n, find all possible unmatched
	 * representations of n as a sum of natural numbers (not necessarily
	 * different). So For example, the number 5 can be broken down in the
	 * following 7 ways:
	 * 
	 * 5 = 5
	 * 5 = 4 + 1
	 * 5 = 3 + 2 
	 * 5 = 3 + 1 + 1 
	 * 5 = 2 + 2 + 1
	 * 5 = 2 + 1 + 1 +1 
	 * 5 = 1 + 1 + 1 + 1 + 1
	 * 
	 * The algorithm for decomposition is recursive: decompose (0) = {}
	 * decompose(n) = {k} + decompose(n–k), k = n, n–1,...,1.
	 * 
	 * We must be careful to avoid generating repetitive breaks, such as: 5
	 * = 3 + 2 5 = 2 + 3
	 * 
	 * The latter is easy to do: we will ask for each next collector to be
	 * less than or equal to the previous one. The recursive function that
	 * performs the breakdown has Two arguments: N (number to breakdown) and
	 * Pos - variable, showing how many times the number has been broken up.
	 */

	public static int n;
	public static int mp[] = new int[101]; // store result

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("n=");
		n = reader.nextInt();
		reader.close();
		mp[0] = n + 1;
		devNum(n, 1);
	}

	public static void print(int length) {
		for (int i = 1; i < length; i++) {
			System.out.printf("%d+", mp[i]);
		}
		System.out.printf("%d", mp[length]);
		System.out.println();
	}

	public static void devNum(int n, int pos) {
		if (0 == n) {
			print(pos - 1);
		} else {
			for (int k = n; k >= 1; k--) {
				mp[pos] = k;
				if (mp[pos] <= mp[pos - 1])
					devNum(n - k, pos + 1);
			}
		}
	}
}
