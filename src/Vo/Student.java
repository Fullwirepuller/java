package Vo;

public class Student {
		private String sno;
		private String name;
		private String gender;
		private String birth;
		private float score;
		public Student() {
			super();
		}
		public Student(String sno, String name, String gender, String birth, float score) {
			super();
			this.sno = sno;
			this.name = name;
			this.gender = gender;
			this.birth = birth;
			this.score = score;
		}
		public String getSno() {
			return sno;
		}
		public void setSno(String sno) {
			this.sno = sno;
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
		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public float getScore() {
			return score;
		}
		public void setScore(float score) {
			this.score = score;
		}
		@Override
		public String toString() {
			return "Student [sno=" + sno + ", name=" + name + ", gender=" + gender + ", birth=" + birth + ", score="
					+ score + "]";
		}
		
}
