package warmupabstract;

public abstract class Student {
	
	int studentID;
	String name;
	
	public abstract void attendClass();

	public Student(int studentID, String name) {
	
		this.studentID = studentID;
		this.name = name;
	}
	
}
