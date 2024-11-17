package employee;

public class TotalSalary extends OtherSalaryDetails{

	public void totalSalaryDetails() {
		
		float total=0;
		total=basicPay+bonus+hra-pf-deduction;
		
		System.out.println(" Basic Pay : "+basicPay);
		System.out.println("Deduction : "+deduction );
		System.out.println("Bonus : "+bonus);
		System.out.println("HRA : "+hra);
		System.out.println("PF : "+pf);
		System.out.println("Total Salary : "+total);
		
	}
	public static void main(String[] args) {
		
		TotalSalary obj1=new TotalSalary();
		obj1.basicDetails();
		obj1.calculate();
		obj1.totalSalaryDetails();
		

	}

}
