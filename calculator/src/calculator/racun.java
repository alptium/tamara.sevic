package calculator;

import java.util.Scanner;

public class racun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter your first number");
	int firstNumber= sc.nextInt();
	System.out.println("Chooes your operation +, -, *, /");
	String operation =sc.next();
	System.out.println("Enter your seconde number");
	int secondNumber = sc.nextInt();
	
	System.out.println("Now the system is calculating the result...");
	int result=0;
	
	if (operation.equals("+")) {
		result=firstNumber + secondNumber;
	}else if (operation.equals("-")) {
		result=firstNumber - secondNumber;
	}else if (operation.equals("*")) {
		result=firstNumber * secondNumber;
	}else if (operation.equals("/")) {
		result=firstNumber / secondNumber;
	}
	System.out.println("First number is: " + firstNumber);
	System.out.println("Second number is: " + secondNumber);
	System.out.println("The result is: " + result);
}
	}


