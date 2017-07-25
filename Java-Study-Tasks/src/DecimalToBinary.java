import java.util.Scanner;


public class DecimalToBinary {

	/*Write a program that converts a given number from a decimal
	binary.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		int dec = reader.nextInt();
		int rest;
		String binary="";
		
		while (dec > 0) {
			rest = dec%2;
			dec /=2;
			binary = Integer.toString(rest) + binary;
		}
		
		System.out.println(binary);
		
		
	}
}
