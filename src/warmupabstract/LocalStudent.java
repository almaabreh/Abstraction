package warmupabstract;

public class LocalStudent extends Student{

	public LocalStudent(int studentID ,String name){
		super(studentID,name);
	}
		public static void main(String[] args) {
	}

	

	@Override
	public void attendClass() {
		System.out.println("attending class locally");
		
	}

}
