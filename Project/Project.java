package Project;

public class Project {

	private String projectName;
	private float budget;
	private Employee emp1;
	private Employee emp2;

	public Project() {

	}

	public Project(String projectName, float budget, Employee emp1, Employee emp2) {
		this.projectName = projectName;
		this.budget = budget;
		this.emp1 = emp1;
		this.emp2 = emp2;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public void updateBudget() {
		this.budget = this.budget * 1.2f;
	}

	public String toString() {
		String info = "";
		info ="projectName= " + this.projectName +"\n" ;
		info = info + "budget=" + this.budget +"\n";
		info = info + "emp1:\n" ;
		info += this.emp1.toString()+"\n";
		info = info + "emp2:\n" ;
		info += this.emp2.toString()+"\n";
		return info;
	}

}
