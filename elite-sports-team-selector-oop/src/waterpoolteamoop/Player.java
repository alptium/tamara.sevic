package waterpoolteamoop;

public class Player {
	private String firstName;
	private String lastName;
	private String sex;
	private int age;
	private String Highschool;
	private double bodyheight;
	private double BMI;
	private double SWS20m;
	private double SHOOT;
	
	public Player(String firstName, String lastName, String sex, int age, String Highschool, double bodyheight, double BMI, double SWS20m, double SHOOT) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
		this.Highschool = Highschool;
		this.bodyheight = bodyheight;
		this.BMI = BMI;
		this.SWS20m = SWS20m;
		this.SHOOT = SHOOT;
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
	public String getHighschool() {
		return Highschool;
	}
	public void setHighschool(String highschool) {
		Highschool = highschool;
	}
	public double getBodyheight() {
		return bodyheight;
	}
	public void setBodyheight(double bodyheight) {
		this.bodyheight = bodyheight;
	}
	public double getBMI() {
		return BMI;
	}
	public void setBMI(double bMI) {
		BMI = bMI;
	}
	public double getSWS20m() {
		return SWS20m;
	}
	public void setSWS20m(double sWS20m) {
		SWS20m = sWS20m;
	}
	public double getSHOOT() {
		return SHOOT;
	}
	public void setSHOOT(double sHOOT) {
		SHOOT = sHOOT;
	}
}
