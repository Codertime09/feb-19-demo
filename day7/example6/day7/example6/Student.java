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
	public Student(String name) {
		super();
		System.out.println("CHILD CONSTRUTOR. ::  STUDENT" );
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
