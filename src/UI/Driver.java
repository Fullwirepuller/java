package UI;

import java.util.ArrayList;
import java.util.Scanner;

import Dao.StudentDao;
import Vo.Student;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StudentDao dao = new StudentDao();
		Student stu = null;
		ArrayList<Student> query=null;
		int choice = menu();
		while (choice != 5) {
			switch (choice) {
			case 1:
				System.out.print("������ѧ��ѧ��:");
				String id = scan.nextLine();
				stu = dao.get(id);
				if(stu==null){
					System.out.println("û�и�ѧ����Ϣ!");
				}
				else{
					System.out.println(stu.toString());
				}
				break;
			case 2:
				System.out.print("������fieldName:");
				String fieldName = scan.nextLine();
				System.out.print("������value:");
				String value = scan.nextLine();
				query=dao.query(fieldName, value,"y");
				if(query==null){
					System.out.println("û�и�ѧ����Ϣ!");
				}
				else{
					System.out.println(query.toString());
				}
				break;
			case 3:
				query=dao.readStudentFromKeyBoard();
				int count = dao.insert(query);
				if(count>1)
					System.out.println("ѧ����Ϣ����ɹ���");
				else
					System.out.println("ѧ����Ϣ����ʧ�ܣ�");
				break;
			case 4:
				System.out.println("����Ҫɾ����ѧ��ѧ�ţ�");
				String sno = scan.next();
				int iRet = dao.delete(sno);
				if(iRet>1)
					System.out.println("ѧ����Ϣɾ���ɹ���");
				else
					System.out.println("ѧ����Ϣɾ��ʧ�ܣ�");
				break;
			default:
				System.out.println("������Ч,����������!");
			}
			choice = menu();
		}

	}

	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.����ѧ�Ų�ѯѧ����Ϣ");
		System.out.println("2.����ָ���ֶβ�ѯ(���磺gender �� y)");
		System.out.println("3.����ѧ����Ϣ");
		System.out.println("4.ɾ��ѧ����Ϣ");
		System.out.println("5.�˳�");
		System.out.print("���������ѡ��:");
		int choice = scan.nextInt();
		return choice;
	}

}
