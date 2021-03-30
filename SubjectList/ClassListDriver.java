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
				System.out.println("����������");
				break;
			}
			choose = menu();
		}
		System.out.println("��ӭ�´�ʹ��");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("=========WTUѡ��ϵͳ===========");
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
			System.out.println("�γ��Ѵ������Ƿ����´���(Y/N)");
			String s = scan.next();
			if(s.equalsIgnoreCase("N")) {
				return ;
			}
		}
		System.out.println("������ѧ�꣺");
		int year = scan.nextInt();
		System.out.println("������ѧ��(1,2)��");
		int semester = scan.nextInt();

		System.out.println("������γ̴��룺");
		String subId = scan.next();
		System.out.println("������γ����ƣ�");
		String subName = scan.next();
		Subject sub = new Subject(subId, subName);

		System.out.println("������ѧ��1��ѧ�ţ�");
		String s1Id = scan.next();
		System.out.println("������ѧ��1�����֣�");
		String s1Name = scan.next();
		Student s1 = new Student(s1Id, s1Name);
		System.out.println("������ѧ��2��ѧ�ţ�");
		String s2Id = scan.next();
		System.out.println("������ѧ��2�����֣�");
		String s2Name = scan.next();
		Student s2 = new Student(s2Id, s2Name);

		List = new ClassList(semester, year, sub, s1, s2);
	}

	public static void printList() {
		if(List==null){
			System.out.println("���ȴ����γ�");
			return ;
		}
		System.out.println(List.toString());
	}
}
