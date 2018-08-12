package warmup;

public class Building {
 
private String name;
private String type;
private int floorCount;

public Building(){
	System.out.println("Almaabreh");
}



public Building(String name, String type, int floorCount) {
	super();
	this.name = name;
	this.type = type;
	this.floorCount = floorCount;
}
 @Override
	public String toString() {
		return"building info: " + name+" " + type+ " "+floorCount;
		
	} 

public void addFloor(){
	floorCount++;
	System.out.println("floor count increased");
}
public void addDoor(){
	System.out.println("floor count increased");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getFloorCount() {
	return floorCount;
}
public void setFloorCount(int floorCount) {
	this.floorCount = floorCount;
	
}



}



	
	
	
	
	
