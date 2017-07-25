import java.util.Scanner;

public class Task_factoriel {

	/*make factoriel calculator
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Type \"rec\" for calculation with reculsive method");
		System.out.println("or \"iter\" for calculation with iteration method");
		String choise = reader.nextLine().toLowerCase();
		System.out.println("Type integer for calculation of it's factoriel");
		int num = reader.nextInt();
		long factoriel = 1;
		
		if (choise.equals("rec")) {
			 factoriel = (Reculsive(num));
		}
		if (choise.equals("iter")) {
			factoriel = (Iterative(num));
		}
		
		System.out.printf("%d! = %d", num , factoriel);
	}
	
	public static long Reculsive(int num) {

		if (num == 0) {
			return 1;
		}
		// Recursive call: the method calls itself
		else {
			return num * Reculsive(num - 1);
		}
	}
	
	public static long Iterative(int num) {

		long result = 1;
		
		for(int i = 1 ; i <= num; i++ ){
			result *= i;
		}
		return result;
	}
}