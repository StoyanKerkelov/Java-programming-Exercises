import java.util.ArrayList;
import java.util.Scanner;

public class CustomListQueries {

	/*Given a list, L, of N  integers, perform  Q queries on the list. Once all queries are completed, print the
	 *  modified list as a single line of space-separated integers.	

		insert  at index :
		Insert
		x y
		
		Delete the element at index :
		Delete
		x*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		short N = in.nextShort();
		ArrayList<Integer> L = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			L.add(i, in.nextInt());
		}
		short Q = in.nextShort();
		for (int i = 0; i < Q; i++) {
			String operation = in.next("Insert|Delete");
			if (operation.equals("Insert")) {
				short index = in.nextShort();
				Integer item = in.nextInt();
				L.add(index, item);
			} else if (operation.equals("Delete")) {
				short index = in.nextShort();
				L.remove(index);
			}
		}
		for (int i : L) {
			System.out.print(i + " ");
		}
	}
}
