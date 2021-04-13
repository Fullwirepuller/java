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
		System.out.println("ллʹ��ѡ��ϵͳ");
	}
	
	public static int menu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("=======WTUѡ��ϵͳ=====");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡ����");
		System.out.println("5.�˳�");
		int choose = scan.nextInt();
		return choose;
	}
	
	public static void createSubject(){
		Scanner scan = new Scanner(System.in);
		if(enrolment!=null){
			System.out.println("�Ѿ������γ̣��Ƿ����´���(Y/N)");
			String choose = scan.next();
			if(choose.equalsIgnoreCase("N")){
				return ;
			}
		}
		System.out.println("������γ̺�:");
		String subjId = scan.next();
		System.out.println("������γ�����:");
		String subjName = scan.next();
		System.out.println("������γ�����:");
		int subjNum = scan.nextInt();
		
	    subj = new Subject(subjId,subjName,subjNum);
		enrolment = new Enrolment(subjNum);
		
		System.out.println("�����γ̳ɹ�����Ϣ���£�");
		System.out.println(subj.toString());
	}
	
	public static void addStudent(){
		Scanner scan = new Scanner(System.in);
		if(enrolment==null){
			System.out.println("���ȴ����γ�");
			return ;
		}
		if(enrolment.size()>=subj.getSubjNum()){
			System.out.println("�Ѵﵽ���������������ѡ��");
			return ;
		}	
		System.out.println("������ѧ��id��");
		String id = scan.next();
		System.out.println("������ѧ�����ƣ�");
		String name = scan.next();
		
		Student stu = new Student(id,name);
		if(enrolment.add(stu))
			System.out.println("��ϲ�㣬ѡ�γɹ���");
		else
			System.out.println("ѡ��ʧ�ܣ�");
		
		System.out.println("Ŀǰѡ��������£�");
		System.out.println(subj.toString());
		System.out.println("ѡ��������"+enrolment.size());
		System.out.println(enrolment.toString());
	}
	
	public static void withDraw(){
		Scanner scan = new Scanner(System.in);
		if(enrolment==null){
			System.out.println("���ȴ����γ�");
			return ;
		}
		System.out.println("��������ѡѧ��id:");
		String id = scan.next();
		int index = enrolment.indexOf(id);
		if(index == -1){
			System.out.println("ѧ��Ϊ"+id+"��ѧ��û��ѡ�Σ�");
		}else{
			if(enrolment.remove(index)) {
				System.out.println("ѧ��Ϊ"+id+"��ѧ��,�γ���ѡ�ɹ���");
			}
		}
	}
	
	public static void print(){
		if(enrolment==null){
			System.out.println("���ȴ����γ�!");
			return ;
		}
		System.out.println(subj.toString());
		System.out.println("ѡ��������"+enrolment.size());
		System.out.println(enrolment.toString());
	}
	
}
