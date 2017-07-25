import java.util.Scanner;

public class MostCommonInteger {

	/*Write a program that finds the most common element in an array.
	Example: [13] {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} -> 4 (5 times). */
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = reader.nextInt();
		}
		///////// SORT SELECT /////////
		
		for (int i = 0; i < n-1; i++) 
		  {
			int min = i;
			
		    for (int j = i+1; j < n; j++) {
		        if (array[j] < array[min]) {
		        	min = j;
		        }
		    }
		    if(min != i) {	// swap(array[i], array[min]);
			   int temp = array[i];
			   array[i] = array[min];
			   array[min] = temp;
		    }
		}
		System.out.println(java.util.Arrays.toString(array));
		
		///////// find longest repetition /////////
		int count = 1, tempCount;	//start counting occurrences from 1
		int result = 0;				// just for initialization it will store the result later
		int temp = 0;				// use for comparison 

		for (int i = 0; i < (array.length - 1); i++) {
			temp = array[i];
			tempCount = 0;
			
			for (int j = 1; j < array.length; j++) {	//start counting repetitive numbers
				if (temp == array[j])				//only if temp [x] == temp[x+1] tempcount ++
					tempCount++;
			}
			if (tempCount > count) {		//if tempCount > count (1 at start) 
				result = temp;			// popular = temp	(store element name)
				count = tempCount;		// store the counting
			}
		}
		System.out.printf(result + " (%s times)", count);
	}
}
