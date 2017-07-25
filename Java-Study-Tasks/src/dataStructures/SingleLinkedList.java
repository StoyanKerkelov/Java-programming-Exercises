package dataStructures;
public class SingleLinkedList {

	/**@SinglyLinkedList Implementation from http://algorithms.tutorialhorizon.com
	 *  <a href= "http://algorithms.tutorialhorizon.com/singly-linked-list-implementation/"</a>
	 */

	public SLNode head;
	public int size;

	// initialize SingleLinkedList with empty head
	public SingleLinkedList() {
		head = null;
	}

	// ////////////METHODS////////////
	/**Add at the Start : Add a node the begin­ning of the linked list. Its O(1).*/
	public void addAtBegin(int data) {
		SLNode n = new SLNode(data); 				// create node
		n.next = head; 							// linked the next of n node to head
		head = n;								//move head to n
		size++; 									// incr size
	}
	/**Add at the End : Add a node at the end of the linked list. its O(n) since to add a node at the end you need to go untill
	 *  the end of the array.*/
	public int deleteAtBegin() {
		int tmp = head.data;
		head = head.next; 						// point head to second node
		size--;									 // decr size
		return tmp;								//return head data (int) not necessary
	}
	/**Delete at the End : Delete a node from the end of the linked list. its O(n) since to delete a node at the end you 
	 * need to go till the end of the array.*/
	public void deleteAtEnd() {
		SLNode currNode = head;
		if (head.next == null) { 					// if next is empty, head is null
			head = null;
		} else {
			while (currNode.next.next != null) { 	// if the next of the next of currNode (head) is not null
				currNode = currNode.next;		//go to second to last
			}									//THEN delete the next one 
			currNode.next = null;				// erase next  (i. e . last node)
			size--; 								// decr size
		}
	}
	/**Add at the End : Add a node at the end of the linked list. its O(n) since to add a node at the end you need to go till
	 *  the end of the array.*/
	public void addAtEnd(int data) {
		if (head == null) {
			addAtBegin(data);					//if head is empty - addAtBegin()
		} else {
			SLNode n = new SLNode(data);			//curent node the takes value of head
			SLNode currNode = head;				//and iterate through list up to the last element
			while (currNode.next != null) {		//
				currNode = currNode.next;
			}
			currNode.next = n;					//add at end the end the newly made n Node
			size++;
		}

	}
	/**Get Ele­ment at  : Return the ele­ment from that element spe­cific index*/
	public int elementAt(int index) {
		
		if(index > size){						
			return -1;
		}
		SLNode n = head;
		while (index-1 !=0){					//go through 
			n = n.next;	
			index--;		
		}
		return n.data;
	}
	/**Get Size: returns the size of the linked list.*/
	public int getSize() {
		return size;
	}
	/**Get Ele­ment at Index : Return the ele­ment at spe­cific index, if index is greater than the size then return –1. its O(n) in worst case.*/
	public int search(int data) {
		SLNode  n = head;
		int count = 1;
		while(n!=null){
			if(n.data == data){
				return count;				// for nth-data return counted value
			} else {
				n = n.next;
				count++;
			}
		}
		return -1;							//if no such thing exists just return -1
	}
	/**Add Ele­ment at Spe­cific Index : Add ele­ment at spe­cific index. If index is greater than size then print “INVALID POSITION”. Worst case its O(n)*/
	public void addAtIndex(int data, int position) {
		if(position ==1){
			addAtBegin(data);
		}
		int len = size;
		if(position > len + 1 || position < 1){
			System.out.println("This position diesn\'t exists in the list");
		}
		if(position <= len &&  position > 1){	// for legitimate position
			SLNode n = new SLNode(data);
			SLNode currNode = head;			// copy head value to current node
			while ((position - 2) > 0){			// iterate through, up to second-to-last from position
				System.out.println(currNode.data);
				currNode=currNode.next;	
				position--;
			}
			n.next = currNode.next;	//the next of new Node n = head.next
			currNode.next = n;		//current node next = new node
			size++;					//incr size
		}
	}
	/**Dis­play(): Prints the entire linked list. O(n).*/
	public void display() {
		System.out.print(" ");
		SLNode currNode = head;
		while (currNode != null){
			System.out.print("->" + currNode.data);
			currNode = currNode.next;
		}
	}
	public static void main(String[] args) throws java.lang.Exception {
		SingleLinkedList a = new SingleLinkedList();
		a.addAtBegin(5);
		a.addAtBegin(15);
		a.addAtEnd(20);
		a.addAtEnd(21);
		a.deleteAtBegin();
		a.deleteAtEnd();
		a.addAtIndex(10, 2);
		a.addAtEnd(15);
		a.display();
		System.out.println("\n Size of the list is: " + a.size);
		System.out.println(" Element at 2nd position: " + a.elementAt(2));
		System.out.println(" Searching element 20, location: " + a.search(15));
	}
}

class SLNode {
	public int data;
	public SLNode next;

	public SLNode(int data) {
		this.data = data;
		this.next = null;
	}
}

