
	/**
	 * Insertion sort is a simple sorting algorithm that works the way we sort playing 
	 * cards in our hands.
	 * Algorithm:
	InsertionSort(arr, n)
	1. Loop from i = 1 to n-1.
	2. Pick element arr[i] and insert it into sorted sequence arr[0…i-1]
	
	12, 11, 13, 5, 6
	Let us loop for i = 1 (second element of the array) to 5 (Size of input array)
	i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12
	11, 12, 13, 5, 6
	i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13
	11, 12, 13, 5, 6
	i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.
	5, 11, 12, 13, 6
	i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.
	5, 6, 11, 12, 13
	 */

public class InsertionSort {

	/*Function to sort array using insertion sort*/
	void sort(int arr[]){
		for(int i = 1; i < arr.length; i++){
			int currentValue = arr[i];
			int j = i - 1;
			
	   /* We need to compare the whole array not only the neighbours, so if we conclude that
	    * the previous is bigger then the current, we switch them, AND we continue to check
	    * if that is the case again and again....
	    */
			while (j >= 0 && arr[j] > currentValue){
				arr[j + 1] = arr[j];	// current is now prev
				j = j - 1;			// prev is the previous of prev
			}
			arr[j + 1] = currentValue;	//after check currentValue is the vale of lastly checked [j pos + 1]
		}
	}
	
	static void printArray(int arr[]){
		for(int i = 0; i < arr.length; ++i){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6};
		printArray(arr);
		
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		printArray(arr);
	}
}
