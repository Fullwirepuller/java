package bankSystem;

public class CheckingAccount extends BankAccount{
	private double serviceFee;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accountNum, double balance, double serviceFee) {
		super(accountNum, balance);
		this.serviceFee = serviceFee;
	}

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	
	public void assessServiceCharge(){
		super.setBalance(super.getBalance()-this.getServiceFee());;	
	}

	@Override
	public String toString() {
		return "CheckingAccount [serviceFee=" + serviceFee + ", toString()=" + super.toString() + "]";
	}
	

}
