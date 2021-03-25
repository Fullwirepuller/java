package week4;

public class Employee {
	private int id;
	private String name;
	private float baseSalary;
	private float salaryIncrease;

	public Employee(int id, String name, float baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public float getSalaryIncrease(float increase) {
		return salaryIncrease = this.baseSalary * increase;
	}

	public float updateSalary() {
		return this.baseSalary = this.baseSalary + this.salaryIncrease;
	}

	public void displayEmployee() {
		String info = "";
		info = "id=" + this.id + ", name=" + this.name + ", ";
		System.out.print(info);
	}

}
