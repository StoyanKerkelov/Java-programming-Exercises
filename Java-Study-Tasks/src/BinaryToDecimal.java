import java.util.Scanner;

public class BinaryToDecimal {

	/*Write a program that converts a given number from binary to Decimal.
	 */
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int bin = reader.nextInt();
		int addon,bit, rest;
		int power = 0;
		int decimal=0;

			while (bin > 0) {
			rest = bin % 10;
			addon = (int) Math.pow(2, power);
			bit = rest*addon;
			decimal += bit;
			bin/=10;
			power++;
			//for debbuging:
			//System.out.println(rest);
			//System.out.println(addon);
			//System.out.println(bit);
			//System.out.println(decimal);
			//System.out.println(bin);
		}
		System.out.println(decimal);
	}
}
