package hierarchical.cricket;

import java.util.Scanner;

public class Child1 extends Parent {

		
		String name;
		int age,totalRuns;
	 public void candidateDetails() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your details of 1st Candidate");
			System.out.println("Enter your Name");
			name=sc.next();
			System.out.println("Enter your age");
			age=sc.nextInt();
			System.out.println("Enter total runs scored");
			totalRuns=sc.nextInt();
			
			System.out.println("Candidate1 Details");
			System.out.println("Region :"+region);
			System.out.println("Batch number "+ batch);
			System.out.println("Name :"+name);
			System.out.println("Age :"+age);
			System.out.println("totalRuns :"+totalRuns);
	 }
}
