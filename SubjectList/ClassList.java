package SubjectList;

public class ClassList {
	private int semester;
	private int year;
	Subject subj;
	Student s1;
	Student s2;

	public ClassList() {

	}

	public ClassList(int semester, int year, Subject subj, Student s1, Student s2) {
		super();
		this.semester = semester;
		this.year = year;
		this.subj = subj;
		this.s1 = s1;
		this.s2 = s2;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		String info = "";
		info += this.year + "学年" + this.semester + "学期" + "\n";
		info += this.subj.toString();
		info += "学号" + "\t" + "姓名" + "\n";
		info += "===============\n";
		info += this.s1.toString() + "\n" + this.s2.toString();
		return info;
	}

}
