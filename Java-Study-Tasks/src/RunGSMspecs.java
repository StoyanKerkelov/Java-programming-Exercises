import java.util.Scanner;

	/*To the cell class from the previous two tasks, add
	Static field nokiaN95 that stores mobile information
	Phone model Nokia 95. Add a method in the same class that it displays
	Information about this static field.
	
	Define properties to encapsulate data in the GSM,
	Battery and Display.
	 */
public class RunGSMspecs {

	public static GSMspecs nokiaN95 = new GSMspecs("NokiaN95");
	
	public static void main(String[] args) {
		PrintGSM(nokiaN95);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Write how much GSM specs do you want to input?");
		int counter = input.nextInt();
		Object array [] = new Object[counter];
		for(int i =0; i< counter; i++){
			array[i] = SetGSM();
		}
		System.out.println("Your input is:\n ");
		for(int i =0; i< counter; i++){
			Object instanceOfStudent = array[i];
			PrintGSM((GSMspecs) instanceOfStudent);
		}
	}
	
	public static GSMspecs SetGSM(){	//set GSM fields
		Scanner input = new Scanner(System.in);
		
		//model
		System.out.print("Write model ");
		String model = input.nextLine();
		//manufacturer
		System.out.print("Write manufacturer");
		String manufacturer = input.nextLine();
		//price
		System.out.print("Write price ");
		String price = input.nextLine();
		//owner
		System.out.print("Write owner ");
		String owner = input.nextLine();
		//batteryModel
		System.out.print("Write battery model ");
		String batteryModel = input.nextLine();
		//batteryIdle
		System.out.print("Write battery idle time ");
		String batteryIdle = input.nextLine();
		//batteryTalk
		System.out.print("Write battery talk time ");
		String batteryTalk = input.nextLine();
		//displaySize
		System.out.print("Write display size ");
		String displaySize = input.nextLine();
		//displayColors
		System.out.print("Write display colors ");
		String displayColors = input.nextLine();
				
		return  new GSMspecs(model, manufacturer, price, owner, batteryModel, batteryIdle, batteryTalk, displaySize, displayColors);
		
	}
	
	public static void PrintGSM(GSMspecs InstanceOfPhone){//print GSM fields
		
		/* String model;
		 String manufacturer;
		 String price;
		 String owner;
		 String batteryModel;
		 String batteryIdle;
		 String batteryTalk;
		 String displaySize;
		 String displayColors;*/
		
		System.out.println("\nPhone data:");
		System.out.println("Model: " + InstanceOfPhone.getModel());	//using getters
		System.out.println("Manufacturer: " + InstanceOfPhone.getManufacturer());
		System.out.println("Price: " + InstanceOfPhone.getPrice());
		System.out.println("Owner:" + InstanceOfPhone.getOwner());
		System.out.println("Battery model: " + InstanceOfPhone.getBatteryModel());
		System.out.println("Idle time: " + InstanceOfPhone.getBatteryIdle());
		System.out.println("Talk time: " + InstanceOfPhone.getBatteryTalk());
		System.out.println("Display size: " + InstanceOfPhone.getDisplaySize());
		System.out.println("Display colors: " + InstanceOfPhone.getDisplayColors());
		System.out.println();
	}
	
}
