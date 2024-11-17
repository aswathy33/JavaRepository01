package student;
import java.util.Scanner;



public class BasicInfo {

	 int rollNo;
	 String name;
		public void basicDetails() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Roll No");
			rollNo=sc.nextInt();
			System.out.println("Enter the Name");
			name=sc.next();
			
		}
}
