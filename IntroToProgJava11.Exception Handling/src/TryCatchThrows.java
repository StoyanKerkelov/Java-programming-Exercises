import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

	/* Explain what are exceptions , when  are they used and how
	Are they catched */

public class TryCatchThrows {
	/* Exceptions occur for the following reasons:
	  
	- the user has entered invalid data --- unchecked
	- file can not be opened or found --- checked
	- network problem --- checked

	=> Checked - those appear during compilation, they can't be ignored
	because they prevent the compilation of the program
	 
	=> Unchecked - these appear during the start of an already compiled program,
	  
	=> Error - an abnormal state caused by serious failures and mistakes that are not
	Defined by the java program.
	  
		  try {
		   // Protected code
		}catch(ExceptionName e1) {
		   // Catch block
		}catch(ExceptionName e2) {
		   // Catch block
	  */
	
   public static void main(String args[]) {
	      try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      }catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
	   }

	   public void deposit(double amount) throws RemoteException {
	      // Method implementation
	      throw new RemoteException();
	   }
	   // Remainder of class definition
      }
