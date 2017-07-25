import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;
//Calculate the volume of cube; cuboid;  hemisphere; and cylinder. Use methods that overload each other
class Shape {
	public int get_volume(int a) {
		checkAllPositive(a);
		return a * a * a;
	}

	public int get_volume(int l, int b, int h) {
		checkAllPositive(l, b, h);
		return l * b * h;
	}

	public double get_volume(double r) {
		checkAllPositive(r);
		return 3.14159265 * (2.0 / 3.0) * r * r * r;
	}

	public double get_volume(double r, double h) {
		checkAllPositive(r, h);
		return 3.14159265 * r * r * h;
	}

	private void checkAllPositive(int... dA) {
		for (double d : dA) {
			if (d <= 0) {
				throw new NumberFormatException(
						"All the values must be positive");
			}
		}
	}

	private void checkAllPositive(double... dA) {
		for (double d : dA) {
			if (d <= 0.0) {
				throw new NumberFormatException(
						"All the values must be positive");
			}
		}
	}
}

class Output {
	public void display(double d) {
		System.out.println(String.format("%.3f", d));
	}
}

class Calculate {
	private Scanner sc;
	public Output output = new Output();

	public Calculate() {
		sc = new Scanner(System.in);
	}

	public int get_int_val() throws IOException {
		return sc.nextInt();
	}

	public double get_double_val() throws IOException {
		return sc.nextDouble();
	}

	public static Shape do_calc() {
		return new Shape();
	}
}

public class CalculateVolumeHR {

	public static void main(String[] args) {
		try {
			System.out.println("First type the number of test cases");
			Calculate cal = new Calculate();
			int T = cal.get_int_val();
			while (T-- > 0) {
				double volume = 0.0;
				System.out.println("Calculate volume, type 1 for cube; 2 for cuboid; 3 for hemisphere; 4 for cylinder");
				int ch = cal.get_int_val();
				if (ch == 1) {
					System.out.println("Input side a:");
					int a = cal.get_int_val();
					volume = Calculate.do_calc()
							.get_volume(a);
				} else if (ch == 2) {
					System.out.println("Input sides l , b and h");
					int l = cal.get_int_val();
					int b = cal.get_int_val();
					int h = cal.get_int_val();
					volume = Calculate.do_calc()
							.get_volume(l, b, h);

				} else if (ch == 3) {
					System.out.println("Input radius r");
					double r = cal.get_double_val();
					volume = Calculate.do_calc()
							.get_volume(r);

				} else if (ch == 4) {
					System.out.println("Input radius r and height h");
					double r = cal.get_double_val();
					double h = cal.get_double_val();
					volume = Calculate.do_calc()
							.get_volume(r, h);
				}
				cal.output.display(volume);
			}
		} catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of main
} // end of Solution

/*
 * This class prevents the user form using System.exit(0) from terminating the
 * program abnormally.
 */

