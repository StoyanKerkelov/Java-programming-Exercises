import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	/* Perform a binary search in an integer array.
	 Hint: binary search works on already sorted arrays, so I'm using selection sort method for
	 preporation of the array.*/
	
	public static void SelectionSort(Scanner reader, int array[]) {
		
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (min != i) {
				// swap(array[i], array[min]);
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
	}
		
	public static void binarySearch(int x, int n, int[] array) {
		
		int min = 0;
		int max = n;
		int mid;
		System.out.print("In sorted array:");
		System.out.println(java.util.Arrays.toString(array));
		System.out.print("Integer " + x + " has index of: ");
		while (true) // in loop until completion with "return"
		{
			mid = (min + max) / 2;	//middle INTEGER value
			if (x > array[mid]) {
				min = mid + 1; // min----------------mid--------x--------max//
			} else {
				max = mid; // min---------x------mid----------------max//
			}
			if (min == max || min == max - 1) // after filtering
			{
				if (array[min] == x) {
					System.out.println(min);//result
					return;
				} else if (array[max] == x) {
					System.out.println(max);//result
					return;
				} else {
					System.out.print(-1);//no result
					System.out.print(", in other words, we didn't find acurrence");
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		
		int n = reader.nextInt();
		int[] array = new int[n];
		for (int k = 0; k < n; k++) {
			array[k] = random.nextInt(100);
		}
		System.out.println(java.util.Arrays.toString(array));
		SelectionSort(reader, array);	//only sorts the array
		System.out.println("Please submit integer to be searched via binary search");
		int x = reader.nextInt();
		binarySearch(x, n, array);
	}
}
