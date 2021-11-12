package com.qa.oop_exercises.person_ex;


/*Create a Person class modelling name, age and job title variables.

Create a method to return all three of these in a formatted string.

HINT: @Override the toString() method.

Create some example objects with this class.

Create a List<> implementation and store those objects inside.

HINT: it's probably best to put your List<> implementation in a separate class.

Create a method that can search for a specific Person by their name.*/

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	public Person() {}
	
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}
	
	
}
