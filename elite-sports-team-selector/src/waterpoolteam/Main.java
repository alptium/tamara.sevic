package waterpoolteam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Waterpool team!");
		System.out.println("We're looking for new players.");
		System.out.println("Please enter your details.");
		System.out.println("---------------------------------------------------------");
		
		ArrayList<Player> listPass = new ArrayList<>();
		ArrayList<Player> listNotPass = new ArrayList<>();
		
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				Player player = new Player();
				System.out.println("Enter your first name");
				player.firstName = sc.next();
				System.out.println("Enter your last name");
				player.lastName = sc.next();
				System.out.println("Sex (M/F)?");
				player.sex = sc.next();
				System.out.println("Enter your age");
				player.age = sc.nextInt();
				System.out.println("Enter your highschool");
				player.Highschool = sc.next();
				System.out.println("Enter your Body height");
				player.bodyheight = sc.nextDouble();
				System.out.println("Enter your Body Macs Index");
				player.BMI = sc.nextDouble();
				System.out.println("Enter your time of swimming at 20m");
				player.SWS20m = sc.nextDouble();
				System.out.println("Enter your shoot speed");
				player.SHOOT = sc.nextDouble();
				
				if(player.sex.equalsIgnoreCase("M")) {
					
					if (player.bodyheight < 175 || player.BMI > 35 || player.SWS20m > 12 || player.SHOOT < 65) {
						System.out.println("Sorry, but you are rejected");
						listNotPass.add(player);
					} else {
						System.out.println("Congratulations you are accepted");
						listPass.add(player);
					}
					
				}
				
				if(player.sex.equalsIgnoreCase("F")) {
					
					if (player.bodyheight < 165 || player.BMI > 30 || player.SWS20m > 17 || player.SHOOT < 55) {
						System.out.println("Sorry, but you are rejected");
						listNotPass.add(player);
					} else {
						System.out.println("Congratulations you are accepted");
						listPass.add(player);
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

				for (Player player : listPass) {

					System.out.println("");
					System.out.println("Candidate " + candidateNumber);
					System.out.print("First name: " + player.firstName);
					System.out.print(" Last name: " + player.lastName);
					System.out.println(" Sex: " + player.sex);
					System.out.print(" Age: " + player.age);
					System.out.print(" Highschool: " + player.Highschool);
					System.out.print(" Body height: " + player.bodyheight);
					System.out.print(" BMI: " + player.BMI);
					System.out.print(" SWS20m: " + player.SWS20m);
					System.out.print(" Shoot: " + player.SHOOT);
					System.out.println("");
					System.out.println("---------------------------------------------------------");
					candidateNumber++;

				}
				
				System.out.println("Candidates who have not passed:");
				
				int candidateN = 1;

				for (Player player : listNotPass) {

					System.out.println("");
					System.out.println("Candidate " + candidateN);
					System.out.print("First name: " + player.firstName);
					System.out.print(" Last name: " + player.lastName);
					System.out.println(" Sex: " + player.sex);
					System.out.print(" Age: " + player.age);
					System.out.print(" Highschool: " + player.Highschool);
					System.out.print(" Body height: " + player.bodyheight);
					System.out.print(" BMI: " + player.BMI);
					System.out.print(" SWS20m: " + player.SWS20m);
					System.out.print(" Shoot: " + player.SHOOT);
					System.out.println("");
					System.out.println("---------------------------------------------------------");
					candidateN++;

				}
				
				double totalNumber = 0;
				totalNumber = candidateNumber + candidateN-2;
				int numberOfAccepted = candidateNumber - 1;
				int numberOfRejected = candidateN - 1;
				
				System.out.println("Total number of candidate is: " + totalNumber);
				System.out.print(" The number of candidate who accepted is: " + numberOfAccepted);
				System.out.print(" The number of candidate who rejected is: " + numberOfRejected);

				} catch (Exception e) {
					System.out.println("ERROR!!!!!!!!!!!!!!");
					System.out.println(e.toString());
				}

			}

		}
