
public class UserDefinedExceptions {

	  /*All User-defined exceptions:
	  =>  must be Throwable class subclasses
	  => For an "automatic" checked made-exceptions, they need to extend from the Exception class
	  => For unchecked made-exceptions, they need to extend from the RuntimeException class
	   */
	   
	   public class CheckingAccount {
	   private double balance;
	   private int number;
	   
	   public CheckingAccount(int number) {
	      this.number = number;
	   }
	   
	   public void deposit(double amount) {
	      balance += amount;
	   }
	   
	   public void withdraw(double amount) throws InsufficientFundsException {	//the programmer-made exception
	      if(amount <= balance) {
	         balance -= amount;
	      }else {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	   }
	   
	   public double getBalance() {
	      return balance;
	   }
	   
	   public int getNumber() {
	      return number;
	   }
	}
}