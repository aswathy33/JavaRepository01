package multilevel.vehicle;

import java.util.Scanner;

public class Model extends Vehicle {
	
	 int modelNumber;
	 String model;
		public void modelDetails() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your vehicle's Model/company ");
			model=sc.next();
			System.out.println("Enter your vehicle's Model number");
			modelNumber=sc.nextInt();	
			
		}

}
