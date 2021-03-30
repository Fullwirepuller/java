package SubjectList;

import java.util.Scanner;

public class ClassListDriver {

	private static ClassList List = null;

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 3) {
			switch (choose) {
			case 1:
				createList();
				break;
			case 2:
				printList();
				break;
			default:
				System.out.println("请重新输入");
				break;
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("=========WTU选课系统===========");
		System.out.println("1.Create Attendance List");
		System.out.println("2.Print Attendance List");
		System.out.println("3.Exit");
		System.out.println("please choose(1-2)");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void createList() {
		Scanner scan = new Scanner(System.in);
		if(List!=null) {
			System.out.println("课程已创建，是否重新创建(Y/N)");
			String s = scan.next();
			if(s.equalsIgnoreCase("N")) {
				return ;
			}
		}
		System.out.println("请输入学年：");
		int year = scan.nextInt();
		System.out.println("请输入学期(1,2)：");
		int semester = scan.nextInt();

		System.out.println("请输入课程代码：");
		String subId = scan.next();
		System.out.println("请输入课程名称：");
		String subName = scan.next();
		Subject sub = new Subject(subId, subName);

		System.out.println("请输入学生1的学号：");
		String s1Id = scan.next();
		System.out.println("请输入学生1的名字：");
		String s1Name = scan.next();
		Student s1 = new Student(s1Id, s1Name);
		System.out.println("请输入学生2的学号：");
		String s2Id = scan.next();
		System.out.println("请输入学生2的名字：");
		String s2Name = scan.next();
		Student s2 = new Student(s2Id, s2Name);

		List = new ClassList(semester, year, sub, s1, s2);
	}

	public static void printList() {
		if(List==null){
			System.out.println("请先创建课程");
			return ;
		}
		System.out.println(List.toString());
	}
}
