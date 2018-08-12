package warmup;

public class SingleHouse extends Building {

	double hoaFee;
	
	public  SingleHouse(String name , String type, int floorCount,double hoaFee){
		super(name,type,floorCount);
	}
	@Override
	public String toString() {
	
		return super.toString()+hoaFee+"| SingleHouse";
	}
	@Override
	public void addDoor() {
	System.out.println("adding door in single house");	
		
	}
	@Override
	public void addFloor() {
		
		super.addFloor();
	}
}
