import java.util.Scanner;

public class RomanToArabicConverter {

	/*Write a program that converts Roman numbers into Arabic.
	  	MDCLXVI = 1666;
	  	MCMLXXXIV = 1984;
		MCMXC = 1990;
		MMVIII = 2008;
	 */
	
	public static Integer Decode (char letter) {
		
		switch (letter) {
		case 'I': 		return 1;	
		case 'V': 	return 5;	
		case 'X':		return 10;	
		case 'L': 		return 50;	
		case 'C': 	return 100;	
		case 'D': 	return 500;	
		case 'M':	return 1000;
		default: 	return 0;
	}
	}
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String roman = reader.nextLine().toUpperCase();
		int addonFirst = 0;
		int addonSecond = 0;
		int arabic = 0;							//result
		
		for (int i = 0; i < roman.length() - 1; i++){	//loop over all but the last character
			addonFirst = Decode(roman.charAt(i));
			addonSecond = Decode(roman.charAt(i+1));
		
			if (addonSecond > addonFirst){
				arabic -= addonFirst;
			} else {
				arabic += addonFirst;
			}
		}
		arabic += Decode(roman.charAt(roman.length() - 1) );	//add the last converted character
		System.out.println(arabic);
	}
}
