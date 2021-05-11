package StudentInformation.Dao;

import java.util.ArrayList;
import java.util.Scanner;

import StudentInformation.vo.Student;
import StudentInformation.vo.Subject;
import StudentInformation.vo.StuResult;
import StudentInformation.vo.SubjResult;

public class StudentDao {
		public static ArrayList<Student> inputStu(){
			ArrayList<Student> listStu = new ArrayList<Student>();
		
			Scanner scan = new Scanner(System.in);
			System.out.println("������ѧ��������Ϣ��");
			String data="";
			while(!(data = scan.nextLine()).equals("end")){
				String array[] = data.split(",|��");
				Student student = new Student(array[0],array[1],array[2]);
				listStu.add(student);
			}
			return listStu;
		}
		
		public static ArrayList<Subject> inputSubj(){
			ArrayList<Subject> listSubj = new ArrayList<Subject>();
			
			Scanner scan = new Scanner(System.in);
			System.out.println("������ѧ���ɼ���");
			String data="";
			while(!(data = scan.nextLine()).equals("end")){
				String array[] = data.split(",|��");
				float score = Float.parseFloat(array[2]);
				Subject subject = new Subject(array[0],array[1],score);
				listSubj.add(subject);
			}
			return listSubj;		
		}
		
		public static ArrayList<StuResult> stuAverage(ArrayList<Subject> listSubj){
			ArrayList<StuResult> stuListResult = new ArrayList<StuResult>();
			
			for(int i=0; i<listSubj.size();i++) {
				Subject subj = listSubj.get(i);
				String subjId = subj.getStuId();
				float score = subj.getScore();
				
				int index = isId(stuListResult,subjId);
				int count = 0;
				if(index!=-1) {
					count++;
					StuResult oldResult = stuListResult.get(index);
					oldResult.setStuAverage((oldResult.getStuAverage()+score)/count);
					stuListResult.set(index, oldResult);
				}else {
					StuResult result = new StuResult(score);
					stuListResult.add(result);
				}
			}
			return stuListResult;
		}
		
		public static ArrayList<SubjResult> subjAverage(ArrayList<Subject> listSubj){
			ArrayList<SubjResult> subjListResult = new ArrayList<SubjResult>();
			
			for(int i=0; i<listSubj.size();i++) {
				Subject subj = listSubj.get(i);
				String subjName = subj.getSubjName();
				float score = subj.getScore();
				
				int index = isSubjName(subjListResult,subjName);
				int count = 0;
				if(index!=-1) {
					count++;
					SubjResult oldResult = subjListResult.get(index);
					oldResult.setScore((oldResult.getScore()+score)/count);
					subjListResult.set(index, oldResult);
				}else {
					SubjResult result = new SubjResult(score);
					subjListResult.add(result);
				}
			}
			return subjListResult;
		}
		
		public static int isId(ArrayList<StuResult> stuListResult, String id) {
			int index = -1;
			for (int i = 0; i < stuListResult.size(); i++ ) {
				StuResult result = stuListResult.get(i);
				String Id = result.getStuId();
				if(Id.equals(id)) {
					return i;
				}
			}
			return index;
		}
		
		public static int isSubjName(ArrayList<SubjResult> subjListResult, String subjName) {
			int index = -1;
			for (int i = 0; i < subjListResult.size(); i++ ) {
				SubjResult result = subjListResult.get(i);
				String name = result.getSubjName();
				if(name.equals(subjName)) {
					return i;
				}
			}
			return index;
		}
		
		public static void display(ArrayList<StuResult>stuListResult, ArrayList<SubjResult> subjListResult) {
			System.out.println("��ѧ��ͳ�ƣ�");
			System.out.println("ѧ��"+"\t"+"����"+"\t"+"�Ա�"+"\t"+"ƽ����");
			for (StuResult result : stuListResult) {
				System.out.println(result.toString());
			}
			System.out.println("���γ�ͳ�ƣ�");
			System.out.println("�γ�"+"\t"+"ƽ����");
			for (SubjResult result : subjListResult) {
				System.out.println(result.toString());
			}
			
		}

		
		
		
		
		
		
		
		
		
		
		
}
