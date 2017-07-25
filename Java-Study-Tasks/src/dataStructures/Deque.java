package dataStructures;
import java.util.Scanner;
import java.util.Stack;

public class Deque {

	/**Create Deque (deck structure). This is a specific structure, that
	 * allows its elements to be added and removed from both ends. In
	 * addition, an element placed on one side can be removed only from the
	 * same side. Perform removal operations adding clearing a deck. In case
	 * of an invalid operation, submit appropriate exception.
	 */
	/**Hint:
	Use two stacks . Thus, if we add
	Elements on the left of the deck, they  will enter the left stack, and then will be 
	removed from the same left stack from there again.
	*/
	
	private Stack<Long> left = new Stack <Long>();
	private Stack<Long> right = new Stack <Long>();
	
	private boolean isEmpty() {
		if(this.left.empty() && this.right.empty()){
			return true;
		}
		return false;
	}
	
	private void printDeque(){
		//print backwards left
		if(left.size() == 0){		//	or this.rigth.size()
			System.out.print("Empty left side");
		} else{
			for(int i =  this.left.size() - 1; i >= 0; i--) {
				System.out.print(left.get(i) + " ");
			}
		}
		System.out.print("|<left right>|");//separator
		if(right.size() == 0){		//	or this.rigth.size()
			System.out.print("Empty right side");
		} else{
			//print right straightforward
			for(Long i : right) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	private void clearDeque(){
		if (this.isEmpty()){
			throw new RuntimeException("It is empty");
		}else {
			left.clear();
			right.clear();
		}
	}
	
	private void insertLeft(long leftNum) {
		left.push(leftNum);
	}
	
	private void removeLeft() {
		if(left.empty()) throw new RuntimeException("Leftside is empty");
		left.pop();
	}
	
	private void insertRight(long rightNum) {
		right.push(rightNum);
	}
	
	private void removeRight() {
		if(right.empty()) throw new RuntimeException("Rightside is empty");
		right.pop();
	}
	
	
	public static void main(String[] args) {
		try(	Scanner reader = new Scanner(System.in);){
			System.out.println("This is a custom made deque structure.");
			Deque example = new Deque();
			example.printDeque();
			System.out.println("Add two integer numbers to add to the right side of deque:");
			example.insertRight(reader.nextInt() );example.insertRight(reader.nextInt() );
			System.out.println("Our deque looks like this:");
			example.printDeque();
			System.out.println("Add four integer numbers to add to the left side of deque:");
			example.insertLeft(reader.nextInt() );example.insertLeft(reader.nextInt() );
			example.insertLeft(reader.nextInt() );example.insertLeft(reader.nextInt() );
			System.out.println("Now our deque looks like this:");	example.printDeque();
			System.out.println("Lets remove the last member form the right side and the last two from the left side.");
			example.removeRight();example.removeLeft();example.removeLeft();	example.printDeque();
			System.out.println("Lets remove the last one from the right side and one last from the left side");
			example.removeRight();example.removeLeft();		example.printDeque();
			System.out.println("Now lets clear the whole deck:");
			example.clearDeque();example.printDeque();
		}
	}
}
