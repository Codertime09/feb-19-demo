public class Main1 {
	public static void main(String args[]) {
		
		Student std = new Student();
		std.basicMemberFunction();
		
		// TRYING TO ACCESS_STATIC_METHOD_USING_INSTANCE
		String c1 = Student.getCollegeName(); // CORRECT WAY
		String c2 = std.getCollegeName(); // NOT RECOMMENDED
		
		System.out.println("C2 : " + c2);
	}
}