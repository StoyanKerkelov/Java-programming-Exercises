import java.util.InputMismatchException;
import java.util.Scanner;

/** write a programm that reads integer from the console 
and catches exception when, the input is irregular*/

public class TryCatchHackerRank {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		try {
			int result = reader.nextInt() / reader.nextInt();
			System.out.println(result);
		} catch (InputMismatchException inpmism) {
			System.out.println(inpmism.getClass().getName());	//type mismatch
		} catch (ArithmeticException arithme) {				//devision by 0
			System.out.println(arithme.toString());
		} catch (Exception e) {								//other exception
			System.out.println(e.toString());
		}
	}
}
