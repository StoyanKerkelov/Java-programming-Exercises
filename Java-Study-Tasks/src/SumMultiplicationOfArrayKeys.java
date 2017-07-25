import java.util.Arrays;
import java.util.Scanner;

//sum two arrays
public class SumMultiplicationOfArrayKeys {
	public static void main(String[] args) {
		System.err.println("generate two random arrays, print their summation");
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int array1[] = new int[n];
		for (int i = 0; i < n; i++) {
			array1[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array1));
		
		int m = reader.nextInt();
		int array2[] = new int[m];
		for (int i = 0; i < m; i++) {
			array2[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array2));
		
		System.out.println("The sum of both is:");
		int result =0;
		
		for (int i=1; i < n; i++){
			for(int j = 1; j < m; j++){
				result += array1[i]*array2[j];
			}
		}
		System.out.println(result);
	}
}
