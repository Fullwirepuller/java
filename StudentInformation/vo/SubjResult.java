package StudentInformation.vo;

public class SubjResult extends Subject{
	private float subjAverage;

	public SubjResult() {
		super();
	}

	public SubjResult(float subjAverage) {
		this.subjAverage = subjAverage;
	}
	
	public float getSubjAverage() {
		return subjAverage;
	}

	public void setSubjAverage(float subjAverage) {
		this.subjAverage = subjAverage;
	}

	@Override
	public String toString() {
		return super.toString()+subjAverage;
	}
	
}
