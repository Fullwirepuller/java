package Project;
import java.util.Scanner;
public class ProjectDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ŀ���ƣ�");
		String projectName = scan.next();
		System.out.println("��������ĿԤ�㣺");
		float budget = scan.nextFloat();
		
		System.out.println("������Ա��1��������");
		String emp1Name = scan.next();
		System.out.println("������Ա��1�Ĳ��ţ�");
		String emp1Department = scan.next();
		System.out.println("������Ա��1�ĵ�н��");
		float baseSalary1 = scan.nextFloat();
		Employee emp1 = new Employee(emp1Name,emp1Department,baseSalary1);
		
		System.out.println("������Ա��2��������");
		String emp2Name = scan.next();
		System.out.println("������Ա��2�Ĳ��ţ�");
		String emp2Department = scan.next();
		System.out.println("������Ա��2�ĵ�н��");
		float baseSalary2 = scan.nextFloat();
		Employee emp2 = new Employee(emp2Name,emp2Department,baseSalary2);
		
		Project pro = new Project(projectName, budget, emp1, emp2);
		System.out.println(pro.toString());
		
		pro.updateBudget();
		System.out.println("��Ԥ��Ϊ��"+pro.getBudget());
		System.out.println(pro.toString());
		

	}

}
