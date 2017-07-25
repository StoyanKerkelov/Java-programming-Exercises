import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/* from a double value return the currency of US, India, China, France and Bulgaria.
On the first line, print US: u where  is  formatted for US currency. 
On the second line, print India: i where  is  formatted for Indian currency. 
On the third line, print China: c where  is  formatted for Chinese currency. 
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
-------------------------------
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €*/
public class CurrencyFormatter {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		//get currency instance to convert  into native currency formats. 
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		//-----
		//Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en","IN"));//en - English IN	- India (Region code)
		//-----
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		NumberFormat bulgariaFormat = NumberFormat.getCurrencyInstance(new Locale("bg","BG"));//en - English IN	- India (Region code
		//result
		System.out.println("US: " + usFormat.format(payment));
		System.out.println("India: " + indiaFormat.format(payment));
		System.out.println("China: " + chinaFormat.format(payment));
		System.out.println("France: " + franceFormat.format(payment));
		System.out.println("Bulgaria: " + bulgariaFormat.format(payment));
	}

}
