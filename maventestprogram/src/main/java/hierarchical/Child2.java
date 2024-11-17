package hierarchical;

public class Child2 extends Parent {
	
	public void displayChild2() {
		System.out.println("This is the Child 2 method");
	}
	

	public static void main(String[] args) {
		Child2 obj1=new Child2();
		obj1.displayChild2();
		obj1.displayParent();
		
		Child1 obj2=new Child1();
		obj2.displayChild1();
		obj2.displayParent();

	}

}
