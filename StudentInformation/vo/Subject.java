package StudentInformation.vo;

public class Subject extends Student{
	private String subjName;
	private float score;
	
	public Subject() {
		super();
	}

	public Subject(String id, String subjName, float score) {
		super.setId(id);
		this.subjName = subjName;
		this.score = score;
	}

	public String getSubjName() {
		return subjName;
	}

	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return subjName ;
	}
	
}
