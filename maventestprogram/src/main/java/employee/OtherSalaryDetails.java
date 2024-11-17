package employee;

public class OtherSalaryDetails extends BasicSalaryDetails {
	
	 float hra,pf;
	public void calculate() {
		
		hra=.05f*basicPay;
		pf=.20f*basicPay;
		
	}

}
