package polymorphism;

public class Child extends Parent {

	int differ;
	public void addition(int num1,int num2) {
		//super.addition(num1, num2);//this will call parent method 
		differ=num1-num2;
		System.out.println("Total :"+differ);
		
	}
	public static void main(String[] args) {
		/*Child obj1=new Child();
		obj1.addition(100, 50);
		 Parent obj2=new Parent();
		 obj2.addition(80, 20); */
	
		//this will run methods in parent  class but if we have overriding method on child class, then it will get execute.
		Parent obj1=new Child();
		obj1.addition(100, 25);
		obj1.display();

	}

}
