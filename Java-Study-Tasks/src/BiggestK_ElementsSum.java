import java.util.Scanner;

public class BiggestK_ElementsSum {

	/*Write a program that reads from the console two integers N and K,
	* and the members of array with N elements. Find these K elements, that have biggest amount.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("How much consecutive elements from an array to be added together?");
		int k = reader.nextInt();

		System.out.println();
		System.out.println("How much elements are in that array, (must be more than the fist line)");
		int n = reader.nextInt();
		System.out.println("Input them");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = reader.nextInt();
		}
		System.out.printf("biggest sum of %d consecutive elements from  ",k);
		
		int Sum = 0;
		int tempSum=0;
		for (int i = 0; i < n-k+1; i++) {
			tempSum = array[i];
			for (int j = 1; j < k; j++) {
				tempSum+=array[i+j];
			}
			if(tempSum > Sum) {
				Sum = tempSum;
			}
		}
		System.out.println(java.util.Arrays.toString(array));
		System.out.println("is " +Sum);
		
	}
}
