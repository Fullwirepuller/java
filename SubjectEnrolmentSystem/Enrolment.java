package SubjectEnrolmentSystem;

public class Enrolment {
	private Student[] list;
	private Subject subj;
	private int count;

	public Enrolment(int maxSize) {
		list = new Student[maxSize];
		count = 0;
	}

	public Subject getSubj() {
		return subj;
	}

	public void setSubj(Subject subj) {
		this.subj = subj;
	}

	public int indexOf(String id) {
		for (int i = 0; i < list.length && list[i] != null; i++) {
			if (list[i].getId().equals(id))
				return i;
		}
		return -1;
	}

	public boolean add(Student student) {
		if (student == null)
			return false;
		if (list.length <= count)
			return false;
		list[count] = student;
		count++;
		return true;
	}

	public boolean remove(int index) {
		if (index < 0 || index >= count || count==0)
			return false;
		for (int i = index; i < count - 1; i++) {
			list[i] = list[i + 1];
		}
		list[count - 1] = null;
		count--;
		return true;

	}

	public Student get(int index) {
		return list[index];
	}

	public int size() {
		return this.count;
	}

	@Override
	public String toString() {
		String info = "";
		info = "Ñ§ºÅ" + "\t" + "Ãû³Æ" + "\n";
		for (int i = 0; i < list.length && list[i] != null; i++) {
			info += list[i].toString();
		}
		return info;
	}

}
