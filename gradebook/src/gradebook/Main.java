package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
				
		try(Scanner sc= new Scanner(System.in);) {
					
			class Students {
						public String firstname;
						public String lastname;
						public double grade;
			}
				
				Students students[] = new Students[5];

				students[0] = new Students();
				System.out.println("Enter the first name of 1. student");
		        students[0].firstname = sc.next();
		        System.out.println("Enter the last name of 1. student");
		        students[0].lastname = sc.next();
		        System.out.println("Enter the grade of 1. student");
		        students[0].grade = sc.nextDouble();
		        
		        students[1] = new Students();
				System.out.println("Enter the first name of 2. student");
		        students[1].firstname = sc.next();
		        System.out.println("Enter the last name of 2. student");
		        students[1].lastname = sc.next();
		        System.out.println("Enter the grade of 2. student");
		        students[1].grade = sc.nextDouble();
		        
		        students[2] = new Students();
				System.out.println("Enter the first name of 3. student");
		        students[2].firstname = sc.next();
		        System.out.println("Enter the last name of 3. student");
		        students[2].lastname = sc.next();
		        System.out.println("Enter the grade of 3. student");
		        students[2].grade = sc.nextDouble();
		        
		        students[3] = new Students();
				System.out.println("Enter the first name of 4. student");
		        students[3].firstname = sc.next();
		        System.out.println("Enter the last name of 4. student");
		        students[3].lastname = sc.next();
		        System.out.println("Enter the grade of 4. student");
		        students[3].grade = sc.nextDouble();
		        
		        students[4] = new Students();
				System.out.println("Enter the first name of 5. student");
		        students[4].firstname = sc.next();
		        System.out.println("Enter the last name of 5. student");
		        students[4].lastname = sc.next();
		        System.out.println("Enter the grade of 5. student");
		        students[4].grade = sc.nextDouble();
		        
		        double totalgrade = 0;
		        for(int i = 0; i < students.length; i++)
		        {
		        	totalgrade = (double) (totalgrade + students[i].grade);
		        }
		        System.out.println("Total grade is: " + totalgrade);
		    
		}

	}
		
}