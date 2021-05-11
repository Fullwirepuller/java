package StudentInformation.vo;

public class SubjResult extends Subject{
	private float subjAverage;
	private int count;

	public SubjResult() {
		super();
	}

	public SubjResult(String subjName,float subjAverage, int count) {
		super.setSubjName(subjName);
		this.subjAverage = subjAverage;
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getSubjAverage() {
		return subjAverage;
	}

	public void setSubjAverage(float subjAverage) {
		this.subjAverage = subjAverage;
	}

	@Override
	public String toString() {
		return super.toString()+this.subjAverage;
	}
	
}
