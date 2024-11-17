package encapsulation;

public class DisplayAccount {

	public static void main(String[] args) {
		AccountDetils obj=new AccountDetils();
		obj.setName("Aswathy");
		obj.setBalance(10000f);
		obj.interest();
		System.out.println("Name :"+ obj.getName());
		System.out.println("Balance :"+ obj.getBalance());

	}

}
