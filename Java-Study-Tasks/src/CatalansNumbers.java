import java.util.Scanner;


public class CatalansNumbers {

	/*Catalan's numbers are calculated according to the following formula:
	
	C = (1 / n+1) * (2n/n)! = ((2n)!) / (n+1)! * n!			за n ≥ 0.
											
	Write a program that calculates the N-number of Catalan for a given N.
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("for Catalan’s numbers C = (1 / n+1) * (2*n/n)! = ((2*n)!) / (n+1)! * n!,  submit single number");
		int num = reader.nextInt();
		int a=1;
		int b = 1;
		int c = 1;
		//C =  (2*n)! / (n+1)! * n!,
			for (int i = 1; i <= 2 * num; i++)		//(2*n)!
	                {
	                    a *= i;
	                }
	                for (int j = 1; j <= num + 1; j++)		//(n+1)!
	                {
	                    b *= j;
	                }
	                for (int k = 1; k <= num; k++)		//n!
	                {
	                    c *= k;
	                }
	                
                System.out.printf("%d" , a / (b * c));
	}
}
