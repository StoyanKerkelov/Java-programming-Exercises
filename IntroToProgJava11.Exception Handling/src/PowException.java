import java.util.*;
import java.util.Scanner;

	/**create an algorithm thats calculate a power of nuber,
	but throws exception if there is a incorrect input.*/

class MyCalculator {
	long power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be always positive!");
		} else {
			return (long) Math.pow(n, p);
		}
	}
}

public class PowException {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
