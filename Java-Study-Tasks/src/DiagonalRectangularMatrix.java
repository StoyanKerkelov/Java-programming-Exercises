import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalRectangularMatrix {
	//write a rectangular matrix that fills diagonally
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// create an M x N array
		int rows = in.nextInt();
		int columns = in.nextInt();
		
		///////Make straight matrix////////
		int[][] testData = new int[rows][columns];
		System.out.printf("Matrix %dx%d looks like this:\n", rows, columns);
		// iteratively add numbers
		int counter = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				testData[i][j] = ++counter;
			}
		}
		/*
		// print our test array
		printArray(testData);
		System.out.println("");
		*/
		///////Make diagonal matrix////////
		
		printArray(diagonal(testData));// & print our diagonal array
	}

	static void printArray(int[][] array) {
		// get number of digits
		int count = array.length * array[0].length;
		// get power of function
		int power;

		for (power = 0; count / Math.pow(10, power) > 1; power++)
			;

		for (int i = 0; i < array.length; i++) {
			System.out.print("|");
			for (int j = 0; j < array[0].length; j++) {
				// Let's say Power is 0. That means we have a
				// single-digit number, so we need
				// +1 for the single digit. I throw in 2 to make
				// it extra wide
				System.out.print(String.format(
						"%"+ Integer.toString(power + 2)+ "s",
						Integer.toString(array[i][j])));
			}
			System.out.println(" |");
		}
	}

	static int[][] diagonal(int[][] input) {
		// our array info
		final int numRows = input.length;
		final int numColumns = input[0].length;
		int[][] result = new int[numRows][numColumns];

		// this is our mobile index which we will update as we go
		// through
		// as a result of certain situations
		int rowIndex = 0;
		int columnIndex = 0;
		// the cell we're currently filling in
		int currentRow = 0;
		int currentColumn = 0;
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				result[currentRow][currentColumn] = input[i][j];
				// if our current row is at the bottom of the
				// grid, we should
				// check whether we should roll to top or come
				// along
				// the right border
				if (currentRow == numRows - 1) {
					// if we have a wider graph, we want to
					// reset row and
					// advance the column to cascade
					if (numRows < numColumns
							&& columnIndex < numColumns - 1) {
						// move current row down a line
						currentRow = 0;
						// reset columns to far right
						currentColumn = ++columnIndex;
					}
					// if it's a square graph, we can use
					// rowIndex;
					else {
						// move current row down a line
						currentRow = ++rowIndex;
						// reset columns to far right
						currentColumn = numColumns - 1;
					}
				}
				// check if we've reached left side, happens
				// before the
				// top right corner is reached
				else if (currentColumn == 0) {
					// we can advance our column index to
					// the right
					if (columnIndex < numColumns - 1) {
						currentRow = rowIndex;
						currentColumn = ++columnIndex;
					}
					// we're already far right so move down
					// a row
					else {
						currentColumn = columnIndex;
						currentRow = ++rowIndex;
					}
				}
				// otherwise we go down and to the left
				// diagonally
				else {
					currentRow++;
					currentColumn--;
				}

			}
		}
		return result;
	}
}