import java.util.Scanner;

public class GreatestCommonDivisor {
	//find GCD
	
	/*We divide integer α to b, where we get private  q1 and rest r1.
	 * Next divide b on the rest, then divide r1 on the remainder r2, etc., 
	 * until the remainder becomes equal to 0
	 *
	 * a = q 1 .b + r 1 b = q 2 .r 1 + r 2 r 1 = q 3 .r 2 + r 3 ... r
	 * k–1 = q k+1 .r k + r k+1 , with r k + 1 = 0 The last non-zero residue
	 * R k will be the desired NOD. 
	 * 
	 *The algorithm also has a recursive
	 *version  based on the following property of NOD: NOD (a, b) = NOD
	 * (B, and% b)
	 * (10,5); (5,10); (15,25); (25,15); (7,8,9); (3,6,9); (158,128,256);(64,28,72,18). */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("a = ");
		int a = input.nextInt();
		System.out.print("b = "); 
		int b = input.nextInt();
		int swap;
		while(b>0){
			swap = b;
			b = a % b;
			a = swap;
		}
		System.out.println(a); //result
	}
}
