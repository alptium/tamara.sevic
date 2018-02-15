package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

				
		try(Scanner sc = new Scanner(System.in);) {
					
			class Student {
						public String firstName;
						public String lastName;
						public double Grade;
			}
				
				Student students[] = new Student[5];

				students[0] = new Student();
				System.out.println("Enter the first name of 1st student");
		        students[0].firstName = sc.next();
		        System.out.println("Enter the last name of 1st student");
		        students[0].lastName = sc.next();
		        System.out.println("Enter the grade of 1st student");
		        students[0].Grade = sc.nextDouble();
		        
		        students[1] = new Student();
				System.out.println("Enter the first name of 2nd student");
		        students[1].firstName = sc.next();
		        System.out.println("Enter the last name of 2nd student");
		        students[1].lastName = sc.next();
		        System.out.println("Enter the grade of 2nd student");
		        students[1].Grade = sc.nextDouble();
		        
		        students[2] = new Student();
				System.out.println("Enter the first name of 3rd student");
		        students[2].firstName = sc.next();
		        System.out.println("Enter the last name of 3rd student");
		        students[2].lastName = sc.next();
		        System.out.println("Enter the grade of 3rd student");
		        students[2].Grade = sc.nextDouble();
		        
		        students[3] = new Student();
				System.out.println("Enter the first name of 4th student");
		        students[3].firstName = sc.next();
		        System.out.println("Enter the last name of 4th student");
		        students[3].lastName = sc.next();
		        System.out.println("Enter the grade of 4th student");
		        students[3].Grade = sc.nextDouble();
		        
		        students[4] = new Student();
				System.out.println("Enter the first name of 5th student");
		        students[4].firstName = sc.next();
		        System.out.println("Enter the last name of 5th student");
		        students[4].lastName = sc.next();
		        System.out.println("Enter the grade of 5th student");
		        students[4].Grade = sc.nextDouble();
		        
		        double totalGrade = 0;
		        for(int i = 0; i < students.length; i++)
		        {
		        	totalGrade = totalGrade + students[i].Grade;
		        }
		        System.out.println("Total grade is: " + totalgrade);
		    
		}

	}
		
}