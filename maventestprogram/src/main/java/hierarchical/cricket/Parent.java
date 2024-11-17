package hierarchical.cricket;

import java.util.Scanner;
public class Parent {
	
	String region;
	int batch;
 public void basicDetails() {
	 Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Region");
		region=sc.next();
		System.out.println("Enter your Batch number");
		batch=sc.nextInt();	
 }
}
