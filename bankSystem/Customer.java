package bankSystem;

public class Customer {
	private String ssn;
	private String name;
	private SavingAccount sa;
	private CheckingAccount ca;
	
	public Customer() {
		super();
	}

	public Customer(String ssn, String name, SavingAccount sa, CheckingAccount ca) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.sa = sa;
		this.ca = ca;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SavingAccount getSa() {
		return sa;
	}

	public void setSa(SavingAccount sa) {
		this.sa = sa;
	}

	public CheckingAccount getCa() {
		return ca;
	}

	public void setCa(CheckingAccount ca) {
		this.ca = ca;
	}
	
	public String toString(){
		String info = "";
		info = "ssn = " +this.ssn +",name = " +this.name+"\n";
		info+= "sa:" + "\n" + this.sa.toString() + "\n";
		info+= "ca:" + "\n" + this.ca.toString();
		return info;
	}

}
