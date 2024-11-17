package encapsulation;

public class AccountDetils {

	private String name;
	private float balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void interest() {
		float i;
		i=balance*0.2f;
		balance+=i;
	}
}
