import java.lang.reflect.Method;

public class Generics {
	/*Write a single method printArray that can print all the elements of 
	 integer array and a string array. The method should be able to accept both (integer with  arrays) 
	  or (string with arrays).*/
	public static void main(String args[]) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 }; 
		String[] stringArray = { "Hello", "World" };
		myPrinter.printArray(intArray);
		System.out.println();
		myPrinter.printArray(stringArray);
		int count = 0;

		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();

			if (name.equals("printArray"))
				count++;
		}

		if (count > 1)
			System.out.println("Method overloading is not allowed!");
	}
}

class Printer {

	public void printArray(Object o[]) {
		for (Object t : o) {
			System.out.print(t + " ");
		}
	}
}
