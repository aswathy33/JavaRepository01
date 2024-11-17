package multilevel_inheritance;


public class Child extends Intermediate {

public void childDisplay() {
		
		System.out.println("This is the child method");
		intermediateDisplay();
		displayParent();
		
	}

	public static void main(String[] args) {
		Child obj1=new Child();
		obj1.intermediateDisplay();
		obj1.childDisplay();
		obj1.displayParent();
		

	}


	}


