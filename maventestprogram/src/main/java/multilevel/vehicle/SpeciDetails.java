package multilevel.vehicle;

import java.util.Scanner;

public class SpeciDetails extends Model {

	int year,speed;
	public void specDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year of purchase");
		year=sc.nextInt();
		System.out.println("Enter your vehicle's speed per hour");
		speed=sc.nextInt();	
		
	}
	public void display() {
		System.out.println("----Vehicle Details----");
		System.out.println("Vehicle :"+vehicle);
		System.out.println(" Model :"+model);
		System.out.println("Model number :"+modelNumber);
		System.out.println(" Year :"+year);
		System.out.println(" Speed :"+speed);
	}
	public static void main(String[] args) {
		SpeciDetails obj1=new SpeciDetails();
		obj1.vehicleDetails();
		obj1.modelDetails();
		obj1.specDetails();
		obj1.display();

	}

}
