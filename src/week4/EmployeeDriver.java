package week4;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		float increase;
		Employee emp1 = new Employee(1001, "Tom", 2500);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������нˮ�����ʣ�");
		increase = scan.nextFloat();
		float salaryIncrease = emp1.getSalaryIncrease(increase);

		emp1.displayEmployee();
		System.out.print("Ա��1��нˮ������Ϊ��" + salaryIncrease);
		float newSalary = emp1.updateSalary();
		System.out.println(", ��н��Ա��1�Ĺ���Ϊ��" + newSalary);
	}

}
