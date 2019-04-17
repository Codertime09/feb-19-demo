package day7.example5;

public class Person {
	private String name;
	
	/**
	 * ZERO PARAMETER CONSTRUTOR
	 */
	public Person() {
		System.out.println("PARETN WITH ZERO PARAMTER");
	}
	
	/**
	 * OVERLOADED CONSTRUTOR 
	 */
	public Person(int i) {
		super();
		System.out.println("PARENT CONSTRUCTOR :: PERSON");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
