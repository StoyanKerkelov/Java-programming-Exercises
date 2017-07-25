import java.util.Scanner;


public class FindAllOddsInRange {

	/*Write a program that finds all prime numbers in the range [1 .. n].*/
	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		int upperBound = reader.nextInt();
		
		   boolean[] primes = new boolean[upperBound + 1];
		   
		   for (int i = 0; i < primes.length; i++) {  				//array primes fills with 'true' values
	                        primes[i] = true;	
	                }
		   
		   int toSqrt = (int) Math.floor(Math.sqrt(upperBound));// floor returns the largest int smaller then [arg]
		   
		   for (int i = 2; i <= toSqrt; i++) {						//for every i from 2 upto n //optimisation {	from 2 upto sqrt(n)  	}
	                        if (primes[i] == true) {						//for primes[i]  'true,	 and
	                                for (int j = i * i; j <= upperBound; j += i) {	//j = i+i;  //optimisation  { j = i*i; 	} while j <= num  do j = j + i
	                                        primes[j] = false;						//primes[j] = 'false'; //"scratch that"
	                                }
	                        }
	                } 	//Any number i for which primes [i] has a true value is simple.
		   			/////////print//////////
		   System.out.print(2);//smallest prime number
		   for (int k = 3; k < primes.length ; k++ ){
			   
			   if ( primes[k] == true){
				   System.out.print(", " + k);
			   }
		   }
	}
}
