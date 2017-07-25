import java.util.Arrays;
import java.util.Scanner;

public class LongestSameNumContinuation {

	/* find the most popular consecutive element in array
	 * Example: [10] {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} -> {2, 2, 2}.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = reader.nextInt();
		}

		int count = 1, tempCount;	//start counting occurrences from 1
		int result = array[0];	// just for initialization it will store the result later
		int temp = 0;			// use for comparison 

		for (int i = 0; i < (array.length - 1); i++) {
			temp = array[i];
			tempCount = 0;
			
			for (int j = 1; j < array.length; j++) {	//start counting repetitive numbers
				if (temp == array[j])			//only if temp [x] == temp[x+1] tempcount ++
					tempCount++;
			}
			if (tempCount > count) {		//if tempCount > count (1 at start) 
				result = temp;			// popular = temp	(store element name)
				count = tempCount;		// store the counting
			}
		}
		
		int newArr[] = new int[count-1];
		for (int i = 0; i < count - 1; i++) {
			newArr[i] = result;
		}
		System.out.println(Arrays.toString(newArr));
	}
}
