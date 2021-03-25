package week4;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		float increase;
		Employee emp1 = new Employee(1001, "Tom", 2500);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入薪水增长率：");
		increase = scan.nextFloat();
		float salaryIncrease = emp1.getSalaryIncrease(increase);

		emp1.displayEmployee();
		System.out.print("员工1的薪水增长额为：" + salaryIncrease);
		float newSalary = emp1.updateSalary();
		System.out.println(", 加薪后员工1的工资为：" + newSalary);
	}

}
