package inheritance;

public class ChildClass extends Parent {
	
public void childDisplay() {
		
		System.out.println("This is the child method");
		display();
	}

	public static void main(String[] args) {
		ChildClass obj1=new ChildClass();
		obj1.display();
		obj1.childDisplay();
		Parent obj2=new Parent();
		obj2.display();

	}

}
