package superexample;

public class SuperChild extends SuperParent{
	
	public SuperChild() {
		super(100);
		System.out.println("This is child");
	}

	public static void main(String[] args) {
		
		SuperChild obj1=new SuperChild();

	}

}
