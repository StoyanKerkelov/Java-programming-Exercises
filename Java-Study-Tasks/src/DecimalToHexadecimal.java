import java.util.Scanner;

public class DecimalToHexadecimal {

	/*Write a program that converts a given number from a decimal hexadecimal.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int decimal = reader.nextInt();
		int rest;
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8','9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String hexresult="";

		while (decimal > 0) {
			rest = decimal % 16;
			hexresult = hex[rest] + hexresult;
			decimal /= 16;
		}
		System.out.println(hexresult);
	}
}
