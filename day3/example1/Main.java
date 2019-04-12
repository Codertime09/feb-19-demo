public class Main {
	public static void main(String[] args) {
		
		System.out.println("*** ACCESS STUDENT STATIC MEMBER **");
		String collegeName = Student.getCollegeName();
		System.out.println("STATIC COLLEGE NAME : " + collegeName);
		
		
		// INSTANCE 1
		Student s1 = new Student();
		s1.setId(82);
		s1.setName("PRITESH");
		
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Saurav");
		
		// PRINT INSTANCE
		System.out.println("*** S1 ****");
		System.out.println("NAME - " + s1.getName());
		System.out.println("COLLEGE - " + Student.getCollegeName());
		
		System.out.println("*** S2 ****");
		System.out.println("NAME - " + s2.getName());
		System.out.println("COLLEGE - " + Student.getCollegeName());
		
		
		// CHANGE THE STATIC MEMBER
		Student.setCollegeName("CDAC KHARGHAR");
		
		// PRINT INSTANCE 
		System.out.println("*** S1 ****");
		System.out.println("NAME - " + s1.getName());
		System.out.println("COLLEGE - " + Student.getCollegeName());
		
		System.out.println("*** S2 ****");
		System.out.println("NAME - " + s2.getName());
		System.out.println("COLLEGE - " + Student.getCollegeName());
	}
}