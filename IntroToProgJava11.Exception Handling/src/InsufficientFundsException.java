
public class InsufficientFundsException extends Exception {
	private double amount;
	//see UserDefinedException
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}