package cats;

public class CatCreator {

	/*Define your own chapter10 package and place  into it both
	The Cat and Sequence classes we used in the examples of the current topic.
	Make another package named chapter10.examples. In it
	Make a class that invokes the Cat and Sequence classes.
	 */
	public static void main(String[] args) {
		
		System.out.println("/////////////////CAT//////////////////");
		Cat  myCat = new Cat();
		myCat.name = "Asparuh";
		
		System.out.printf("The name of my cat is %s.%n",myCat.name);
		myCat.sayMiau();
		
		Cat myBrownCat = new Cat("Krum", "brown");
		
		myBrownCat.sayMiau();
		System.out.printf("The color of cat %s is %s.%n",
				myBrownCat.name, myBrownCat.color);
		
		System.out.println();
		System.out.println("/////////////SEQUENCE//////////////");
		System.out.printf("Sequence[1..3]: %d, %d, %d%n",
		Sequence.nextValue(), Sequence.nextValue(),Sequence.nextValue());
		
	}
}
