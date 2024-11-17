package superexample3;
import java.util.Scanner;

public class Child extends Parent {
	 

	public Child(int num1,int num2) {
		super(num1,num2);
		float reminder=total%10;
		if(reminder==0) 
			System.out.println(" Sum of the number is dividible by 10");
		else
			System.out.println(" Sum of the number is not by 10");
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println(" Enter the Number 1");
		n1=sc.nextInt();
		System.out.println(" Enter the Number 2");
		n2=sc.nextInt();
		
		Child obj1 = new Child(n1,n2);
		

	}

}
