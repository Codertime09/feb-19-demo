public class Main {
	public static void main(String[] args) throws Exception{
		System.out.println("Working with Member Function");
		
		Student std = new Student();
		// std.id = 1;
		// std.name = "PRITESH";
		std.setId(82);
		std.setName("PRITESH");
		std.setAge(20);
		
		System.out.println("*******************************");
		System.out.println("ID " + std.getId());
		System.out.println("Name " + std.getName()); System.out.println("Age " + std.getAge() );
		System.out.println("*******************************");
	}
}