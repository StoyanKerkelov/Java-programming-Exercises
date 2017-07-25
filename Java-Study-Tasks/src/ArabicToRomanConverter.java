import java.util.Scanner;

public class ArabicToRomanConverter {
	/*Write a program that converts Arabic numbers into Roman.*/
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int arabic = reader.nextInt();
		
		String[] Alphabetic = { "M",  "CM", "D", "C",  "XC", "L",  "X", "IX", "V", "I" };
		int[] Numeric = {  1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
		String roman = "";
		for (int i = 0; i < Numeric.length; i++) {
			int numberInPlace = arabic / Numeric[i];
		        if (numberInPlace == 0) continue;	//next number to convert
		        roman += numberInPlace == 4 && i > 0 ? Alphabetic[i] + Alphabetic[i - 1]:
		            new String(new char[numberInPlace]).replace("\0",Alphabetic[i]);
		        arabic = arabic % Numeric[i];
		    }
		System.out.println(roman);
	}
}
