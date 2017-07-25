import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

/* Write a program that sorts an integer array by merge sort algorithm.
	1. The unsorted list is arbitrarily divided into two subsets of approximately same length
	2. Sublist are divided recursively until single-length lists are reached
	3. Lastly two sub-lists are then merged into a new sorted list (for linear time) */
	
	 static public void DoMerge(int[] numbers, int left, int mid, int right)
	        {
	            int[] temp = new int[numbers.length];
	            int i, left_end, num_elements, tmp_pos;

	            left_end = (mid - 1);
	            tmp_pos = left;							//starts from numbers[0]
	            num_elements = (right - left + 1);

	            while ((left <= left_end) && (mid <= right))	//while in {a...mid....z}   a<mid && mid<z
	            {
	                if (numbers[left] <= numbers[mid]) temp[tmp_pos++] = numbers[left++];
	                else temp[tmp_pos++] = numbers[mid++];
	            }

	            while (left <= left_end) temp[tmp_pos++] = numbers[left++];

	            while (mid <= right) temp[tmp_pos++] = numbers[mid++];

	            for (i = 0; i < num_elements; i++)	//reorder
	            {
	                numbers[right] = temp[right];
	                right--;
	            }
	        }
	  static public void MergeSort_Recursive(int[] numbers, int left, int right)
	        {	//	divide recursively
	            int mid;

	            if (right > left)//devide in two parts recursively untill there is no more to devide
	            {
	                mid = (right + left) / 2;
	                MergeSort_Recursive(numbers, left, mid);
	                MergeSort_Recursive(numbers, (mid + 1), right);
	                		
	                DoMerge(numbers, left, (mid + 1), right);	// order and merge back together
	            }
	        }
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] array = new int[n];
		for (int k = 0; k < n; k++) {
			array[k] = reader.nextInt();
		}
		System.out.println(Arrays.toString(array));
		System.out.println();
		MergeSort_Recursive(array, 0, array.length - 1);//start devision between [0, n-1]

					///////////// print result //////////////
          	for (int i = 0; i < array.length; i++ ) {
          		 System.out.print(array[i] +", " );
        	    }
	}
}
