import java.util.*;

public class TableOfMultiplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int power = 1;
		while (power <= 10) {
			int num = power * N;
			System.out.printf("%d x %d = %d\n", N, power, num);
			power++;
		}
	}
}
