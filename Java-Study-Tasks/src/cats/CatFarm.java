package cats;

public class CatFarm {

	/*Write a program that creates 10 Cat objects, giving them names
	Of the Cat type N, where N is the unique sequence number of the object, and finally
	invoke the sayMiau () method of each of them. For conversion, use
	Already defined package chapter10.
	 */
	public static void main(String[] args) {

		Cat  Cat1= new Cat("Sara", "gray");
		//Cat1.name = "Sara";
		System.out.printf("The name of my cat is %s.%n",Cat1.name);
		System.out.printf("The color of cat %s is %s.%n",
				Cat1.name, Cat1.color);
		Cat1.sayMiau();
		System.out.println();
		
		Cat  Cat2= new Cat();
		Cat2.name = "Zlatka";
		System.out.printf("The name of my cat is %s.%n",Cat2.name);
		Cat2.sayMiau();
		
		Cat  Cat3= new Cat();
		Cat3.name = "Chernata Zlatka";
		System.out.printf("The name of my cat is %s.%n",Cat3.name);
		Cat3.sayMiau();
		
		Cat  Cat4= new Cat();
		Cat4.name = "Mima";
		System.out.printf("The name of my cat is %s.%n",Cat4.name);
		Cat4.sayMiau();
		
		Cat  Cat5= new Cat();
		Cat5.name = "Sharka";
		System.out.printf("The name of my cat is %s.%n",Cat5.name);
		Cat5.sayMiau();
		
		Cat  Cat6= new Cat();
		Cat6.name = "Roshko";
		System.out.printf("The name of my cat is %s.%n",Cat6.name);
		Cat6.sayMiau();
		
		Cat  Cat7= new Cat();
		Cat7.name = "Razbojnika";
		System.out.printf("The name of my cat is %s.%n",Cat7.name);
		Cat7.sayMiau();
		
		Cat  Cat8= new Cat();
		Cat8.name = "Bella";
		System.out.printf("The name of my cat is %s.%n",Cat8.name);
		Cat8.sayMiau();
		
		Cat  Cat9= new Cat();
		Cat9.name = "Miro";
		System.out.printf("The name of my cat is %s.%n",Cat9.name);
		Cat9.sayMiau();
		
		Cat  Cat10= new Cat();
		Cat10.name = "Obama";
		System.out.printf("The name of my cat is %s.%n",Cat10.name);
		Cat10.sayMiau();
	}
}
