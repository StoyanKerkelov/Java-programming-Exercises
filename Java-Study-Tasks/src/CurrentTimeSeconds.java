
public class CurrentTimeSeconds {

	/*Write a program that returns the number of days,hours and minutes
	which have expired since 1 January 1970 to when the program is implemented. 
	For conversion, use System class.
	 */
	public static void main(String[] args) {

		long startTime = (System.currentTimeMillis())/1000;	//convert into seconds:
		long days = 0;
		int hours = 0;
		int minutes = 0;	
		
		// days
		while (startTime >24*60*60){
			startTime -= 24*60*60;
			days++;
		}
		
		//hours
		while (startTime >60*60){
			startTime -= 60*60;
			hours++;
		}
		
		//minutes
		while (startTime >60){
			startTime -= 60;
			minutes++;
		}
		System.out.println("From the 1st of january 1970 there have been passed:");
		System.out.print(days +" days, " );
		System.out.print(hours +" hours, " );
		System.out.print("and " + minutes +" minutes" );
	
	}
}
