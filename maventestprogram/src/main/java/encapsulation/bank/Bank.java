package encapsulation.bank;


public class Bank {

	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void pinValidation() {
		switch(pin)
		{
		case 1001:System.out.println("Validation Successful");break;
		case 1234:System.out.println("Validation Successful");break;
		case 1212:System.out.println("Validation Successful");break;
		default:System.out.println("Not a valid pin.Validation Unsuccessful"); 
		
		}
	}
}
