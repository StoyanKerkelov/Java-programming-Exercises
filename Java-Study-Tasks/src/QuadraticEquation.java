import java.util.Scanner;


public class QuadraticEquation {

	/*Write a program that, when entering the members (a, b and c)
	Of a square equation: a * x ^ 2 + b * x + c, calculates and prints its
 	roots.
	 */
	public static void main(String[] args) {
		
						//a*x^2 +b*x + c
		
		Scanner reader = new Scanner(System.in);
		//BigDecimal a = reader.nextBigDecimal();
		//BigDecimal  D =  new BigDecimal( (b*b) - ( 4*a*c) );
		
		float a = reader.nextFloat();
		float b = reader.nextFloat();
		float c = reader.nextFloat();
		
		float D, x1, x2;
		
		D = ( (b*b) - (4*a*c ) );
		
		if (D <  0) {
			System.out.println("The equation has no solution");
			
		} else if (D ==0){
			x1 = x2 = (-b) / (2*a);
			System.out.print("The equation has a single solution: ");
			System.out.println(x1);
			
		} else {
		
		x1 = (float) (( -b + Math.sqrt(D) ) / (2*a));
		x2 = (float) (( -b - Math.sqrt(D) ) / (2*a));
		System.err.println("The equation two  solutions:  " + x1+ " and "+ x2);
		}
	}
}
