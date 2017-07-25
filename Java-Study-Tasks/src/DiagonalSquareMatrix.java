import java.io.IOException;
import java.util.Scanner;

public class DiagonalSquareMatrix {
	//write a square matrix that fills diagonally
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			System.out.printf("Matrix %dx%d looks like this:", n, n);
			int matrix1 [] [] = new int [n][n];
			int counter = 1;
			System.out.println();
			for(int row =0; row < n; row++){
				for(int col = 0; col < n; col++){
					System.out.print(counter+ " ");
					counter++;
				}
				System.out.println();
			}
			System.out.println();
		int val = 1;
		 for (int i = n-1 ; i >= 0; i--){	 //  lowest row up
			 for (int col = 0; col < n - i; col++){ //left 
				 matrix1[i+col] [col] = val++;//add value at [(row+x), x] {diagonally to the left}
			 }
		 }
		 for (int j = 1; j < n; j++){ // for column from left to right
			 for (int row = 0; row < n - j; row++){// row from leftwards to rightest possible check
				   //counter continues from before
				 matrix1[row] [ j + row] = val++;//add value at [x, (row+x)] {diagonally to the left}
			 }
		 }
		 System.out.println("form left to right upwards");
		 for(int row =0; row < n; row++){
				for(int col = 0; col < n; col++){
					System.out.print(matrix1[row][col] + " ");
				}
				System.out.println();
		}
	}
}
