package day7;

public class Main2 {
	public static void main(String[] args) {
		
		// CREATED AN OBJECT OF STUDENT
		Student std = new Student();
		std.setId(1);
		std.setName("KHARGHAR");
		
		System.out.println("INITIAL :: " + std.getName());
		
		Main2.passByReferenceDemo(std);
		
		System.out.println("AFTER ::  " + std.getName()) ;
		
	}
	
	/**
	 * DATA TYPE HAS TO BE USER DEFINE CALASS
	 */
	public static void passByReferenceDemo(Student std) {
		std.setName("CDAC KHARGHAR");
	}
}
