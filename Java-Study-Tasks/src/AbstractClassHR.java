import java.util.*;
//example of use of abstract class in java
abstract class Book {
	String title;						//empty field
	abstract void setTitle(String s);	//missing body for setter
	String getTitle() {				//getter
		return title;
	}
}
class MyBook extends Book {

	void setTitle(String s) {			//adding setter in the subclass
		title = s;
	}
}
public class AbstractClassHR {

	public static void main(String[] args) {
		// Book new_novel=new Book(); This line prHMain.java:25:
		// error: Book is abstract; cannot be instantiated
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the name of the book you have?");
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();
	}
}
