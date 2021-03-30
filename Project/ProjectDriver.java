package Project;
import java.util.Scanner;
public class ProjectDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入项目名称：");
		String projectName = scan.next();
		System.out.println("请输入项目预算：");
		float budget = scan.nextFloat();
		
		System.out.println("请输入员工1的姓名：");
		String emp1Name = scan.next();
		System.out.println("请输入员工1的部门：");
		String emp1Department = scan.next();
		System.out.println("请输入员工1的底薪：");
		float baseSalary1 = scan.nextFloat();
		Employee emp1 = new Employee(emp1Name,emp1Department,baseSalary1);
		
		System.out.println("请输入员工2的姓名：");
		String emp2Name = scan.next();
		System.out.println("请输入员工2的部门：");
		String emp2Department = scan.next();
		System.out.println("请输入员工2的底薪：");
		float baseSalary2 = scan.nextFloat();
		Employee emp2 = new Employee(emp2Name,emp2Department,baseSalary2);
		
		Project pro = new Project(projectName, budget, emp1, emp2);
		System.out.println(pro.toString());
		
		pro.updateBudget();
		System.out.println("新预算为："+pro.getBudget());
		System.out.println(pro.toString());
		

	}

}
