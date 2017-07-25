import java.util.Scanner;

public class LCM {
	//calculate Least common multiple
	/*
	We will mark the Least common multiple of a and b with (a, b) or just [a, b].
	Examples: [6, 15] = [15, 6] = 30, [1, 10] = 10, [5,10] = 10, [5, 12] = 60.
	When looking for LCM of more than two numbers there is a similar relation, as in GCD
	(Greatest Common Divisor)
		LCM(a 1 , a 2 , ..., a n ) = LCM(LCM(a 1 , a 2 , ..., a n–1 ), a n )
		
	The least common multiple can be found using an existing dependency
	Between him and the GCD, namely:
		LCM = ( a , b ) / GCD ( a , b )
	*/

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		System.out.println("How much are the integers of witch, we will calcucalte LCM?");
		///////intput////////
		int n = reader.nextInt();
		System.out.println("please type them out:");
		 int array[] = new int[n];
		 for(int i = 0; i < n; i++){
			 array[i] = reader.nextInt();
		 }
		 ///////intput////////
		System.out.printf("%S\n", lcm(array, n) );	
	}
		
	public static int gcd (int a, int b){//GCD
		return (0 == b) ? a : gcd(b, a % b);	//GCD: GCD(a, b) = GCD (b, a % b)
	}
	
	 public static int lcm(int array[], int n) {//LCM
		int b;
		if (2 == n){//LCM of two numbers
		return(array[0] * array[1]) / (gcd(array[0], array[1]));
		} else {
		b = lcm(array, n - 1);
		return(array[n - 1] * b) / (gcd(array[n - 1], b));
		}
	}
}
