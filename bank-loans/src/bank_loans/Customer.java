package bank_loans;

public class Customer {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private String marital_status;
	private String employement_status;
	private int employed_full_time;
	private int length_of_service;
	private String pensyonary;
	private int number_loans;
	private boolean IsCreditApproved;
	
	public Customer(String firstName, String lastName, int age, double salary, String marital_status, String employement_status, int employed_full_time, int length_of_service, String pensyonary, int number_loans, boolean IsCreditApproved) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.marital_status = marital_status;
		this.employement_status = employement_status;
		this.employed_full_time = employed_full_time;
		this.length_of_service = length_of_service;
		this.pensyonary = pensyonary;
		this.number_loans = number_loans;
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
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getEmployement_status() {
		return employement_status;
	}
	public void setEmployement_status(String employement_status) {
		this.employement_status = employement_status;
	}
	public int getLength_of_service() {
		return length_of_service;
	}
	public void setLength_of_service(int length_of_service) {
		this.length_of_service = length_of_service;
	}
	public String getPensyonary() {
		return pensyonary;
	}
	public void setPensyonary(String pensyonary) {
		this.pensyonary = pensyonary;
	}
	public int getemployed_full_time() {
		return employed_full_time;
	}
	public void setemployed_full_time(int employed_full_time) {
		this.employed_full_time = employed_full_time;
	}
	public int getNumber_loans() {
		return number_loans;
	}
	public void setNumber_loans(int number_loans) {
		this.number_loans = number_loans;
	}
	public boolean isIsCreditApproved() {
		return IsCreditApproved;
	}
	public void setIsCreditApproved(boolean isCreditApproved) {
		IsCreditApproved = isCreditApproved;
	}

}
