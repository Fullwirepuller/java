package bankSystem;

public class SavingAccount extends BankAccount{
	private double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void payInterest() {
		super.setBalance(super.getBalance()*(1+this.getInterestRate()));
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", toString()=" + super.toString() + "]";
	}
	
}
