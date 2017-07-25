public class Percentage {
	/* Make a program that calculates % and also throws exceptions, when  the input
	 * is incorrect. A percentage value must be between 0 and 100 inclusive.
	 */
	public static void main(String[] args) {
		Percentage pr = new Percentage(9);
		System.out.println(pr.getValue());
	}
	
	private final int value;
	public Percentage(int value) {
		if (value < 0 || value > 100) {
			throw new IllegalArgumentException(
					Integer.toString(value));
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
//Throw IllegalArgumentException if your method or constructor doesn't accept a null value.