package superexample2;

public class Child extends Parent{
	int number;
	public void setData(int num) {
		super.number=num; 
		
	}
	
	public void setChildData() {
		number=number+10; 
		System.out.println("Child -Number :"+ number);
		
	}

	public static void main(String[] args) {
		
		Child obj1=new Child();
		obj1.parentData();
		obj1.setData(100);
		obj1.parentData();
		obj1.setChildData();
	}

}
