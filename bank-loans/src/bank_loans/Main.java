package bank_loans;

import java.util.ArrayList;
import java.util.Scanner;

import bank_loans.Customer;
import bank_loans.Loans;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to bank!");
		System.out.println("Please enter your details.");
		System.out.println("---------------------------------------------------------");
		ArrayList<Customer> listPass = new ArrayList<>();
		
		Loans loans[] = new Loans[4];
		
		loans[1] = new Loans();
		loans[1].name = "Cash_loans";
		loans[1].loan_amount = 100000;
		loans[1].repayment_period = 12;
		loans[1].nominal_interest_rate = 6.9;
		loans[1].bank_fee = 2;
		loans[1].total_loan_amount = 103776.84;
		loans[1].monthly_annuity = 8648.07;
		loans[1].effective_interest_rate = 12.08;

		loans[2] = new Loans();
		loans[2].name = "Pensioners_loans";
		loans[2].loan_amount = 200000;
		loans[2].repayment_period = 60;
		loans[2].nominal_interest_rate = 13.95;
		loans[2].bank_fee = 2;
		loans[2].total_loan_amount = 278864.08;
		loans[2].monthly_annuity = 4648.47;
		loans[2].effective_interest_rate = 15.98;
		
		loans[3] = new Loans();
		loans[3].name = "Consumer_loans";
		loans[3].loan_amount = 100000;
		loans[3].repayment_period = 40;
		loans[3].nominal_interest_rate = 17;
		loans[3].bank_fee = 3;
		loans[3].total_loan_amount = 131601.44;
		loans[3].monthly_annuity = 3292.08;
		loans[3].effective_interest_rate = 21.15;
		try (Scanner sc = new Scanner(System.in)) {
			
			while (true) {
				System.out.println("Enter your first name");
				String firstName = sc.next();
				System.out.println("Enter your last name");
				String lastName = sc.next();
				System.out.println("Enter your age");
				int age = sc.nextInt();
				System.out.println("Enter your salary");
				double salary = sc.nextDouble();
				System.out.println("Are you married, yes or no?");
				String marital_status = sc.next();
				System.out.println("Are you employed, yes or no?");
				String employement_status = sc.next();
				System.out.println("How many months you were employed full-time?");
				int employed_full_time = sc.nextInt();
				System.out.println("The total length of service in months:");
				int length_of_service = sc.nextInt();
				System.out.println("Are you pensioner, yes or no?");
				String pensyonary = sc.next();
				System.out.println("Select number of loans: \n"
						+ "If you want Cash loans enter number 1; \n"
						+ "If you want Loans Intended for Pensioners enter number 2; \n"
						+ "If you want Consumer loans enter number 3. \n");
				int number_loans = sc.nextInt();
				boolean IsCreditApproved = false;
				
				Customer customer = new Customer(firstName, lastName, age, salary, marital_status, employement_status, employed_full_time, length_of_service, pensyonary, number_loans, IsCreditApproved);

				if (customer.getNumber_loans() == 1) {
					 if (customer.getemployed_full_time() < 6 || customer.getLength_of_service() < 12 || customer.getPensyonary().equalsIgnoreCase("yes") ) {
						 customer.setIsCreditApproved(false);
						 System.out.println("You are not granted a loan.");
						 listPass.add(customer);
					 }else {
						 customer.setIsCreditApproved(true);
						 System.out.println("Approved your loan.");
						 listPass.add(customer);
					 }
					 }
				else if (customer.getNumber_loans() == 2) {
					 if (customer.getemployed_full_time() < 6 || customer.getLength_of_service() < 12 || customer.getPensyonary().equalsIgnoreCase("no") ) {
						 customer.setIsCreditApproved(false);
						 System.out.println("You are not granted a loan.");
						 listPass.add(customer);
					 }else {
						 customer.setIsCreditApproved(true);
						 System.out.println("Approved your loan.");
						 listPass.add(customer);
					 }
				 }
				else if (customer.getNumber_loans() == 3) {
					 if (customer.getemployed_full_time() < 6 || customer.getLength_of_service() < 12 || customer.getPensyonary().equalsIgnoreCase("yes")) {
						 customer.setIsCreditApproved(false);
						 System.out.println("You are not granted a loan.");
						 listPass.add(customer);
					 }else {
						 customer.setIsCreditApproved(true);
						 System.out.println("Approved your loan.");
						 listPass.add(customer);
					 }
				 }
				System.out.println("Are there new customers, yes or no?");
				String qu = sc.next();
				if (qu.equalsIgnoreCase("no")) {
				break;
			}
			else while (!qu.equalsIgnoreCase("yes") && !qu.equalsIgnoreCase("no"))  {
				System.out.println("Sorry, but you are entered the wrong answer");
				System.out.println("Are there new customers, yes or no?");
				qu = sc.next();
			}
				if (qu.equalsIgnoreCase("no")) {
					break;
				}
			}
			System.out.println("Customers who have been granted loan:");

			double customerNumber = 1;

			for (Customer customer : listPass) {
				if(customer.isIsCreditApproved()==true) {
				System.out.println("");
				System.out.println("Customer " + customerNumber);
				System.out.print("First name: " + customer.getFirstName());
				System.out.print(" Last name: " + customer.getLastName());
				System.out.print(" Age: " + customer.getAge());
				System.out.print(" Salary: " + customer.getSalary());
				System.out.println(" Marital status: " + customer.getMarital_status());
				System.out.print(" Employement status: " + customer.getEmployement_status());
				System.out.print(" Months of employment full-time: " + customer.getemployed_full_time());
				System.out.print(" Total length of service in months: " + customer.getLength_of_service());
				System.out.print(" Pensioner: " + customer.getPensyonary());
				System.out.println(" Loan characteristics: " + loans[customer.getNumber_loans()].name);
				System.out.print(" Repayment period: " + loans[customer.getNumber_loans()].repayment_period);
				System.out.print(" Loan amount: " + loans[customer.getNumber_loans()].loan_amount);
				System.out.print(" Nominal interest rate: " + loans[customer.getNumber_loans()].nominal_interest_rate);
				System.out.print(" Bank fee: " + loans[customer.getNumber_loans()].bank_fee);
				System.out.print(" Total loan amount: " + loans[customer.getNumber_loans()].total_loan_amount);
				System.out.print(" Monthly annuity: " + loans[customer.getNumber_loans()].monthly_annuity);
				System.out.print(" Effectivr interest rate: " + loans[customer.getNumber_loans()].effective_interest_rate);
				System.out.println("");
				System.out.println("---------------------------------------------------------");
				customerNumber++;
				}

				}
			
			System.out.println("Customers who have not been granted loan:");

			double customerN = 1;

			for (Customer customer : listPass) {
				if(customer.isIsCreditApproved()==false) {
				System.out.println("");
				System.out.println("Customer " + customerN);
				System.out.print("First name: " + customer.getFirstName());
				System.out.print(" Last name: " + customer.getLastName());
				System.out.print(" Age: " + customer.getAge());
				System.out.print(" Salary: " + customer.getSalary());
				System.out.println(" Marital status: " + customer.getMarital_status());
				System.out.print(" Employement status: " + customer.getEmployement_status());
				System.out.print(" Months of employment full-time: " + customer.getemployed_full_time());
				System.out.print(" Total length of service in months: " + customer.getLength_of_service());
				System.out.print(" Pensioner: " + customer.getPensyonary());
				System.out.println(" Loan characteristics: " + loans[customer.getNumber_loans()].name);
				System.out.print(" Repayment period: " + loans[customer.getNumber_loans()].repayment_period);
				System.out.print(" Loan amount: " + loans[customer.getNumber_loans()].loan_amount);
				System.out.print(" Nominal interest rate: " + loans[customer.getNumber_loans()].nominal_interest_rate);
				System.out.print(" Bank fee: " + loans[customer.getNumber_loans()].bank_fee);
				System.out.print(" Total loan amount: " + loans[customer.getNumber_loans()].total_loan_amount);
				System.out.print(" Monthly annuity: " + loans[customer.getNumber_loans()].monthly_annuity);
				System.out.print(" Effectivr interest rate: " + loans[customer.getNumber_loans()].effective_interest_rate);
				System.out.println("");
				System.out.println("---------------------------------------------------------");
				customerN++;
				}

				}
			double total_number = 0;
			total_number = customerNumber + customerN-2;
			
			double pac = ((customerNumber-1)/total_number)*100;
			double pdc =  ((customerN-1)/total_number)*100;
			double Salary = 0;
			double average_Salary = 0;
			for (Customer customer : listPass) {
				Salary = Salary + customer.getSalary();
			}
			average_Salary = Salary/total_number;
			
			int marital_Number = 0;
			for (Customer customer : listPass) {
				if(customer.getMarital_status().equalsIgnoreCase("yes")) {
					marital_Number++;
				}
			}
			double pmn = (marital_Number/total_number)*100;
			double dmn = (1-(marital_Number/total_number))*100;
			int number_of_employess = 0;
			for (Customer customer : listPass) {
				if(customer.getEmployement_status().equalsIgnoreCase("yes")) {
					number_of_employess++;
				}
			}
			double nou = (total_number - number_of_employess);
			double percent_employess = (number_of_employess/total_number)*100;
			double pnou = 100 - percent_employess;
			
				System.out.println("Total number of customers is: " + total_number);
				System.out.print(" The percentage of accepted customers is: " + pac);
				System.out.print(" The percentage of dropped customers is: " + pdc);
				System.out.println(" Salary wage: " + average_Salary);
				System.out.print(pmn + "% is married, " + dmn + "% is not married.");
				System.out.print(" The number of employess is: " + number_of_employess + " and the number of unemployed is: " + nou);
				System.out.print(" The percentage of employees is: " + percent_employess + " and the percentage of the unemployed is" + pnou);
				
			} catch (Exception e) {
				System.out.println("ERROR!!!!!!!!!!!!!!");
				System.out.println(e.toString());
		}
	}

}

