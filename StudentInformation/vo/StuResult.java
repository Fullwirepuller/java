package StudentInformation.vo;

public class StuResult extends Student{
	private float StuAverage;

	public StuResult() {
		super();
	}

	public StuResult(float stuAverage) {
		StuAverage = stuAverage;
	}

	public float getStuAverage() {
		return StuAverage;
	}

	public void setStuAverage(float stuAverage) {
		StuAverage = stuAverage;
	}
	
	public String toString() {
		String info = "";
		info+=super.toString()+this.StuAverage;
		return info;
	}

}
