import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class CheckNeighborElements {

	/*Write a method that checks if an item located on a given
	position of an array is larger or smaller than both of its
	Neighbor.
	 */
	
	public static void Comparer(int[] array, int element) throws IOException, IndexOutOfBoundsException  {
		
		int before = array[element-1];
		int comparer = array[element];
		int after = array[element+1];
		if(comparer > before && comparer > after){//> >
			System.out.println(array[element] + " is bigger than " + array[element-1] + " and " +  array[element+1]);
		} else if (comparer > before && comparer < after){ //> <
			System.out.println(array[element] + " is bigger than " + array[element-1] + " but smaller than " +  array[element+1]);
		} else if (comparer < before && comparer > after){ //< >
			System.out.println(array[element] + " is smaller than " + array[element-1] + " but bigger than " +  array[element+1]);
		} else if (comparer < before && comparer < after){ // < <
			System.out.println(array[element] + " is smaller than " + array[element-1] + " and " +  array[element+1]);
		} else if (comparer == before && comparer == after){ // = =
			System.out.println(array[element] + " is equal to " + array[element-1] + " and " +  array[element+1]);
		} else if (comparer == before && comparer > after){ // = >
			System.out.println(array[element] + " is equal to " + array[element-1] + " but bigger than " +  array[element+1]);
		} else if (comparer == before && comparer < after){ // = <
			System.out.println(array[element] + " is equal to " + array[element-1] + " but smaller than " +  array[element+1]);
		} else if (comparer > before && comparer == after){ // > =
			System.out.println(array[element] + " is bigger than " + array[element-1] + " but equal to " +  array[element+1]);
		} else if (comparer < before && comparer == after){ // < =
			System.out.println(array[element] + " is smaller than " + array[element-1] + " but equal to " +  array[element+1]);
		} 
	}
	public static void main(String[] args){

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("Type element\'s INDEX, for check");
		int element = reader.nextInt();
			try{
			Comparer(array, element);
		} catch (IndexOutOfBoundsException e){
			System.out.println("Wrong input!");
			//e.printStackTrace();
		} catch (IOException e){
			System.out.println("Wrong input!");
			//e.printStackTrace();
		}
			
	}
}
