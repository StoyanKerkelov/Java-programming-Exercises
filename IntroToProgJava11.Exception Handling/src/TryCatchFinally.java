public class TryCatchFinally {
		//write a try-catch-finally example
			/* try {
			   // Protected code
			}catch(ExceptionType1 e1) {
			   // Catch block
			}catch(ExceptionType2 e2) {
			   // Catch block
			}catch(ExceptionType3 e3) {
			   // Catch block
			}finally {
			   // The finally block always executes.
			}	*/
		
	public static void main(String args[]) {
		int a[] = new int[2];
		try {
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		} finally {
			a[0] = 6;
			System.out.println("First element value: " + a[0]);
			System.out.println("The finally statement is executed");
		}
	}
}
