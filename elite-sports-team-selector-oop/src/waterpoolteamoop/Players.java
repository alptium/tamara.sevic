package waterpoolteamoop;

public class Players {

		private String firstName;
		private String lastName;
		private String sex;
		private int age;
		private String highSchool;
		private double bodyHeight;
		private double bmi;
		private double sws20m;
		private double shoot;
		
		public Players(String firstName, String lastName, String sex, int age, String highSchool, double bodyHeight, double bmi, double sws20m, double shoot) {
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setSex(sex);
			this.setAge(age);
			this.setHighSchool(highSchool);
			this.setBodyHeight(bodyHeight);
			this.setBmi(bmi);
			this.setSws20m(sws20m);
			this.setShoot(shoot);
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getHighSchool() {
			return highSchool;
		}

		public void setHighSchool(String highSchool) {
			this.highSchool = highSchool;
		}

		public double getBodyHeight() {
			return bodyHeight;
		}

		public void setBodyHeight(double bodyHeight) {
			this.bodyHeight = bodyHeight;
		}

		public double getBmi() {
			return bmi;
		}

		public void setBmi(double bmi) {
			this.bmi = bmi;
		}

		public double getSws20m() {
			return sws20m;
		}

		public void setSws20m(double sws20m) {
			this.sws20m = sws20m;
		}

		public double getShoot() {
			return shoot;
		}

		public void setShoot(double shoot) {
			this.shoot = shoot;
		}

	}
