package bank_loans;

public class Customer {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private String maritalStatus;
	private String employementStatus;
	private int employedFullTime;
	private int lengthOfService;
	private String pensyonary;
	private int numberLoans;
	private boolean IsCreditApproved;
	
	public Customer(String firstName, String lastName, int age, double salary, String maritalStatus, String employementStatus, int employedFullTime, int lengthOfService, String pensyonary, int numberLoans, boolean IsCreditApproved) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.maritalStatus = maritalStatus;
		this.employementStatus = employementStatus;
		this.employedFullTime = employedFullTime;
		this.lengthOfService = lengthOfService;
		this.pensyonary = pensyonary;
		this.numberLoans = numberLoans;
		this.IsCreditApproved = IsCreditApproved;
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
	public void setLastName(String LastName) {
		this.lastName = LastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEmployementStatus() {
		return employementStatus;
	}
	public void setEmployementStatus(String employementStatus) {
		this.employementStatus = employementStatus;
	}
	public int getLengthOfService() {
		return lengthOfService;
	}
	public void setLengthOfService(int lengthOfService) {
		this.lengthOfService = lengthOfService;
	}
	public String getPensyonary() {
		return pensyonary;
	}
	public void setPensyonary(String pensyonary) {
		this.pensyonary = pensyonary;
	}
	public int getemployedFullTime() {
		return employedFullTime;
	}
	public void setemployedFullTime(int employedFullTime) {
		this.employedFullTime = employedFullTime;
	}
	public int getNumberLoans() {
		return numberLoans;
	}
	public void setNumberLoans(int numberLoans) {
		this.numberLoans = numberLoans;
	}
	public boolean isIsCreditApproved() {
		return IsCreditApproved;
	}
	public void setIsCreditApproved(boolean isCreditApproved) {
		IsCreditApproved = isCreditApproved;
	}

}
