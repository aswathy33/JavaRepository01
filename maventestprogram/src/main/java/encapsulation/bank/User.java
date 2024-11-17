package encapsulation.bank;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin");
		int pinNum =sc.nextInt();
		
		Bank obj=new Bank();
		obj.setPin(pinNum);
		obj.pinValidation();
		
	}

}
