package Project;

public class Employee {
	private String name;
	private String department;
	private float baseSalary;
	
	public Employee() {
		super();
	}

	public Employee(String name, String department, float baseSalary) {
		this.name = name;
		this.department = department;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void update(){
		this.baseSalary = this.baseSalary * 1.035f;                     
	}


	public String toString() {
		String info="";
		info += "name=" + this.name;
		info += ", department=" + this.department;
		info += ", baseSalary=" + this.baseSalary;
		return info;
	}
	
	


}
