package StudentInformation.vo;

public class Student {
	private String stuId;
	private String name;
	private String gender;
	
	public Student() {
		super();
	}

	public Student(String id, String name, String gender) {
		super();
		this.stuId = id;
		this.name = name;
		this.gender = gender;
	}

	public String getStuId() {
		return stuId;
	}

	public void setId(String id) {
		this.stuId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return stuId + ", " + name + ", " + gender ;
	}
	
	
}
