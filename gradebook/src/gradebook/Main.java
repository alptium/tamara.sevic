package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Scanner sc= new Scanner(System.in);
				Student student[] = new Student[5];

				student[0] = new Student();
				System.out.println("Enter the first name of 1. student");
		        student[0].firstname = sc.next();
		        System.out.println("Enter the last name of 1. student");
		        student[0].lastname = sc.next();
		        System.out.println("Enter the grade of 1. student");
		        student[0].grade = sc.nextDouble();
		        
		        student[1] = new Student();
				System.out.println("Enter the first name of 2. student");
		        student[1].firstname = sc.next();
		        System.out.println("Enter the last name of 2. student");
		        student[1].lastname = sc.next();
		        System.out.println("Enter the grade of 2. student");
		        student[1].grade = sc.nextDouble();
		        
		        student[2] = new Student();
				System.out.println("Enter the first name of 3. student");
		        student[2].firstname = sc.next();
		        System.out.println("Enter the last name of 3. student");
		        student[2].lastname = sc.next();
		        System.out.println("Enter the grade of 3. student");
		        student[2].grade = sc.nextDouble();
		        
		        student[3] = new Student();
				System.out.println("Enter the first name of 4. student");
		        student[3].firstname = sc.next();
		        System.out.println("Enter the last name of 4. student");
		        student[3].lastname = sc.next();
		        System.out.println("Enter the grade of 4. student");
		        student[3].grade = sc.nextDouble();
		        
		        student[4] = new Student();
				System.out.println("Enter the first name of 5. student");
		        student[4].firstname = sc.next();
		        System.out.println("Enter the last name of 5. student");
		        student[4].lastname = sc.next();
		        System.out.println("Enter the grade of 5. student");
		        student[4].grade = sc.nextDouble();
		        
		        double totalgrade = 0;
		        for(int i = 0; i < student.length; i++)
		        {
		        	totalgrade = (double) (totalgrade + student[i].grade);
		        }
		        System.out.println("Total grade is: " + totalgrade);
		    
			}

		}
		class Student {
			public String firstname;
			public String lastname;
			public double grade;
		}
