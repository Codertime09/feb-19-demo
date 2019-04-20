package day10.example1;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private String email;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Student o) {
		// sort based on name;
		return this.getName().compareTo(o.getName());
		// return o.getName().compareTo(this.getName());
	}

}
