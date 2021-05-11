package StudentInformation.vo;

public class StuResult extends Student{
	private float StuAverage;
	private int count;

	public StuResult() {
		super();
	}

	public StuResult(String id, String name, String gender, float stuAverage, int count) {
		super(id, name, gender);
		this.StuAverage = stuAverage;
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
