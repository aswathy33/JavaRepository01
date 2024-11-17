package employee;
import java.util.Scanner;

public class BasicSalaryDetails {
 
	 float basicPay,deduction,bonus;
	public void basicDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Pay");
		basicPay=sc.nextFloat();
		System.out.println("Enter the deduction");
		deduction=sc.nextFloat();
		System.out.println("Enter the bonus");
		bonus=sc.nextFloat();
	}
}
