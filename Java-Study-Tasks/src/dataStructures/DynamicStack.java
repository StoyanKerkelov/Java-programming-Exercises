package dataStructures;

class SNode {
	public int data;
	public SNode next;
	
	public SNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class DynamicStack {

	/**Create  Implementaion of DynamicStack class Add methods for the necessary operations.
	 * 
	 * The dynamic implementaion of the queue is very similar to that of single linked  List. The 
	 * elements again contain two parts - the object and a pointer to the previous element
	 *  however, the items are ADDED to the TOP, and removed FROM the TOP because we
	 *  have not allowed to take or add elements elsewhere.
	 */
	
	public SNode head;
	public int size = 0;
	
	public DynamicStack() {
		head = null;
	}
	////////////METHODS////////////
	/** Adding items happens only to the tail*/
	public void addItem(int data){
		SNode newNode = new SNode(data);
		newNode.next = head;
		head = newNode;
		size++;	
	}
	/** Deleting items happens only from the head*/
	public void deleteLastItem(){
		head = head.next;
		size--;
	}
	/**Get value at Index : Return the ele­ment at spe­cific index, if index is greater than the size then return –1. its O(n) in worst case.*/
	public int getValAtIndex(int data){
		SNode newNode = head;
		int count = 1;
		while(newNode != null){
			if(newNode.data == data){
				return count;					// for nth-data return counted value
			} else {
				newNode = newNode.next;
				count++;
			}
		}
		return -1;								//if no such thing exists just return -1
	}
	/**Get Ele­ment at  : Return the ele­ment from that element spe­cific index*/
	public int getIndexOfVal(int index){
		if (index > size){							//no index is bigger than size
			return -1;
		}
		SNode newNode = head;					
		while (index-1 != 0){						
			newNode = newNode.next;			
			index--;								
		}
		return newNode.data;					// data is int
	}
	public void display(){
		System.out.print("Top");
		SNode currentNode = head;
		while (currentNode != null){
			System.out.print("->" + currentNode.data);
			currentNode = currentNode.next;
		}
		System.out.printf("->Null(null)%n");
	}
	/**Get Size: returns the size of the Dynamic stack.*/
	public int getSize(){
		return size;
	}
	public static void main(String[] args) {
		DynamicStack dS = new DynamicStack();
		dS.display();
		System.out.println("We have added  values from 1 to 7 to our dynamic stack, that looks like this:");
		for(int i = 1; i <= 7; i++){
			dS.addItem(i);
		}
		dS.display();
		System.out.println("After deleting the head element twice:");
		dS.deleteLastItem();dS.deleteLastItem();
		dS.display();
		System.out.println("Filled with numbers up to 10 our stack is now:");
		for(int i = 6; i <= 10; i++){
			dS.addItem(i);
		}
		dS.display();
		System.out.println("Now the size of the stack is " + dS.getSize());
		System.out.printf("Node with value %d is in position %d%n",		 4, dS.getIndexOfVal(4));
		System.out.println("Element at 2nd position is " + dS.getValAtIndex(2));
		System.out.printf("Asking for incorrect position %d results in non-proper value %d%n",12 , dS.getValAtIndex(12));
		System.out.printf("Also non-existing value, for example:  %d, has a position of: %d%n",		 112, dS.getIndexOfVal(112));
	}
}

