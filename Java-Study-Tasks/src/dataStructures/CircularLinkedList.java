package dataStructures;

/**NOTE: we are two ref­er­ences here, head and tail.
 *  Head points the start of the linked list and tail points to the last node of the linked list.*/
class CirNode{
	int data;
	CirNode next;
	public CirNode(int data){
		this.data = data;
	}
}

public class CircularLinkedList {

	public int size = 0;
	public CirNode head = null;
	public CirNode tail = null;
	
	 //Add at the Start : Add a node the begin­ning of the linked list. Its O(1). If size is 0 then make the new node as head and tail else put the at the start, change the head and do not change the tail.
	public void addNodeAtStart(int data){
		  System.out.println("Adding node " + data + " at start");
		  CirNode n = new CirNode(data);
		  if(size == 0 ){
			  head = n;
			  tail = n;
			  n.next = head;
		  } else {
			  CirNode temp = head;
			  n.next = temp;
			  head = n;
			  tail.next = head;
		  }
		  size++;
	}
	/**Add at the End : Add a node at the end of the linked list. its O(1) since we have tail ref­er­ence. 
	If size is 0 then make the new node as head and tail, else put node at the end of the list using
	tail ref­er­ence and make the new node as tail.*/
	public void addNodeAtEnd(int data){
		if(size ==0){
			addNodeAtStart(data);
	        }else{
	        	CirNode n = new CirNode(data);
	    		tail.next =n;
			tail=n;
			tail.next = head;
			size++;
	        }
        System.out.println("Node " + data + " is added at the end of the list");
	}
	//Delete at the Start : Delete a node from begin­ning of the linked list and make the head points to
	//the 2nd node in the list. Its O(1).
	public void deleteNodeFromStart(){
		if(size == 0){
			 System.out.println("\nList is empty");
		}else{
			 System.out.println("\ndeleting node " + head.data + " from start");
			 head = head.next;
			 tail.next = head;
			 size--;
		}
	}
	//Get Ele­ment at Index : Return the ele­ment at spe­cific index, if index is greater than the size then
	//return –1. its O(n) in worst case.
	public int elementAt(int index){
		if(index > size){
			return -1;
		}
		CirNode n = head;
		while(index-1!=0){
			n = n.next;
			index--;
		}
		return n.data;
	}
	//Get Size: returns the size of the linked list.
	public int getSize(){
		return size;
	}
	//Print: Prints the entire linked list. O(n).
	public void print(){
		System.out.println("Circular Linked List:");
		CirNode temp = head;
		if(size <= 0){
			System.out.println("List is empty");
		}else{
			do{
				System.out.print(" " + temp.data);
				temp = temp.next;
			}
			while(temp != head);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	        CircularLinkedList c = new CircularLinkedList();
	        c.addNodeAtStart(3);
	        c.addNodeAtStart(2);
	        c.addNodeAtStart(1);
	        c.print();
	        c.deleteNodeFromStart();
	        c.print();
	        c.addNodeAtEnd(4);
	        c.addNodeAtEnd(5);
	        c.addNodeAtEnd(6);
	        c.addNodeAtEnd(7);
	        c.addNodeAtEnd(8);
	        c.addNodeAtEnd(9);
	        c.print();
	        System.out.println("Size of linked list: "+ c.getSize());
	        System.out.println("Element at 2nd position: "+ c.elementAt(2));
	    } 
}
