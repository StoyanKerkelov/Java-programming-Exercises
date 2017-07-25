import java.util.*;
import java.io.*;

class IntroDataTypes {
	public static void main(String[] argh) {
		
		/*Write a code that prints all the possible data types that can carry a given integer.
		A byte is an 8-bit signed integer.
		A short is a 16-bit signed integer. 
		An int is a 32-bit signed integer. 
		A long is a 64-bit signed integer.
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				//byte
				if (x >= -128 && x <= 127) {
					System.out.println("* byte");
				}
				//short
				if (x >= -32768 && x <= 32767) {
					System.out.println("* short");// -32,768
									// ..
									// 32,767
				}
				//int
				if (x >= -2147483648 && x <= 2147483647) {
					System.out.println("* int");// -2,147,483,648
									// ..
									// 2,147,483,647
				//long
				}
				if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE);{
					System.out.println("* long");// -9,223,372,036,854,775,808
									// ..
									// //9,223,372,036,854,775,807
				}
			} catch (Exception e) {
				System.out.println(sc.next()
						+ "\n*can't be fitted anywhere.");
			}
		}
	}
}
