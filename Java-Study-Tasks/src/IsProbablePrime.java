import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsProbablePrime {
	//IsProbablePrime example n contains at most 100 digits.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		java.math.BigInteger n = in.nextBigInteger();
		in.close();
		System.out.println(n.isProbablePrime(3223) ? "prime" : "not prime");
	}
	
	/*public boolean isProbablePrime(int certainty)
	Returns true if this BigInteger is probably prime, false if it's definitely composite. If certainty is ≤ 0, true is returned.
	Parameters: certainty - a measure of the uncertainty that the caller is willing to tolerate: if the call returns true the
	 probability that this BigInteger is prime exceeds (1 - 1/2certainty). The execution time of this method is proportional
	  to the value of this parameter.
	 * 
	 * perfect value for certainty - The input may contain up to 1000 digits, which is about 2^3323. Therefore, is 3323 the "perfect" value ?*/
}
