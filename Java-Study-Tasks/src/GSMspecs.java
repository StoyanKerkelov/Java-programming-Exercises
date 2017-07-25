
public class GSMspecs {

	/* Define a class that contains mobile phone information:
	- Model
	- Manufacturer,
	- Price,
	- Owner,
	- Battery characteristics (model, idle time and hours of talk / hours talk) and
	- Screen characteristics (size and colors).
	* 
	2. To the mobile phone class of the previous two tasks, add
	Static field nokiaN95 that stores mobile information about Nokia 95. 
	Add a method in the same class that it displays Information about that static field.
	
	 */
	
	// Instance variables
	 String model;
	 String manufacturer;
	 String price;
	 String owner;
	 String batteryModel;
	 String batteryIdle;
	 String batteryTalk;
	 String displaySize;
	 String displayColors;
	// Static variable
	static int GSM_ModelCount=0;
	//constructors
	
	public GSMspecs(String model){
		this(model, "Somewhere in China", "cheap", "Bate Koliu", "SDF-567l", "32 hours", "9 hours" , "2,45\"", "16 billion");
	}
	public GSMspecs(String model, String manufacturer){
		this(model, manufacturer, "cheap", "Bate Koliu", "SDF-567l", "32 hours", "9 hours" , "2,45\"", "16 billion");
		}
	public GSMspecs(String model, String manufacturer, String price){
		this(model, manufacturer, price, "Bate Koliu", "SDF-567l", "32 hours", "9 hours" , "2,45\"", "16 billion");
	}
	public GSMspecs(String model, String manufacturer, String price, String owner){
		this(model, manufacturer, price, owner, "SDF-567l", "32 hours", "9 hours" , "2,45\"", "16 billion");
	}
	public GSMspecs(String model, String manufacturer, String price, String owner, String batteryModel){
		this(model, manufacturer, price, owner, batteryModel, "32 hours", "9 hours" , "2,45\"", "16 billion");
		}
	public GSMspecs(String model, String manufacturer, String price, String owner, String batteryModel
			, String batteryIdle){
		this(model, manufacturer, price, owner, batteryModel, batteryIdle, "9 hours" , "2,45\"", "16 billion");
		}
	public GSMspecs(String model, String manufacturer, String price, String owner, String batteryModel
			, String batteryIdle,  String batteryTalk){
		this(model, manufacturer, price, owner, batteryModel, batteryIdle, batteryTalk , "2,45\"", "16 billion");
		}
	public GSMspecs(String model, String manufacturer, String price, String owner, String batteryModel
			, String batteryIdle,  String batteryTalk, String displaySize){
		this(model, manufacturer, price, owner, batteryModel, batteryIdle, batteryTalk , displaySize, "16 billion");
		}
	
	
	public GSMspecs(String model,			//complete constructor
	 String manufacturer,
	 String price,
	 String owner,
	 String batteryModel,
	 String batteryIdle,
	 String batteryTalk,
	 String displaySize,
	 String displayColors){
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.batteryModel = batteryModel;
		this.batteryIdle = batteryIdle;
		this.batteryTalk = batteryTalk;
		this.displaySize = displaySize;
		this.displayColors = displayColors;

		GSM_ModelCount++;
	}
	
	String getModel() {							//getter model
		return model;
	}
	void setModel(String model) {				//setter model
		this.model = model;
	}
	String getManufacturer() {					//getter manufacturer
		return manufacturer;
	}
	void setManufacturer(String manufacturer) {	//setter manufacturer
		this.manufacturer = manufacturer;
	}
	String getPrice() {							//getter price
		return price;
	}
	void setPrice(String price) {					//setter price
		this.price = price;
	}
	String getOwner() {							//getter owner
		return owner;
	}
	void setOwner(String owner) {				//setter owner
		this.owner = owner;
	}
	String getBatteryModel() {					//getter batteryModel
		return batteryModel;
	}
	void setBatteryModel(String batteryModel) {	//setter batteryModel
		this.batteryModel = batteryModel;
	}
	String getBatteryIdle() {						//getter batteryIdle
		return batteryIdle;
	}
	void setBatteryIdle(String batteryIdle) {		//setter batteryIdle
		this.batteryIdle = batteryIdle;
	}
	String getBatteryTalk() {						//getter batteryTalk
		return batteryTalk;
	}
	void setBatteryTalk(String batteryTalk) {		//setter batteryTalk
		this.batteryTalk = batteryTalk;
	}
	String getDisplaySize() {						//getter displaySize
		return displaySize;
	}
	void setDisplaySize(String displaySize) {		//setter displaySize
		this.displaySize = displaySize;
	}
	String getDisplayColors() {					//getter displayColors
		return displayColors;
	}
	void setDisplayColors(String displayColors) {	//setter displayColors
		this.displayColors = displayColors;
	}
	
}
