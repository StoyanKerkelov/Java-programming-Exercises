import java.util.Scanner;

public class IntArrayComparer {
	/*Write a program that reads two arrays of the console and checks if they are the same. */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		boolean same = true;

		int[] arrayFirst = new int[n];
		for (int i = 0; i < n; i++) {
			arrayFirst[i] = i;
		}

		int[] arraySecond = new int[m];
		System.out.println("if you want to change the initial value of the counter for array 2, \n" +
				"then press digit other than 0");
		int j  = reader.nextInt();
		for (; j < m; j++) {
			arraySecond[j] = j;
		}
		
		if (m != n) {
			System.out.println("These are different arrays");
		} else {
			for (int k = 0; k < arrayFirst.length; k++) {
				if (arrayFirst[k] != arraySecond[k]) {
					same = false;
				}
			}
			if (same){
				System.out.println("These arrays are the same");
			} else{
				System.out.println("These are different arrays");
			}
		}
	}
}
