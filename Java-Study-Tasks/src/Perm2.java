import java.util.Scanner;

public class Perm2 {

	/*Write a permutation  reculsive algorithm*/
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Permutation of an n-element set");
		String str = reader.nextLine();
		System.out.println();
		reader.close();
		
		permutation("", str);					//prefix starts from ""
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i) ,         str.substring(0, i) + str.substring(i + 1,n));
		}
	}
}
