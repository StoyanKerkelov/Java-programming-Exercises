import java.util.Scanner;

public class HexadecimalToDecimal {

	/*Write a program that converts a given number from hexadecimal to
	decimal.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		String digits = "0123456789ABCDEF";
		String hex = (reader.nextLine()).toUpperCase();
		
		int result=0;
		for (int i = 0; i < hex.length(); i++) {
			char hexDigit = hex.charAt(i);
	                int decimal = digits.indexOf(hexDigit);
	                result = 16*result + decimal;
		}
		System.out.println(result);
	}
}
