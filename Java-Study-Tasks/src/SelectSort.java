import java.util.Scanner;


public class SelectSort {

	/*Sorting an array means placing its elements in a growing order
	(or decreasing) order. Write a program that sorts an array. To
	Uses the "Selection sort" algorithm.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		System.out.println("Input array members");
		int[] array = new int[n];
		for (int h = 0; h < n; h++) {
			array[h] = reader.nextInt();
		}
		System.out.println(java.util.Arrays.toString(array));
		
		for (int i = 0; i < n-1; i++) 
		  {
			int min = i;
			
		    for (int j = i+1; j < n; j++) {
		        if (array[j] < array[min]) {
		        	min = j;
		        }
		    }
		    if(min != i) 
		    {
		       // swap(array[i], array[min]);
			   int temp = array[i];
			   array[i] = array[min];
			   array[min] = temp;
		    }
		}
		//result:
		for (int k = 0; k < n; k++) {
			System.out.println(array[k]);
		}
	}
}
