package de.e4a;

public class Person {
	private int alter;
	private String name;
	private static int zaehler;
	
	
	public Person(int alter, String name) {
		super();
		this.alter = alter;
		this.name = name;
		Person.zaehler++;
	}
	
	public static int getZaehler(){
		return Person.zaehler;
	}
	
	
}
