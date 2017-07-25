package cats;

public class Cat {
	// field name
	public String name;
	// field color
	public String color;

	// Getter of property name Method()
	public String getName() {
		return this.name;
	}

	// Setter of property name Method()
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter of property color Method()
	public String getColor() {
		return this.color;
	}
	
	// Setter of property color Method()
	public void setColor(String color) {
		this.color = color;
	}

	//Default constructor - just default field values
	public Cat() {
		this.name = "Unnamed";
		this.color = "no color";
	}
	
	//Constructor with parameters
	public Cat (String name, String color){
		this.name = name;
		this.color = color;
	}

	public void sayMiau() {
		System.out.printf("%s said: Miauuuuuu!%n", name);
	}
}

	//Cat someCat = new Cat("Johnny", "brown"); оператор за създаване на нов обект
	//someCat = null; освобождаваме се от обекта




