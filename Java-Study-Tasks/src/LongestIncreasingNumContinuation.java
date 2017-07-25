import java.util.Scanner;

public class LongestIncreasingNumContinuation {

	/*Write a program that finds the maximum number of rising 
	 elements in an array. Example: [7] {3, 2, 3, 4, 2, 2, 4} -> {2, 3, 4}.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = reader.nextInt();
		}

		int count = 1, tempCount = 0;		 // start counting occurrences from 1
		int result = array[0];				 // just for initialization it will store the result later
		int temp = 0;					 // use for comparison

		for (int i = 0; i < (array.length - 1); i++) {
			
			if (array[i] + 1 == array[i+1])  { 
				tempCount++;
				temp = array[i];	// this will save the before-last member of the ascending order
				}
			
			if (tempCount > count) { // if tempCount > count (1 at start)
				result = temp; // popular = temp (store element name)
				count = tempCount; // store the counting
			}
			
		}
		result++;		// from before-last to getting last member
		count++; 		// the last accsecion is not counted ( it doesn't meets check)
		
		int start = result - count + 1;	 //take the last member value (result)
		//remove counts but not the first counted member from them - counts +1
		
		int presentation[] = new int[count];
		for ( int k = 0; k < count; k++){
			presentation[k] = start;
			start++;
		}
		System.out.println(java.util.Arrays.toString(presentation));
	}
}
