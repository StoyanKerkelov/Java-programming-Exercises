package cats;

public class CatManipulating {
	public static void main(String[] args) {
		Cat  myCat = new Cat();
		myCat.name = "Asparuh";	//using fileds
		myCat.setName("Koko");		//using setters
		System.out.printf("The name of my cat is %s.%n",myCat.name);
		myCat.sayMiau();
		
		Cat myBrownCat = new Cat("Krum", "brown");
		
		myBrownCat.sayMiau();
		System.out.printf("The color of cat %s is %s.%n",
				myBrownCat.name, myBrownCat.color);
	}
}
