import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	/*
	 * Write a program that sorts an integer array by "Quick sort" algorithm.
	 * 
	 * 1. Pick an element, called a pivot, from the array.
	 * 
	 * 2. Partitioning: reorder the array so that all elements with values
	 * less than the pivot come before the pivot, while all elements with
	 * values greater than the pivot come after it (equal values can go
	 * either way). After this partitioning, the pivot is in its final
	 * position. This is called the partition operation.
	 * 
	 * 3. Recursively apply the above steps to the sub-array of elements
	 * with smaller values and separately to the sub-array of elements with
	 * greater values./
	 */

	public static int Partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot){i++;}
			while (arr[j] > pivot){j--;}
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}

	public static void QuickSort(int arr[], int left, int right) {
		int index = Partition(arr, left, right);
		if (left < index - 1)
			QuickSort(arr, left, index - 1);
		if (index < right)
			QuickSort(arr, index, right);
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Type the count of elements the array");
		int n = reader.nextInt();
		int array[] = new int [n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		QuickSort(array, 0, array.length - 1);
		////////////// print result //////////////
		System.out.println(Arrays.toString(array));
	}
}
