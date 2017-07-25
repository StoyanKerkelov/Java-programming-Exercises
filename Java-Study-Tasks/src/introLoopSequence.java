import java.util.*;
import java.lang.Math;
import java.io.*;
/*	Calculate the Sequence (by given members) using the formula:
	a = 0, b = 2, n = 10:
	sn = a+b*2^0+b*2^1+.... +b*2^n
	s0 = 0 + 1*2 = 2;
	s1 = 0 + 1*2 +2*2 =6;
	s2 = 0 + 1*2 +2*2 +4*2=14;
	s3...
	
	Sample Input
	2
	0 2 10
	5 3 5
	
	Sample Output
	2 6 14 30 62 126 254 510 1022 2046
	8 14 26 50 98*/
class introLoopSequence {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();// number of queries
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();// s

			int j = 0;
			int power = 0;
			int num = a;
			int newNum;
			while (j < n) {
				newNum = (int) (num + (Math.pow(2,power) * b ));
				if(j==n-1){
					System.out.print(newNum);
				} else {
					System.out.print(newNum + " ");
				}
				num = newNum;
				power++;
				j++;
				
			}
			//System.out.println();
			//in.nextLine();
		}
		in.close();
	}
}
