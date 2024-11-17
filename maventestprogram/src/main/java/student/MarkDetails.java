package student;
import java.util.Scanner;

public class MarkDetails extends BasicInfo{
float average;
	public void markDetails() {
		int mark1,mark2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mark1");
		mark1=sc.nextInt();
		System.out.println("Enter Mark2");
		mark2=sc.nextInt();
		
		average=(mark1+mark2)/2;
		
	}
	public void display() {
		System.out.println("Roll No :" +rollNo);
		System.out.println("Name :" +name);
		System.out.println("Average :" +average);
		
	}
	public static void main(String[] args) {
		MarkDetails obj1=new MarkDetails();
		obj1.basicDetails();
		obj1.markDetails();
		obj1.display();

	}

}
