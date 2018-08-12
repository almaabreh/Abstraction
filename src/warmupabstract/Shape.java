package warmupabstract;

public abstract class Shape {
	String name;
	String area ;
	
	
	
	public Shape(){
		
	}
	
	public Shape(String name) {
		
		this.name = name;
		
	}
	public abstract double calculateArea();
	public abstract void draw();
		
	
}
