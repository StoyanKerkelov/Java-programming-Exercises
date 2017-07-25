import java.util.Arrays;
import java.util.Scanner;

public class PrintBiggerThenNeighborElements {

	/* Write a method that returns the position of the first element of an array,
	which is larger than both of its neighbors at the same time, or -1 if there is no
	such element.
	 */

	public static void Searcher(int[] array) {

		/*int before = 0; int comparer = 1; int after = 2;
		 */
		boolean NOPE = true;
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				System.out.println(array[i] + " with index "
						+ i + " is bigger than "
						+ array[i - 1] + " and "
						+ array[i + 1]);
				NOPE = false;
				break;
			}
		}
		if (NOPE) {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array));
		Searcher(array);
	}
}