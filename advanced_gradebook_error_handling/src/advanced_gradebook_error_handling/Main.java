package advanced_gradebook_error_handling;

import java.util.Scanner;
import java.util.logging.*;

public class Main {
	
	private static Logger logger = Logger.getLogger("Main");
	
	public static void main(String[] args) {
		double totalGrade = 0;
		double avgGrade = 0;
		
		logger.info("Logger name: " + logger.getName());
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Please enter the number of students in your class: ");
			
			int totalNumberStudents = sc.nextInt();
			
			while (totalNumberStudents <= 0) {
				try {
				System.out.println("Sorry, but you are entered the wrong answer");
				System.out.println("The number of students must be 1 or greater.");
				System.out.println("Please enter the number of students in your class: ");
				totalNumberStudents = sc.nextInt();
				
				if (totalNumberStudents < 0) {
					System.out.println("The number of students needs to be a positive number.");
					}
				}
				catch (Exception e) {
					System.out.println("The number of students needs to be a positive number.");
					sc.next();
				}
			}
			
			String[] firstName = new String[totalNumberStudents];
			String[] lastName = new String[totalNumberStudents];
			int[] grade = new int[totalNumberStudents];
			
			
			for(int i = 0 ; i < totalNumberStudents; i++){ 
				
				int j = i + 1;
				System.out.println("Enter the first name of your " + j + ". student: ");
				firstName[i] = sc.next();
				
				System.out.println("Enter the last name of your " + j + ". student: ");
				lastName[i] = sc.next();
				
				System.out.println("Enter the grade of your " + j + ". student: ");
				grade[i]= sc.nextInt();
				
				while (grade[i] <= 0) {
					try {
						
					System.out.println("Sorry, but you are entered the wrong answer");
					System.out.println("Enter the grade: ");
					grade[i]= sc.nextInt();
					
					if (grade[i] < 0) {
						System.out.println("The student's grade has to be a positive number.");
					}	
					
				}
				catch (Exception e) {
				System.out.println("The number of grade needs to be a positive number.");
				sc.next(); // for not having endless loop
				}
					
			}
				
		}
	
		        for(int i = 0; i < totalNumberStudents; i++) {
		        	
		        	totalGrade = totalGrade + grade[i];
		        	}
		        
		        System.out.println("Number of all students is " + totalNumberStudents);
		        System.out.println("Total grade is: " + totalGrade); 
		    
		        avgGrade = totalGrade / totalNumberStudents;
			
		        System.out.println("Average grade of all students is " + String.format("%.2g%n", avgGrade));
		
		        int minGrade = grade[0];
		        int maxGrade = grade[0];
			
		        for(int i = 1 ; i < grade.length; i++){
				
		        	if (grade[i] < minGrade) {
					minGrade = grade[i];
					}
				
		        	if (grade[i] > maxGrade) {
					maxGrade = grade[i];
					}		
		        
		        }
			
		        System.out.println("Minimal grade of all students is " + minGrade);
		        System.out.println("Maximal grade of all students is " + maxGrade + "\n");
		        }
		
		}
	
				public static Logger getLogger() {
				return logger;
				}

				public static void setLogger(Logger logger) {
				Main.logger = logger;
				}
				
}
