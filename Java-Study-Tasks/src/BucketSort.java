import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BucketSort {

	public static void sort(int[] a, int maxVal) {
		//make bucket array
		int[] bucket = new int[maxVal + 1];
		//fill it with 0 values
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}
		//for every occurrance of val == arraykey, arraykey++
		for (int i = 0; i < a.length; i++) {
			bucket[a[i]]++;
		}
		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				a[outPos++] = i;
			}
		}
	}

	public static void main(String[] args) {
		int[] data = new int [10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			data[i] = Math.abs(random.nextInt(100));
		}
		int maxVal = maxValue(data);
		printArray(data);
		sort(data, maxVal);
		printArray(data);
	}
	
	static void printArray(int arr[]){
		for(int i = 0; i < arr.length; ++i){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	 static int maxValue(int[] sequence) 
	    {
	        int maxValue = 0;
	        for (int i = 0; i < sequence.length; i++)
	            if (sequence[i] > maxValue)
	                maxValue = sequence[i];
	        return maxValue;
	    }
}
