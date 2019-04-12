public class Student {
	private int id;
	private String name;
	
	private static String collegeName = "CDAC";
	private static int counter = 0;
	
	
	public Student(){
		super();
		System.out.println("IT BECOME ZERO CONSTRUCTOR");
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	// STATIC
	public static String getCollegeName() {
		return Student.collegeName;
	}
	
	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	
	
	public static int getCounter() {
		return Student.counter;
	}
	
	public static void setCounter(int counter) {
		Student.counter = counter;
	}
	
	
	// TRY TO ACCESS_STATIC_MEMBER FROM MEMBER_FUNCTION
	public void basicMemberFunction() {
		System.out.println(Student.collegeName);
	}
	
	
	// TRY TO ACCESS_DATA_MEMBER FROM STATIC_FUNCTION
	public static void basicStaticFunction() {
		
		// THIS IS NOT ALLOWED
		// System.out.println(this.name);
	}
	
	
}

