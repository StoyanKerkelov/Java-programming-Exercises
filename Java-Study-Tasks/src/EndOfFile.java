import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		/*Enter your code here. Read input from . Print output to STDOUT.
		Sample Input

		Hello world
		I am a file
		Read me until end-of-file.
		--------------------------------------------------
		Sample Output

		1 Hello world
		2 I am a file
		3 Read me until end-of-file.
		*/
		
		Scanner scan = new Scanner(System.in);
		String line = null;
		int i = 1;
		while (scan.hasNextLine()) {
			//list.add(line);
			line = scan.nextLine();
			System.out.println((i++) + " " +line);//otuputs the same with counting
		}
	}
}
