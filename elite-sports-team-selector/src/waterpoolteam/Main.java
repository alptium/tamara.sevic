package waterpoolteam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Pass> listPass = new ArrayList<>();

	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("Welcome to Waterpool team!");
		System.out.println("We're looking for new players.");
		System.out.println("Please enter your details.");
		System.out.println("---------------------------------------------------------");
		try (Scanner sc = new Scanner(System.in);) {

			while (true) {
				Player players = new Player();

				players = new Player();
				System.out.println("Enter your first name");
				players.firstName = sc.next();
				System.out.println("Enter your last name");
				players.lastName = sc.next();
				System.out.println("Sex (M/F)?");
				players.sex=sc.next();
				System.out.println("Enter your age");
				players.age = sc.nextInt();
				System.out.println("Enter your highschool");
				players.Highschool = sc.next();
				System.out.println("Enter your Body height");
				players.bodyheight = sc.nextDouble();
				System.out.println("Enter your Body Macs Index");
				players.BMI = sc.nextDouble();
				System.out.println("Enter your time of swimming at 20m");
				players.SWS20m = sc.nextDouble();
				System.out.println("Enter your shoot speed");
				players.SHOOT = sc.nextDouble();
				
				if(players.sex.equalsIgnoreCase("M")) {
				if (players.bodyheight < 175) {
					System.out.println("Sorry, but you are rejected");
				} else if (players.BMI > 35) {
					System.out.println("Sorry, but you are rejected");
				} else if (players.SWS20m > 12) {
					System.out.println("Sorry, but you are rejected");
				} else if (players.SHOOT < 65) {
					System.out.println("Sorry, but you are rejected");
				} else {
					System.out.println("Congratulations you are accepted");
					Pass p = new Pass();

					p.firstName = players.firstName;
					p.lastName = players.lastName;
					p.sex=players.sex;
					p.age = players.age;
					p.Highschool = players.Highschool;
					p.bodyheight = players.bodyheight;
					p.BMI = players.BMI;
					p.SWS20m = players.SWS20m;
					p.SHOOT = players.SHOOT;

					listPass.add(p);

				}
				}
				
					if(players.sex.equalsIgnoreCase("F")) {
					if (players.bodyheight < 165) {
						System.out.println("Sorry, but you are rejected");
					} else if (players.BMI > 30) {
						System.out.println("Sorry, but you are rejected");
					} else if (players.SWS20m > 17) {
						System.out.println("Sorry, but you are rejected");
					} else if (players.SHOOT < 55) {
						System.out.println("Sorry, but you are rejected");
					} else {
						System.out.println("Congratulations you are accepted");
						Pass p = new Pass();

						p.firstName = players.firstName;
						p.lastName = players.lastName;
						p.sex=players.sex;
						p.age = players.age;
						p.Highschool = players.Highschool;
						p.bodyheight = players.bodyheight;
						p.BMI = players.BMI;
						p.SWS20m = players.SWS20m;
						p.SHOOT = players.SHOOT;

						listPass.add(p);

					}
					}

				System.out.println("Are there new candidates, yes or no?");
				String qu = sc.next();
				if (qu.equalsIgnoreCase("no")) {
					break;
				}
			}
			System.out.println("Candidates who have passed:");
			int count = 1;

			for (Pass p : listPass) {

				System.out.println("");
				System.out.println("Candidate " + count);
				System.out.print("First name: " + p.firstName);
				System.out.print(" Last name: " + p.lastName);
				System.out.println(" Sex: " + p.sex);
				System.out.print(" Age: " + p.age);
				System.out.print(" Highschool: " + p.Highschool);
				System.out.print(" Body height: " + p.bodyheight);
				System.out.print(" BMI: " + p.BMI);
				System.out.print(" SWS20m: " + p.SWS20m);
				System.out.print(" Shoot: " + p.SHOOT);
				System.out.println("");
				System.out.println("---------------------------------------------------------");
				count++;

			}

		} catch (Exception e) {
			System.out.println("GRESKA!!!!!!!!!!!!!!");
			System.out.println(e.toString());
		}

	}

}
