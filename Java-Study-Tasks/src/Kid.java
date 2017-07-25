
import java.util.Scanner;

import cats.Cat;



public class Kid {

	//using different classes in the same package
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write cat's name: ");
		String firstAnimalName = input.nextLine();
		System.out.print("Write cat's sound: ");
		String firstAnimalSound = input.nextLine();
		Cat firstAnimal = new Cat(firstAnimalName, firstAnimalSound);
		callTheAnimal (firstAnimal);
		animalSound(firstAnimalSound);
	}
	public static void callTheAnimal (Cat cat) {
		System.out.println("Come, " + cat.getName());
	}
	public static void animalSound(String  sound) {
		System.out.println(sound);
	}
}
