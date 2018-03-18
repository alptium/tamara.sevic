package waterpoolteamoop;

import java.util.ArrayList;
import java.util.Scanner;
import waterpoolteamoop.Players;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Waterpool team!");
		System.out.println("We're looking for new players.");
		System.out.println("Please enter your details.");
		System.out.println("---------------------------------------------------------");
		
		ArrayList<Players> listPass = new ArrayList<>();
		ArrayList<Players> listNotPass = new ArrayList<>();
		
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				
				System.out.println("Enter your first name");
				String firstName = sc.next();
				System.out.println("Enter your last name");
				String lastName = sc.next();
				System.out.println("Sex (M/F)?");
				String sex = sc.next();
				System.out.println("Enter your age");
				int age = sc.nextInt();
				System.out.println("Enter your highschool");
				String highSchool = sc.next();
				System.out.println("Enter your Body height");
				double bodyHeight = sc.nextDouble();
				System.out.println("Enter your Body Macs Index");
				double bmi = sc.nextDouble();
				System.out.println("Enter your time of swimming at 20m");
				double sws20m = sc.nextDouble();
				System.out.println("Enter your shoot speed");
				double shoot = sc.nextDouble();
				
				Players players = new Players(firstName, lastName, sex, age, highSchool, bodyHeight, bmi, sws20m, shoot);
				
				if(players.getSex().equalsIgnoreCase("M")) {
					
					if (players.getBodyHeight() < 175 || players.getBmi() > 35 || players.getSws20m() > 12 || players.getShoot() < 65) {
					System.out.println("Sorry, but you are rejected");
					listNotPass.add(players);
					} else {
					System.out.println("Congratulations you are accepted");
					listPass.add(players);
					}
					
				}
				
				if(players.getSex().equalsIgnoreCase("F")) {
					
					if (players.getBodyHeight() < 165 || players.getBmi() > 30 || players.getSws20m() > 17 || players.getShoot() < 55) {
					System.out.println("Sorry, but you are rejected");
					listNotPass.add(players);
					} else {
					System.out.println("Congratulations you are accepted");
					listPass.add(players);
					}
					
				}
					System.out.println("Are there new candidates, yes or no?");
					String qu = sc.next();
					
					if (qu.equalsIgnoreCase("no")) {
						break;
					}else while (!qu.equalsIgnoreCase("yes") && !qu.equalsIgnoreCase("no"))  {
						System.out.println("Sorry, but you are entered the wrong answer");
						System.out.println("Are there new candidates, yes or no?");
						qu = sc.next();
				}
					if (qu.equalsIgnoreCase("no")) {
						break;
					}
					
			}
			
				System.out.println("Candidates who have passed:");
			
				int candidateNumber = 1;

				for (Players players : listPass) {

					System.out.println("");
					System.out.println("Candidate " + candidateNumber);
					System.out.print("First name: " + players.getFirstName());
					System.out.print(" Last name: " + players.getLastName());
					System.out.println(" Sex: " + players.getSex());
					System.out.print(" Age: " + players.getAge());
					System.out.print(" Highschool: " + players.getHighSchool());
					System.out.print(" Body height: " + players.getBodyHeight());
					System.out.print(" BMI: " + players.getBmi());
					System.out.print(" SWS20m: " + players.getSws20m());
					System.out.print(" Shoot: " + players.getShoot());
					System.out.println("");
					System.out.println("---------------------------------------------------------");
					candidateNumber++;

				}
				
				System.out.println("Candidates who have not passed:");
				
				int candidateN = 1;

				for (Players players : listNotPass) {

					System.out.println("");
					System.out.println("Candidate " + candidateN);
					System.out.print("First name: " + players.getFirstName());
					System.out.print(" Last name: " + players.getLastName());
					System.out.println(" Sex: " + players.getSex());
					System.out.print(" Age: " + players.getAge());
					System.out.print(" Highschool: " + players.getHighSchool());
					System.out.print(" Body height: " + players.getBodyHeight());
					System.out.print(" BMI: " + players.getBmi());
					System.out.print(" SWS20m: " + players.getSws20m());
					System.out.print(" Shoot: " + players.getShoot());
					System.out.println("");
					System.out.println("---------------------------------------------------------");
					candidateN++;

				}
				
				int numberOfAccepted = listPass.size();
				int numberOfRejected = listNotPass.size();
				int totalNumber = numberOfAccepted + numberOfRejected;
				
				System.out.println("Total number of candidate is: " + totalNumber);
				System.out.print(" The number of candidate who accepted is: " + numberOfAccepted);
				System.out.print(" The number of candidate who rejected is: " + numberOfRejected);

				} catch (Exception e) {
					System.out.println("ERROR!!!!!!!!!!!!!!");
					System.out.println(e.toString());
				}
		
	}

}
