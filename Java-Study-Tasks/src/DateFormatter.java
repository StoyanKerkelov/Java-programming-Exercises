import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

//example of date formatter operations
public class DateFormatter {

	public static void main(String[] args) {
		
		String text = "21.08.1794";
		String[] dateElements = text.split("[.]");
		
		String dayString = dateElements[0];			
		int day = Integer.parseInt(dayString);
		String monthString = dateElements[1];		
		int month = Integer.parseInt(monthString);
		String yearString = dateElements[2];			
		int year = Integer.parseInt(yearString);
		
		GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
		Date date = cal.getTime();	//Thu Aug 21 00:00:00 EEST 2008
		System.out.println(date);
		
		/*
		   Symbol    Description

	        	G 		Era                              
			Y              Year                             
			M            Month                            
			D             Day of the month                 
			H             Time (1-12, morning / afternoon) 
			H             Time (0-23)                      
			K              Hour (1-24)                      
			K              Hour (0-11, morning / afternoon) 
			M             Minutes                          
			S               Seconds                          
			S               Milesseconds (0-999)             
			E               Day of the week                  
			D              Day of the year (1-365)          
			F )             Day of the week of the month (1-5
			W             Week of the year (1-53)          
			W             Week in month (1-5)              
			A              Am / Pm - Morning / Afternoon    
			Z              Time Zone                        
	        	
	        	*
	        	*System.out.println(<myCal>.getDisplayName(
				GregorianCalendar.DAY_OF_WEEK, Calendar.LONG,
				Locale.US).toUpperCase());
	        	* LONG - "monday"
	        	* SHORT - "mon"  */
		
		SimpleDateFormat simdteform = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
		String input = "06:04:27 03.10.1322";
		 try {
			      Date date2 = simdteform.parse(input);
			      System.out.println(date2); // Mon Oct 27 00:00:00 EET 2008
			    } catch (ParseException e) {
				    System.out.println("Error in parsing " + input);
			    }
		 
		 /*The format (...) method accepts a Date object as a argument and returns the
		String value we can then show to the user or process it in any way. Unlike parse (...),
		Format (...) does not always throw an exception, It is not necessary every time
		to  intercept ParseException. However, with an incorrect template is used
		IllegalArgumentException may occur.*/
				 
		 String pattern = "h часа и mm мин. ";
		 SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		 Date dateNow = new Date();
		 System.out.println("Right now is: " + dateNow); 
		 String formattedDate = sdf.format(dateNow);
		 System.out.println("На прост език казваме, че часа е: " + formattedDate);
	}
}
