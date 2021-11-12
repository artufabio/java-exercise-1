package com.qa.oop_exercises.person_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonActions{
	
	public static Scanner sc = new Scanner(System.in);
	
	ArrayList<Person> people = new ArrayList<Person>();
	
	public Person createPersonIstance() {
		Person pers = new Person();
		System.out.println("What's their name?");
		pers.setName(sc.nextLine());
		System.out.println("What's their age?");
		pers.setAge(sc.nextInt());
		System.out.println("What's their job title?");
		sc.nextLine();
		pers.setJobTitle(sc.nextLine());
		return pers;
	}
	
	public ArrayList<Person> addPersonToList(Person p) {
		people.add(p);
		return people;
	}
	
	public ArrayList<Person> removePersonFromList(Person p) {
		people.remove(p);
		return people;
	}
	
	public Person updatePersonFromTheList(Person p){
		System.out.println("What's their new name?");
		p.setName(sc.nextLine());
		System.out.println("What's their new age?");
		p.setAge(sc.nextInt());
		System.out.println("What's their new job title?");
		sc.nextLine();
		p.setJobTitle(sc.nextLine());
		return p;
	}
	
	public String howMany() {
		return people.size()>0 ? "People in your list: " + people.size() : "There are no people in your list";
	}
	
	public void printPeople() {
		for(Person person: people) {
			System.out.println(person.toString());
		}
	}
	
	public Person findPerson(String name) {
		for(Person person: people) {
			if (person.getName().toLowerCase().equals(name.toLowerCase())) {
				return person;
			}
		}
		return null;
	}
	
	public void printPerson(Person p) {
		System.out.println(p.toString());
	}

}
