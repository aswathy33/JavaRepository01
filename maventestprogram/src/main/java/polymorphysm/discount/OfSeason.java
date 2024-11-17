package polymorphysm.discount;
import java.util.Scanner;

public class OfSeason {

	float finalAmount;
 public void discount(int amount) {
	 
	 float finalAmount=amount-(.15f*amount);
	 System.out.println("The final amount after discount is "+finalAmount);
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amt,season;
		System.out.println("Enter the total amount purcahsed");
		amt=sc.nextInt();
		System.out.println("Enter the Season : 1-Off season  2-On Season");
		season=sc.nextInt();
		
		OfSeason obj1=new OfSeason();
		OnSeason obj2=new OnSeason();
		
		if(season==1)
			obj1.discount(amt);
		else
			obj2.discount(amt);
		
		
		
	
	}

}
