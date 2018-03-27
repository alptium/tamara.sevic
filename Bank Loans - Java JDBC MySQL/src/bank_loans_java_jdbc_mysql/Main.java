package bank_loans_java_jdbc_mysql;

import com.mysql.jdbc.jdbc2.optional.*;

import java.sql.*;
import java.util.Scanner;

public class Main {
	
	private static String username = "root";
	private static String password = "lepabrena";
	private static String serverName = "localhost";
	private static int portNo = 3306;
	private static String dbName = "bank"; 
	
	public static Connection getConnection()  {
		
				Connection conn = null;
				MysqlDataSource dataSource = new MysqlDataSource();
				
				//1. Get a connection to database
				
				dataSource.setUser(username);
				dataSource.setPassword(password);
				dataSource.setServerName(serverName);
				dataSource.setPortNumber(portNo);
				dataSource.setDatabaseName(dbName);
				
				try {
					
					conn = dataSource.getConnection();
					Statement stmt = conn.createStatement();
				    String sq = "TRUNCATE bank.customer";
				    stmt.executeUpdate(sq);
					sq = "DELETE FROM bank.customer";
				    stmt.executeUpdate(sq);
					if (conn != null) {
						System.out.println("Connection successful");
					}
					
				} catch (SQLException e) {
					System.out.println("Connection unsuccessful");
					e.printStackTrace();
				}
				return conn;
			}
	
			public static void main(String[] args)  {
				
				Connection conn = getConnection();
				Statement statement = null;
				ResultSet rs = null;
				PreparedStatement preparedStatement = null;
				double count = 0;
				
				try (Scanner sc = new Scanner(System.in)) {
					
					if (conn != null)
						System.out.println("Connection successful");
					
					while (true) {

					    String insertsql = "INSERT INTO customer (firstname, lastname, age, salary, maritalstatus, employementstatus, employedFulltime, lengthofservice, pensyonary, numberloans, iscreditapproved) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					    preparedStatement = conn.prepareStatement(insertsql);
						System.out.println("Enter your first name");
						preparedStatement.setString(1,sc.next());
						System.out.println("Enter your last name");
						preparedStatement.setString(2,sc.next());
						System.out.println("Enter your age");
						preparedStatement.setInt(3, sc.nextInt());
						System.out.println("Enter your salary");
						preparedStatement.setDouble(4, sc.nextDouble());
						System.out.println("Are you married, yes or no?");
						preparedStatement.setString(5,sc.next());
						System.out.println("Are you employed, yes or no?");
						preparedStatement.setString(6,sc.next());
						System.out.println("How many months you were employed full-time?");
						preparedStatement.setInt(7, sc.nextInt());
						System.out.println("The total length of service in months:");
						preparedStatement.setInt(8, sc.nextInt());
						System.out.println("Are you pensioner, yes or no?");
						preparedStatement.setString(9,sc.next());
						System.out.println("Selected number of loan: \n"
								+ "If you want Cash loans enter number 1; \n"
								+ "If you want Loans Intended for Pensioners enter number 2; \n"
								+ "If you want Consumer loans enter number 3. \n");
						preparedStatement.setInt(10, sc.nextInt());
						preparedStatement.setString(11, "no");
						preparedStatement.executeUpdate();
						count ++;
						
						statement = conn.createStatement();
						String sql = "SELECT id, firstname, lastname, age, salary, maritalstatus, employementstatus, employedFulltime, lengthofservice, pensyonary, numberloans, iscreditapproved FROM bank.customer ";
					    rs = statement.executeQuery(sql);
					    
					    while(rs.next()) {
					    	
					    if (rs.getInt(1) == count) {
					    	
						if (rs.getInt(11) == 1) {
							
							 if (rs.getInt(8) < 6 || rs.getInt(9) < 12 || rs.getString(10).equalsIgnoreCase("yes") ) {
								 System.out.println("You are not granted a loan.");
							 }else {
								 String s = "UPDATE customer SET iscreditapproved = ?";
								 PreparedStatement preparedStmt = conn.prepareStatement(s);
								 preparedStmt.setString(1, "Yes");
								 preparedStmt.executeUpdate();
								 System.out.println("Approved your loan.");
							 }
							 
						}else if (rs.getInt(11) == 2) {
							
							 if (rs.getInt(8) < 6 || rs.getInt(9) < 12 || rs.getString(10).equalsIgnoreCase("no") ) {
								 System.out.println("You are not granted a loan.");
							 }else {
								 String s = "UPDATE customer SET iscreditapproved = ?";
								 PreparedStatement preparedStmt = conn.prepareStatement(s);
								 preparedStmt.setString(1, "Yes");
								 preparedStmt.executeUpdate();
								 System.out.println("Approved your loan.");
							 }
							 
						 }else if (rs.getInt(11) == 3) {
							 
							 if (rs.getInt(8) < 6 || rs.getInt(9) < 12 || rs.getString(10).equalsIgnoreCase("yes")) {
								 System.out.println("You are not granted a loan.");
							 }else {
								 String s = "UPDATE customer SET iscreditapproved = ?";
								 PreparedStatement preparedStmt = conn.prepareStatement(s);
								 preparedStmt.setString(1, "Yes");
								 preparedStmt.executeUpdate();
								 System.out.println("Approved your loan.");
							 }
							 
						 }
						
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
					double nunmberOfAccepted = 0;
					double salary = 0;
					double maritalNumber = 0;
					double numberOfEmployess = 0;
					
					statement = conn.createStatement();
					String sql = "SELECT salary, maritalstatus, employementstatus, numberloans, iscreditapproved FROM bank.customer ";
				    rs = statement.executeQuery(sql);
				    while (rs.next()) {
				    	
				    	salary = salary + rs.getDouble(1);
		                if (rs.getString(5).equalsIgnoreCase("yes")) {
		                	nunmberOfAccepted++;
		                }
		                if (rs.getString(2).equalsIgnoreCase("yes")) {
		                	maritalNumber++;
		                }
		                if (rs.getString(3).equalsIgnoreCase("yes")) {
		                	numberOfEmployess++;
		                }

		            }
				    
					double percentageOfAccepted = ((nunmberOfAccepted)/count)*100;
					double percentageOfDropped =  100 - percentageOfAccepted;
					double averageSalary = salary/count;
					double percentageOfMarried = (maritalNumber/count)*100;
					double percentageOfNotMarried = 100 - percentageOfMarried;
					double percentEmployess = (numberOfEmployess/count)*100;
					double nou = (count - numberOfEmployess);
					double pnou = 100 - percentEmployess;
				    
					System.out.println("Total number of customers is: " + count);
					System.out.print(" The percentage of accepted customers is: " + percentageOfAccepted);
					System.out.print(" The percentage of dropped customers is: " + percentageOfDropped);
					System.out.println(" Salary wage: " + averageSalary);
					System.out.print(percentageOfMarried + "% is married, " + percentageOfNotMarried + "% is not married.");
					System.out.print(" The number of employess is: " + numberOfEmployess + " and the number of unemployed is: " + nou);
					System.out.print(" The percentage of employees is: " + percentEmployess + " and the percentage of the unemployed is" + pnou);
					System.out.println("");
					System.out.println("---------------------------------------------------------");
					
					
				    
					System.out.println("Customers who have been granted loan:");
					int customerNumber = 1;
					int customerN = 1;
					
					String sql5 = "SELECT firstname, lastname, age, salary, maritalstatus, employementstatus, employedFulltime, lengthofservice, pensyonary, numberloans, iscreditapproved  FROM bank.customer";
				    rs = statement.executeQuery(sql5);

				    
					while (rs.next()) {
						
						if(rs.getString(11).equalsIgnoreCase("yes")) {
						System.out.println("");
						System.out.println("Customer " + customerNumber);
						System.out.print("First name: " + rs.getString(1));
						System.out.print(" Last name: " + rs.getString(2));
						System.out.print(" Age: " + rs.getInt(3));
						System.out.print(" Salary: " + rs.getDouble(4));
						System.out.println(" Marital status: " + rs.getString(5));
						System.out.print(" Employement status: " + rs.getString(6));
						System.out.print(" Months of employment full-time: " + rs.getInt(7));
						System.out.print(" Total length of service in months: " + rs.getInt(8));
						System.out.print(" Pensioner: " + rs.getString(9));
						System.out.println("");
						System.out.println("---------------------------------------------------------");
						customerNumber++;
						}

						else if(rs.getString(11).equalsIgnoreCase("no")) {
							System.out.println("Customers who have not been granted loan:");
						System.out.println("");
						System.out.println("");
						System.out.println("Customer " + customerN++);
						System.out.print("First name: " + rs.getString(1));
						System.out.print(" Last name: " + rs.getString(2));
						System.out.print(" Age: " + rs.getInt(3));
						System.out.print(" Salary: " + rs.getDouble(4));
						System.out.println(" Marital status: " + rs.getString(5));
						System.out.print(" Employement status: " + rs.getString(6));
						System.out.print(" Months of employment full-time: " + rs.getInt(7));
						System.out.print(" Total length of service in months: " + rs.getInt(8));
						System.out.print(" Pensioner: " + rs.getString(9));
						}
						
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}

		}
