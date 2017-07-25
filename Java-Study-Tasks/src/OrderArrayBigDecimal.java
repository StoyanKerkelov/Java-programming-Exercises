
import java.math.BigDecimal;
import java.util.*;
	/*Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's 
	test your knowledge of them!
 * 
Given an array, , of  real number strings, sort them in descending order — but wait, there's more! Each number must 
be printed in the exact same format as it was read from stdin, meaning that ".1" is printed as ".1" , and "0.1"  is printed as "0.1". If two
 numbers represent numerically equivalent values (e.g., .1 ≡ 0.1), then they must be listed in the same order as they were 
 received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the
 instructions above.
						 Sample Input                       
						9                              Sample Output.                         
						-100              		90                             
						50                 		56.6                           
						0                		50                             
						56.6                  	02.34                          
						90                    	0.12                           
						0.12                  	.12                            
						.12                   	0                              
						02.34                 	000.000                        
						000.000              	 -100                           

*/


	/*						// Only with java 8
	Arrays.sort(s, 0, n, (a, b) -> new BigDecimal(b).compareTo(new BigDecimal(a)));
	
	/*In our case, we apply sorting not to the whole array but to elements in the range
	 from 0 to n, because last two elements of the array are nulls, and we do not care
	  about them (moreover, we do not want to bother with additional null-checks). 
	  The last one argument is 'comparator', and Java 8 allows us to use the lambda 
	  expression in this case (and it looks much more concise than anonymous class).
	*/

	/*The first line consists of a single integer,n , denoting the number of integer strings. 
	Each line i of n the  subsequent lines contains a real number denoting the value of Si .
	*/
public class OrderArrayBigDecimal {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		Arrays.sort(s, new Comparator<Object>() {
			@Override
			public int compare(Object a1, Object a2) {
				BigDecimal bigDec1 = new BigDecimal((String) a1);
				BigDecimal bigDec2 = new BigDecimal((String) a2);
				return bigDec2.compareTo(bigDec1);
			}
		});
		
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

}
