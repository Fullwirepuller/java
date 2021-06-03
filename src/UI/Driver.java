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
				System.out.print("请输入学生学号:");
				String id = scan.nextLine();
				stu = dao.get(id);
				if(stu==null){
					System.out.println("没有该学生信息!");
				}
				else{
					System.out.println(stu.toString());
				}
				break;
			case 2:
				System.out.print("请输入fieldName:");
				String fieldName = scan.nextLine();
				System.out.print("请输入value:");
				String value = scan.nextLine();
				query=dao.query(fieldName, value,"y");
				if(query==null){
					System.out.println("没有该学生信息!");
				}
				else{
					System.out.println(query.toString());
				}
				break;
			case 3:
				query=dao.readStudentFromKeyBoard();
				int count = dao.insert(query);
				if(count>1)
					System.out.println("学生信息插入成功！");
				else
					System.out.println("学生信息插入失败！");
				break;
			case 4:
				System.out.println("输入要删除的学生学号：");
				String sno = scan.next();
				int iRet = dao.delete(sno);
				if(iRet>1)
					System.out.println("学生信息删除成功！");
				else
					System.out.println("学生信息删除失败！");
				break;
			default:
				System.out.println("输入无效,请重新输入!");
			}
			choice = menu();
		}

	}

	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.输入学号查询学生信息");
		System.out.println("2.输入指定字段查询(例如：gender 男 y)");
		System.out.println("3.增加学生信息");
		System.out.println("4.删除学生信息");
		System.out.println("5.退出");
		System.out.print("请输入你的选项:");
		int choice = scan.nextInt();
		return choice;
	}

}
