package day7.example5;

public class Student extends Person {

	private int id;
	
	/**
	 * ZERO CONSTRUTOR
	 */
	public Student() {
		super();
	}
	
	/**
	 * @return
	 */
	public Student(int id, String name) {
		// calling parent construtor with parameter
		super(name);
		
		this.id = id;
		System.out.println("CHILD CONSTRUTOR. ::  STUDENT" );
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
