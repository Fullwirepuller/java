package StudentInformation.Dao;

import java.util.ArrayList;
import java.util.Scanner;

import StudentInformation.vo.Student;
import StudentInformation.vo.Subject;
import StudentInformation.vo.StuResult;
import StudentInformation.vo.SubjResult;

public class StudentDao {
	public static ArrayList<Student> inputStu() {
		ArrayList<Student> listStu = new ArrayList<Student>();

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生基本信息：");
		String data = "";
		while (!(data = scan.nextLine()).equals("end")) {
			String array[] = data.split(",|，");
			Student student = new Student(array[0], array[1], array[2]);
			listStu.add(student);
		}
		return listStu;
	}

	public static ArrayList<Subject> inputSubj() {
		ArrayList<Subject> listSubj = new ArrayList<Subject>();

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		String data = "";
		while (!(data = scan.nextLine()).equals("end")) {
			String array[] = data.split(",|，");
			float score = Float.parseFloat(array[2]);
			Subject subject = new Subject(array[0], array[1], score);
			listSubj.add(subject);
		}
		return listSubj;
	}

	public static ArrayList<StuResult> stuAverage(ArrayList<Student> listStu, ArrayList<Subject> listSubj) {
		ArrayList<StuResult> stuListResult = new ArrayList<StuResult>();

		for (int i = 0; i < listSubj.size(); i++) {
			Subject subj = listSubj.get(i);
			String subjId = subj.getId();
			float score = subj.getScore();

			String StuId = "";
			String name = "";
			String gender = "";

			for (int j = 0; j < listStu.size(); j++) {
				Student stu = listStu.get(j);
				StuId = stu.getStuId();
				if (subjId.equals(StuId)) {
					name = stu.getName();
					gender = stu.getGender();
				}
			}
			int index = isId(stuListResult, subjId);
			if (index != -1) {
				StuResult oldResult = stuListResult.get(index);
				oldResult.setCount((oldResult.getCount())+1);
				oldResult.setStuAverage(oldResult.getStuAverage() + (score - oldResult.getStuAverage()) / oldResult.getCount());
				stuListResult.set(index, oldResult);
			} else {
				StuResult result = new StuResult(subjId, name, gender, score, 1);
				stuListResult.add(result);
			}
		}
		return stuListResult;
	}

	public static ArrayList<SubjResult> subjAverage(ArrayList<Subject> listSubj) {
		ArrayList<SubjResult> subjListResult = new ArrayList<SubjResult>();
		
		for (int i = 0; i < listSubj.size(); i++) {
			Subject subj = listSubj.get(i);
			String subjName = subj.getSubjName();
			float score = subj.getScore();

			int index = isSubjName(subjListResult, subjName);
			if (index != -1) {
				SubjResult oldResult = subjListResult.get(index);
				oldResult.setCount(oldResult.getCount()+1);
				oldResult.setSubjAverage(oldResult.getSubjAverage() + (score - oldResult.getSubjAverage()) / oldResult.getCount());;
				subjListResult.set(index, oldResult);
			} else {
				SubjResult result = new SubjResult(subjName, score, 1);
				subjListResult.add(result);
			}
		}
		return subjListResult;
	}

	public static int isId(ArrayList<StuResult> stuListResult, String id) {
		int index = -1;
		for (int i = 0; i < stuListResult.size(); i++) {
			StuResult result = stuListResult.get(i);
			String Id = result.getStuId();
			if (Id.equals(id)) {
				return i;
			}
		}
		return index;
	}

	public static int isSubjName(ArrayList<SubjResult> subjListResult, String subjName) {
		int index = -1;
		for (int i = 0; i < subjListResult.size(); i++) {
			SubjResult result = subjListResult.get(i);
			String name = result.getSubjName();
			if (name.equals(subjName)) {
				return i;
			}
		}
		return index;
	}

	public static void display(ArrayList<StuResult> stuListResult, ArrayList<SubjResult> subjListResult) {
		System.out.println("按学生统计：");
		System.out.println("学号" + "\t" + "姓名" + "\t" + "性别" + "\t" + "平均分");
		for (StuResult result : stuListResult) {
			System.out.println(result.toString());
		}
		System.out.println("按课程统计：");
		System.out.println("课程" + "\t" + "平均分");
		for (SubjResult result : subjListResult) {
			System.out.println(result.toString());
		}

	}

}
