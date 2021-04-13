package SubjectEnrolmentSystem;

import java.util.Scanner;

public class Driver {
	
	public static Subject subj = null;
	public static Enrolment enrolment = null;
	
	public static void main(String[] args) {
		int choose = menu();
		while(choose!=5){
			switch(choose){
			case 1:createSubject();break;
			case 2:addStudent();break;
			case 3:withDraw();break;
			case 4:print();break;
			default:break;
			}
			choose = menu();
		}
		System.out.println("谢谢使用选课系统");
	}
	
	public static int menu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("=======WTU选课系统=====");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印名单");
		System.out.println("5.退出");
		int choose = scan.nextInt();
		return choose;
	}
	
	public static void createSubject(){
		Scanner scan = new Scanner(System.in);
		if(enrolment!=null){
			System.out.println("已经创建课程，是否重新创建(Y/N)");
			String choose = scan.next();
			if(choose.equalsIgnoreCase("N")){
				return ;
			}
		}
		System.out.println("请输入课程号:");
		String subjId = scan.next();
		System.out.println("请输入课程名称:");
		String subjName = scan.next();
		System.out.println("请输入课程人数:");
		int subjNum = scan.nextInt();
		
	    subj = new Subject(subjId,subjName,subjNum);
		enrolment = new Enrolment(subjNum);
		
		System.out.println("创建课程成功，信息如下：");
		System.out.println(subj.toString());
	}
	
	public static void addStudent(){
		Scanner scan = new Scanner(System.in);
		if(enrolment==null){
			System.out.println("请先创建课程");
			return ;
		}
		if(enrolment.size()>=subj.getSubjNum()){
			System.out.println("已达到最大人数，不能再选！");
			return ;
		}	
		System.out.println("请输入学生id：");
		String id = scan.next();
		System.out.println("请输入学生名称：");
		String name = scan.next();
		
		Student stu = new Student(id,name);
		if(enrolment.add(stu))
			System.out.println("恭喜你，选课成功！");
		else
			System.out.println("选课失败！");
		
		System.out.println("目前选课情况如下：");
		System.out.println(subj.toString());
		System.out.println("选课人数："+enrolment.size());
		System.out.println(enrolment.toString());
	}
	
	public static void withDraw(){
		Scanner scan = new Scanner(System.in);
		if(enrolment==null){
			System.out.println("请先创建课程");
			return ;
		}
		System.out.println("请输入退选学生id:");
		String id = scan.next();
		int index = enrolment.indexOf(id);
		if(index == -1){
			System.out.println("学号为"+id+"的学生没有选课！");
		}else{
			if(enrolment.remove(index)) {
				System.out.println("学号为"+id+"的学生,课程退选成功！");
			}
		}
	}
	
	public static void print(){
		if(enrolment==null){
			System.out.println("请先创建课程!");
			return ;
		}
		System.out.println(subj.toString());
		System.out.println("选课人数："+enrolment.size());
		System.out.println(enrolment.toString());
	}
	
}
