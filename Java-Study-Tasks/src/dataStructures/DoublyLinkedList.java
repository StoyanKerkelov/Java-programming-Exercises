package dataStructures;

class DNode {
	int data;
	DNode next;
	DNode previous;

	public DNode(int data) {
		this.data = data;
		next = null;
		previous = null;
	}
}

public class DoublyLinkedList {

	int size = 0;
	DNode head = null;
	DNode tail = null;
	
	/**Add at the Start : Add a node the begin­ning of the linked list. Its O(1). 
	 * If size is 0 then make the new node as head and tail else put the at the 
	 * start, change the head and do not change the tail.*/
	public DNode addAtStart(int data) {
		System.out.println("Adding Node " + data + " at the start");//accout for
		DNode n = new DNode(data);
		if (size == 0) {			//incase of new DoublyLinkedList
			head = n;			//head = new Node; tail = new Node
			tail = n;
		} else {
			n.next = head;		//changing the start new Node.next = head
			head.previous = n;	//head.previous  = new Node
			head = n;			//head = new Node (because is the first member)
		}
		size++;
		return n;
	}
	/**Add at the End : Add a node at the end of the linked list. its O(1) since we
	 *  have tail ref­er­ence. If size is 0 then make the new node as head and tail 
	 *  else put node at the end of the list using tail ref­er­ence and make the new
	 *   node as tail.*/
	public DNode addAtEnd(int data) {
		System.out.println("Adding Node " + data + " at the End");
		DNode n = new DNode(data);
		if (size == 0) {			//incase of new DoublyLinkedList
			head = n;			//head points new Node
			tail = n;				// tail points new node
		} else {
			tail.next = n;			//if continuing list tail.next = new Node
			n.previous = tail;		//new Node.previous = tail
			tail = n;				//tail = new Node just like tail.next = new Node
		}
		size++;
		return n;
	}

	public DNode addAfter(int data, DNode prevNode) {
		if (prevNode == null) {
			System.err.println("Node after which new node to be added cannot be null");
			return null;
		} else if (prevNode == tail) {// check if it a last node
			return addAtEnd(data);
		} else {
			System.out.println("Adding node after " + prevNode.data);
			// create a new node
			DNode n = new DNode(data);
			// store the next node of prevNode
			DNode nextNode = prevNode.next;
			// make new node next points to prevNode
			n.next = nextNode;
			// make prevNode next points to new Node
			prevNode.next = n;
			// make nextNode previous points to new node
			nextNode.previous = n;
			// make new Node previous points to prevNode
			n.previous = prevNode;
			size++;
			return n;
		}
	}
	/**Delete at the Start : Delete a node from begin­ning of the linked list and
	 *  make the head points to the 2nd node in the list. Its O(1).*/
	public void deleteFromStart() {
		if (size == 0) {
			System.out.println("\nList is Empty");
		} else {
			System.out.println("\ndeleting node " + head.data
					+ " from start");
			head = head.next;		//now head points to the second Node
			size--;
		}
	}

	public void deleteFromEnd() {
		if (size == 0) {
			System.out.println("\nList is Empty");
		} else if (size == 1) {
			deleteFromStart();
		} else {
			// store the 2nd last node
			int x = tail.data;
			DNode prevTail = tail.previous;

			// detach the last node
			tail = prevTail;
			tail.next = null;
			System.out.println("\ndeleting node " + x + " from end");
			size--;
		}
	}
	/**Get Ele­ment at Index : Return the ele­ment at spe­cific index, if index is 
	 * greater than the size then return –1. its O(n) in worst case.*/
	public int elementAt(int index) {
		if (index > size) {
			return -1;
		}
		DNode n = head;
		while (index - 1 != 0) {
			n = n.next;
			index--;
		}
		return n.data;
	}

	//Get Size: returns the size of the linked list.
	public int getSize() {
		return size;
	}
	/**Print: Prints the entire linked list. O(n).*/
	public void print() {
		DNode temp = head;
		System.out.print("Doubly Linked List: ");
		while (temp != null) {
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		DNode x = d.addAtStart(2);
		d.addAtStart(1);
		d.print();
		d.addAtEnd(3);
		d.print();
		d.addAfter(4, x);
		d.print();
		d.deleteFromStart();
		d.print();
		System.out.println("Element at index 2: " + d.elementAt(2));
		d.addAtStart(1);
		d.print();
		d.deleteFromEnd();
		d.print();
		System.out.println("Size of the Linked List: " + d.getSize());
	}
}

