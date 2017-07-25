import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticVar {
	//calculate area of rectangle, throw exception if input is incorrect.
	// static variable initialization
	public static  int B;
	public static  int H;
	public static  boolean flag= true;

	// Static Initialization Block
	static {
		Scanner reader = new Scanner(System.in);
		B = reader.nextInt();
		H = reader.nextInt();
		reader.close();

		try {
			if (B < 0 || H < 0) {
				flag = false;
				throw (new Exception("java.lang.Exception: Breadth and height must be positive"));
			} 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main() {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}// end of main
}// end of class

