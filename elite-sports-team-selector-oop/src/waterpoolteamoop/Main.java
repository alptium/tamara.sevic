package waterpoolteamoop;

import java.util.ArrayList;
import java.util.Scanner;

import waterpoolteamoop.Player;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Waterpool team!");
		System.out.println("We're looking for new players.");
		System.out.println("Please enter your details.");
		System.out.println("---------------------------------------------------------");
		ArrayList<Player> listPass = new ArrayList<>();
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
				String Highschool = sc.next();
				System.out.println("Enter your Body height");
				double bodyheight = sc.nextDouble();
				System.out.println("Enter your Body Macs Index");
				double BMI = sc.nextDouble();
				System.out.println("Enter your time of swimming at 20m");
				double SWS20m = sc.nextDouble();
				System.out.println("Enter your shoot speed");
				double SHOOT = sc.nextDouble();
				
				Player player = new Player(firstName, lastName, sex, age, Highschool, bodyheight, BMI, SWS20m, SHOOT);
				
				if(sex.equalsIgnoreCase("M")) {
					if (bodyheight < 175 || BMI > 35 || SWS20m > 12 || SHOOT < 65) {
					System.out.println("Sorry, but you are rejected");
				} else {
					System.out.println("Congratulations you are accepted");
					listPass.add(player);
					}
				}
				
				if(sex.equalsIgnoreCase("F")) {
					if (bodyheight < 165 || BMI > 30 || SWS20m > 17 || SHOOT < 55) {
					System.out.println("Sorry, but you are rejected");
				} else {
					System.out.println("Congratulations you are accepted");
					listPass.add(player);
					}
				}
					System.out.println("Are there new candidates, yes or no?");
					String qu = sc.next();
					if (qu.equalsIgnoreCase("no")) {
					break;
				}
				else while (!qu.equalsIgnoreCase("yes") && !qu.equalsIgnoreCase("no"))  {
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

				for (Player player : listPass) {

					System.out.println("");
					System.out.println("Candidate " + candidateNumber);
					System.out.print("First name: " + player.getFirstName());
					System.out.print(" Last name: " + player.getLastName());
					System.out.println(" Sex: " + player.getSex());
					System.out.print(" Age: " + player.getAge());
					System.out.print(" Highschool: " + player.getHighschool());
					System.out.print(" Body height: " + player.getBodyheight());
					System.out.print(" BMI: " + player.getBMI());
					System.out.print(" SWS20m: " + player.getSWS20m());
					System.out.print(" Shoot: " + player.getSHOOT());
					System.out.println("");
					System.out.println("---------------------------------------------------------");
					candidateNumber++;

					}

				} catch (Exception e) {
					System.out.println("ERROR!!!!!!!!!!!!!!");
					System.out.println(e.toString());
			}
	}

}
