package SubjectEnrolmentSystem;

public class Subject {
	private String subjId;
	private String subjName;
	private int subjNum;
	
	public Subject(String subjId, String subjName, int subjNum) {
		super();
		this.subjId = subjId;
		this.subjName = subjName;
		this.subjNum = subjNum;
	}

	public String getSubjId() {
		return subjId;
	}

	public void setSubjId(String subjId) {
		this.subjId = subjId;
	}

	public String getSubjName() {
		return subjName;
	}

	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}

	public int getSubjNum() {
		return subjNum;
	}

	public void setSubjNum(int subjNum) {
		this.subjNum = subjNum;
	}

	@Override
	public String toString() {
		String info = "";
		info += "课程号："+this.subjId+"\t"+"课程名称："+this.subjName+
				"\t"+"课程最大人数："+this.subjNum;
		return info;
	}
	
}
