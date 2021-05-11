package StudentInformation;

import java.util.ArrayList;

import StudentInformation.Dao.StudentDao;
import StudentInformation.vo.StuResult;
import StudentInformation.vo.Student;
import StudentInformation.vo.SubjResult;
import StudentInformation.vo.Subject;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> listStu = StudentDao.inputStu();
		ArrayList<Subject> listSubj = StudentDao.inputSubj();
		ArrayList<StuResult> stuListResult = StudentDao.stuAverage(listSubj);
		ArrayList<SubjResult> subjListResult = StudentDao.subjAverage(listSubj);
		StudentDao.display(stuListResult,subjListResult);
	}
	
}
