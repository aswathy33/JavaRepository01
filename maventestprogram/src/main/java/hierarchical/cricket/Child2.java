package hierarchical.cricket;

import java.util.Scanner;


public class Child2 extends Parent {
	
	String name2;
	int age2,totalRuns2;
 public void candiadateDetails2() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your details of 2st Candidate");
		System.out.println("Enter your Name");
		name2=sc.next();
		System.out.println("Enter your age");
		age2=sc.nextInt();
		System.out.println("Enter total runs scored");
		totalRuns2=sc.nextInt();
		
		System.out.println("Candidate2 Details");
		System.out.println("Region :"+region);
		System.out.println("Batch number "+ batch);
		System.out.println("Name :"+name2);
		System.out.println("Age :"+age2);
		System.out.println("totalRuns :"+totalRuns2);
 }
	
	public static void main(String[] args) {
		Child1 obj1=new Child1();
		Child2 obj2=new Child2();
		 
		obj1.basicDetails();
		obj1.candidateDetails();
		obj2.candiadateDetails2();

	}

	
}
