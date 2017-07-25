import java.util.Arrays;

public class Polynomial {
	/*Write a method that multiplies two multiples.*/
	
	//   http://stackoverflow.com/questions/12731595/is-there-a-more-efficient-way-of-multiplying-polynomials
		private final double[] coeff;

	public Polynomial(double... coeff) {
		this.coeff = coeff;
	}

	@Override
	public String toString() {
		return Arrays.toString(coeff);
	}

	public Polynomial multiply(Polynomial polynomial) {
		int totalLength = coeff.length + polynomial.coeff.length - 1;
		double[] result = new double[totalLength];
		for (int i = 0; i < coeff.length; i++)
			for (int j = 0; j < polynomial.coeff.length; j++) {
				result[i + j] += coeff[i] * polynomial.coeff[j];
			}
		return new Polynomial(result);
	}

	public static void main(String... args) {
		Polynomial p1 = new Polynomial(1, 2, 3);
		System.out.println(p1 + "^2 =" + p1.multiply(p1));//polinomial1^2
		Polynomial p2 = new Polynomial(3, -1, -1);
		System.out.println(p1 + "*" + p2 + "=" + p1.multiply(p2));//polinomial1*polinomial2
	}
}
