package cats;

public class Sequence {

	// static field
	private static int currentValue = -1;

	// Intentionally deny instantiation of a class
	/*A class that has only private constructors can not be instantiated. 
	 Such a class usually has only static members and is called utility class.*/
	private Sequence() {
	}

	// static method
	public static int nextValue() {
		currentValue++;
		return currentValue;
	}
}
