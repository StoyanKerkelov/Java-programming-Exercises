import java.util.ArrayList;
import java.util.Date;

public class Call {
	/*
	Create a "Call" class that contains call information, from mobile phone 
	conversations. It should contain information about Date, start time, and
	duration of the call.
	  
	2. Add a call archive property - callHistory to keep it a list of conversations.	
	
	3.In the GSM class add methods to add and delete calls
	(Call) in the call records of the mobile phone. Add a method,
	Which deletes all the calls from the archive.
	
	
	 */
	
	final static ArrayList<Call> callsHistory = new ArrayList<Call>();	 //calls history
	
	 //Date callDate;			//date format date&time
	 //int callDuration;		//duration in seconds
	 private Date callDate = new Date();
	 private final double callDuration;
	 
	//full variable constructor
	public Call(Date callDate, int callDuration) {
		this.callDate = callDate;
		this.callDuration = callDuration;
		makeCall(this);
	}
	
	public Date getCallDate(){			//getter
		return callDate;
	}
	public double getCallDuration(){	//getter
		return callDuration;
	}
	@Override
	public String toString()
	{
		return "The call was made at: " + callDate + "\nThe duration was: "
				+ callDuration + " seconds";
	}
	
	//MAKE CALL
		public static void makeCall(Call call) {
			callsHistory.add(call);
	}
	
	//DELETE CALL
	public static void deleteCall(int callNumber)
	{
		callsHistory.remove(callNumber);
	}
	//PRINT CALL HISTRORY
	public static void callHistory() {
		if (callsHistory.isEmpty() ) {
			System.out.println("There is no calls in history!");
		} else {
			for (Call call : callsHistory) {
				System.out.println(call);
			}
		}
	}
		
	//CLEAR CALL HISTRORY
	public static void clearHistory()
	{
		callsHistory.clear();
	}
	
	public static void main(String[] args) {
		
		Call test = new Call(new Date(), 413);
		Call test2 = new Call(new Date(), 280);
		Call test3 = new Call(new Date(), 900);
		callHistory();
		
		deleteCall(2);
		System.out.println("After deleteing the second calling: \n");
		callHistory();
		
		clearHistory();
		System.out.println("After after cleaning all history: \n");
		callHistory();
	}
}
