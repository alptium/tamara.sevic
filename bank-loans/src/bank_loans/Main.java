package bank_loans;

import java.util.ArrayList;
import java.util.Scanner;

import bank_loans.Customer;
import bank_loans.Loan;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to bank!");
		System.out.println("Please enter your details.");
		System.out.println("---------------------------------------------------------");
		
		ArrayList<Customer> listPass = new ArrayList<>();
		
		Loan loan[] = new Loan[4];
		
		loan[1] = new Loan();
		loan[1].setName("Cash_loans");
		loan[1].setLoanAmount(100000);
		loan[1].setRepaymentPeriod(12);
		loan[1].setNominalInterestRate(6.9);
		loan[1].setBankFee(2);
		loan[1].setTotalLoanAmount(103776.84);
		loan[1].setMonthlyAnnuity(8648.07);
		loan[1].setEffectiveInterestRate(12.08);

		loan[2] = new Loan();
		loan[2].setName("Pensioners_loans");
		loan[2].setLoanAmount(200000);
		loan[2].setRepaymentPeriod(60);
		loan[2].setNominalInterestRate(13.95);
		loan[2].setBankFee(2);
		loan[2].setTotalLoanAmount(278864.08);
		loan[2].setMonthlyAnnuity(4648.47);
		loan[2].setEffectiveInterestRate(15.98);
		
		loan[3] = new Loan();
		loan[3].setName("Consumer_loans");
		loan[3].setLoanAmount(100000);
		loan[3].setRepaymentPeriod(40);
		loan[3].setNominalInterestRate(17);
		loan[3].setBankFee(3);
		loan[3].setTotalLoanAmount(131601.44);
		loan[3].setMonthlyAnnuity(3292.08);
		loan[3].setEffectiveInterestRate(21.15);
		
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
				String maritalStatus = sc.next();
				System.out.println("Are you employed, yes or no?");
				String employementStatus = sc.next();
				System.out.println("How many months you were employed full-time?");
				int employedFullTime = sc.nextInt();
				System.out.println("The total length of service in months:");
				int lengthOfService = sc.nextInt();
				System.out.println("Are you pensioner, yes or no?");
				String pensyonary = sc.next();
				System.out.println("Selected number of loan: \n"
						+ "If you want Cash loans enter number 1; \n"
						+ "If you want Loans Intended for Pensioners enter number 2; \n"
						+ "If you want Consumer loans enter number 3. \n");
				int numberLoans = sc.nextInt();
				boolean IsCreditApproved = false;
				
				Customer customer = new Customer(firstName, lastName, age, salary, maritalStatus, employementStatus, employedFullTime, lengthOfService, pensyonary, numberLoans, IsCreditApproved);

				if (customer.getNumberLoans() == 1) {
					 if (customer.getemployedFullTime() < 6 || customer.getLengthOfService() < 12 || customer.getPensyonary().equalsIgnoreCase("yes") ) {
						 customer.setIsCreditApproved(false);
						 System.out.println("You are not granted a loan.");
						 listPass.add(customer);
					 }else {
						 customer.setIsCreditApproved(true);
						 System.out.println("Approved your loan.");
						 listPass.add(customer);
					 }
					 
				}else if (customer.getNumberLoans() == 2) {
					
					 if (customer.getemployedFullTime() < 6 || customer.getLengthOfService() < 12 || customer.getPensyonary().equalsIgnoreCase("no") ) {
						 customer.setIsCreditApproved(false);
						 System.out.println("You are not granted a loan.");
						 listPass.add(customer);
					 }else {
						 customer.setIsCreditApproved(true);
						 System.out.println("Approved your loan.");
						 listPass.add(customer);
					 }
					 
				 }else if (customer.getNumberLoans() == 3) {
					 
					 if (customer.getemployedFullTime() < 6 || customer.getLengthOfService() < 12 || customer.getPensyonary().equalsIgnoreCase("yes")) {
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
			}else while (!qu.equalsIgnoreCase("yes") && !qu.equalsIgnoreCase("no"))  {
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
				
				if(customer.isIsCreditApproved() == true) {
				System.out.println("");
				System.out.println("Customer " + customerNumber);
				System.out.print("First name: " + customer.getFirstName());
				System.out.print(" Last name: " + customer.getLastName());
				System.out.print(" Age: " + customer.getAge());
				System.out.print(" Salary: " + customer.getSalary());
				System.out.println(" Marital status: " + customer.getMaritalStatus());
				System.out.print(" Employement status: " + customer.getEmployementStatus());
				System.out.print(" Months of employment full-time: " + customer.getemployedFullTime());
				System.out.print(" Total length of service in months: " + customer.getLengthOfService());
				System.out.print(" Pensioner: " + customer.getPensyonary());
				System.out.println(" Loan characteristics: " + loan[customer.getNumberLoans()].getName());
				System.out.print(" Repayment period: " + loan[customer.getNumberLoans()].getRepaymentPeriod());
				System.out.print(" Loan amount: " + loan[customer.getNumberLoans()].getLoanAmount());
				System.out.print(" Nominal interest rate: " + loan[customer.getNumberLoans()].getNominalInterestRate());
				System.out.print(" Bank fee: " + loan[customer.getNumberLoans()].getBankFee());
				System.out.print(" Total loan amount: " + loan[customer.getNumberLoans()].getTotalLoanAmount());
				System.out.print(" Monthly annuity: " + loan[customer.getNumberLoans()].getMonthlyAnnuity());
				System.out.print(" Effectivr interest rate: " + loan[customer.getNumberLoans()].getEffectiveInterestRate());
				System.out.println("");
				System.out.println("---------------------------------------------------------");
				customerNumber++;
				}

			}
			
			System.out.println("Customers who have not been granted loan:");

			double customerN = 1;

			for (Customer customer : listPass) {
				
				if(customer.isIsCreditApproved() == false) {
				System.out.println("");
				System.out.println("Customer " + customerN);
				System.out.print("First name: " + customer.getFirstName());
				System.out.print(" Last name: " + customer.getLastName());
				System.out.print(" Age: " + customer.getAge());
				System.out.print(" Salary: " + customer.getSalary());
				System.out.println(" Marital status: " + customer.getMaritalStatus());
				System.out.print(" Employement status: " + customer.getEmployementStatus());
				System.out.print(" Months of employment full-time: " + customer.getemployedFullTime());
				System.out.print(" Total length of service in months: " + customer.getLengthOfService());
				System.out.print(" Pensioner: " + customer.getPensyonary());
				System.out.println(" Loan characteristics: " + loan[customer.getNumberLoans()].getName());
				System.out.print(" Repayment period: " + loan[customer.getNumberLoans()].getRepaymentPeriod());
				System.out.print(" Loan amount: " + loan[customer.getNumberLoans()].getLoanAmount());
				System.out.print(" Nominal interest rate: " + loan[customer.getNumberLoans()].getNominalInterestRate());
				System.out.print(" Bank fee: " + loan[customer.getNumberLoans()].getBankFee());
				System.out.print(" Total loan amount: " + loan[customer.getNumberLoans()].getTotalLoanAmount());
				System.out.print(" Monthly annuity: " + loan[customer.getNumberLoans()].getMonthlyAnnuity());
				System.out.print(" Effectivr interest rate: " + loan[customer.getNumberLoans()].getEffectiveInterestRate());
				System.out.println("");
				System.out.println("---------------------------------------------------------");
				customerN++;
				}

			}
			
			double totalNumber = 0;
			totalNumber = customerNumber + customerN-2;
			
			double percentageOfAccepted = ((customerNumber-1)/totalNumber)*100;
			double percentageOfDropped =  ((customerN-1)/totalNumber)*100;
			double Salary = 0;
			double averageSalary = 0;
			
			for (Customer customer : listPass) {
				Salary = Salary + customer.getSalary();
			}
			
			averageSalary = Salary/totalNumber;
			
			int maritalNumber = 0;
			for (Customer customer : listPass) {
				
				if(customer.getMaritalStatus().equalsIgnoreCase("yes")) {
					maritalNumber++;
				}
				
			}
			
			double percentageOfMarried = (maritalNumber/totalNumber)*100;
			double percentageOfNotMarried = (1-(maritalNumber/totalNumber))*100;
			int numberOfEmployess = 0;
			
			for (Customer customer : listPass) {
				
				if(customer.getEmployementStatus().equalsIgnoreCase("yes")) {
					numberOfEmployess++;
				}
				
			}
			
			double nou = (totalNumber - numberOfEmployess);
			double percentEmployess = (numberOfEmployess/totalNumber)*100;
			double pnou = 100 - percentEmployess;
			
				System.out.println("Total number of customers is: " + totalNumber);
				System.out.print(" The percentage of accepted customers is: " + percentageOfAccepted);
				System.out.print(" The percentage of dropped customers is: " + percentageOfDropped);
				System.out.println(" Salary wage: " + averageSalary);
				System.out.print(percentageOfMarried + "% is married, " + percentageOfNotMarried + "% is not married.");
				System.out.print(" The number of employess is: " + numberOfEmployess + " and the number of unemployed is: " + nou);
				System.out.print(" The percentage of employees is: " + percentEmployess + " and the percentage of the unemployed is" + pnou);
				
			} catch (Exception e) {
				System.out.println("ERROR!!!!!!!!!!!!!!");
				System.out.println(e.toString());
		}
		
	}

}

