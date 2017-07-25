package dataStructures;

public class LinkedList {

	public class Node{
		
		Node next;
		int data;
		public Node (int data){
			this.data = data;
			//by default next = null
		}
	}
	
	Node head;
	
	LinkedList(int data){
		this.head = new Node(data);
	}
	
	public void append(int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		Node current  = head;
		while (current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data){
		if(head == null){ 
			return;
		}
		if(head.data == data){
			head = head.next;//if we delete head, just cut it out of the list
			return;
		}
		Node current = head;
		while(current.next != null){
			if(current.next.data == data){
				current.next = current.next.next;	//walk around the Node in process of deleting
				//return;
			}
			current = current.next;
		}
	}
	
	public void printLinkedList(){
		System.out.print("Head->  " + this.head.data);
		Node current = head.next;
		while(current.next != null){
			System.out.print(", " + current.data);
			current = current.next;
		}
		System.out.println();
	}
	//driver main
	public static void main(String[] args) {
		LinkedList LL = new LinkedList(13);//this is the head of the linkedlist
		//LL.printLinkedList();
		LL.append(12);LL.append(11);LL.append(10);LL.append(9);LL.append(8);LL.append(7);
		LL.append(8);LL.append(9);LL.append(10);LL.append(11);LL.append(12);LL.append(13);
		LL.printLinkedList();
		LL.prepend(0);
		LL.printLinkedList();
		LL.deleteWithValue(10);
		LL.printLinkedList();
	}
}
