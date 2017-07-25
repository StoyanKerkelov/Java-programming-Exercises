import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlass {
	/*You are given a  6x6 2D array.
	 	     Sample Input
			1 1 1 0 0 0
			0 1 0 0 0 0
			1 1 1 0 0 0
			0 0 2 4 4 0
			0 0 0 2 0 0
			0 0 1 2 4 0
		
		Sample Output
			     19
		
	 * The sum of an hourglass is the sum of all the numbers within it.
		2 4 4
	  	   2
		1 2 4 .*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for (int k = 0; k < 4; k++) {
			for (int l = 0; l < 4; l++) {
				int temp = 	arr[k][l] + arr[k][l + 1] + arr[k][l + 2]					//x x+1 x+2
									+ arr[k + 1][l + 1]							//	y
						+ arr[k + 2][l] + arr[k + 2][l + 1] + arr[k + 2][l + 2];			//z z+1 z+2

				if (sum < temp) {
					sum = temp;
				}
			}
		}
		System.out.print(sum);
	}
}
