package com.qa.oop_exercises.person_ex;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Queries {
	

//	Add a Person to the people table
	public void create(Person p) {
		String createStmt = "INSERT INTO people(name, age, job_title) VALUES('" + p.getName() + "'," + p.getAge() + ",'"
				+ p.getJobTitle() + "');";
		try {
			DbConnection.stmt.executeUpdate(createStmt);
			System.out.println("Person added to your people");
		} catch (SQLException e) {
			System.out.println("Bad query");
		}
	}

//	Reset the people table
	public void deleteAll() {
		String createStmt = "truncate people;";
		try {
			DbConnection.stmt.executeUpdate(createStmt);
		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}

//	Remove the item from people table based on the id selected by the user
	public void deleteById(int id) {
		String read = "DELETE FROM people WHERE id = " + id + ";";
		try {
			DbConnection.stmt.executeUpdate(read);
		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}

//	Display all the items inside people table
	public void readAll() {
		String read = "SELECT * FROM people;";
		ResultSet rs;
		try {
			rs = DbConnection.stmt.executeQuery(read);
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + ", name: " + rs.getString("name") + ", age: "
						+ rs.getString("age") + ", job title: " + rs.getString("job_title") + ".");
			}

		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}

//	Display item based on id selected by the user
	public void readById(int id) {
		String read = "SELECT id, name, age, job_title FROM people WHERE id = " + id + ";";
		ResultSet rs;
		try {
			rs = DbConnection.stmt.executeQuery(read);
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + ", name: " + rs.getString("name") + ", age: "
						+ rs.getString("age") + ", job title: " + rs.getString("job_title"));
			}
		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}

//	Update the item selected by the user
	public void updateById(int id) {
		try {
			System.out.println("What's their new name?");
			MyScanner.sc.nextLine();
			String name = MyScanner.sc.nextLine();
			System.out.println("What's their new age?");
			int age = MyScanner.sc.nextInt();
			System.out.println("What's their new job title?");
			MyScanner.sc.nextLine();
			String jobT = MyScanner.sc.nextLine();

			String read = "UPDATE people SET name = '" + name + "', age = " + age + ", job_title = '" + jobT
					+ "' WHERE id = " + id + ";";

			DbConnection.stmt.executeUpdate(read);
		} catch (Exception e) {
			System.out.println("Sorry...Something went wrong. Please try again.");
			MyScanner.sc.nextLine();
		}
	}

//	Display how many people inside your people table
	public void countPeople() {
		String read = "SELECT count(name) from people;";
		ResultSet rs;
		try {
			rs = DbConnection.stmt.executeQuery(read);
			while (rs.next()) {
				int num = rs.getInt("count(name)");
				if (num > 0) {
					System.out.println("People in your list: " + num);
				} else {
					System.out.println("There are no people in your list.");
				}
			}
		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}

}
