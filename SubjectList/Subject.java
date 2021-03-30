package SubjectList;

public class Subject {
	private String subId;
	private String subName;

	public Subject() {

	}

	public Subject(String subId, String subName) {
		this.subId = subId;
		this.subName = subName;
	}

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String toString() {
		String info = "";
		info = "课程代码:" + this.subId +"\t" + "课程名称:" + this.subName + "\n";
		return info;
	}

}
