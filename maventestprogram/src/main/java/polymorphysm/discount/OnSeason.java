package polymorphysm.discount;

public class OnSeason {
	float finalAmount;
 public void discount(int amnt) {
	 
	 float finalAmount=amnt-(.4f*amnt);
	 System.out.println("The final amount after discount is "+finalAmount);
 }
}
