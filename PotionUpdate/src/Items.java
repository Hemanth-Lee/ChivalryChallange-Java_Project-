
public class Items {
	public String name;
	public String description;
	
	
	//Constructor
	
	public Items (String name, String description) {
		this.name = name;
		this.description = description;
		
		
	}
	
	//getter methods
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

	public String toString(Items item){
		return getName();
	}
}
	
/*public static void main(String[] args) {
	System.out.println("2");
}
}*/