import java.util.LinkedList;


public class BubleSortList {

	/**Realize sorting of numbers in a dynamic linked list without the use of extra array. */
	/**Use  DynamicList.java class*/
	
	public static void main(String[] args) {
		
		 LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		      // add elements to the linked list 3, 60, 35, 2, 45
			linkedlist.add(3);linkedlist.add(60);linkedlist.add(35);linkedlist.add(2);linkedlist.add(45);
			int n = linkedlist.size();
			
			System.out.println("before sorting: ");
			for (int i = 0; i < n ; i++){
				System.out.print(linkedlist.get(i) + " ");
			}	
			System.out.println();
			//bubble method
			for(int i = 0; i < n - 1; i++){
				for(int j = 0; j < (n - i - 1); j++){
					if( linkedlist.get(j) > linkedlist.get(j+1) ){
						int temp = linkedlist.get(j);
						linkedlist.set(j, linkedlist.get(j+1));
						linkedlist.set(j + 1, temp);
					}
				}
			}
			//print result
			System.out.println("After sorting:");
			for (int i = 0; i < n; i++){
				System.out.print(linkedlist.get(i) + " ");
			}	
	}
}
