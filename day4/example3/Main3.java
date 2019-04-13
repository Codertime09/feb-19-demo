
public class Main3 {
	public static void main(String[] args) {
		
		// IMMUTABLE
		String str = "Hello World";
		System.out.println(str + " :: " +  str.hashCode());
		
		// MUTABLE
		Student std = new Student();
		System.out.println(std + " :: " + std.hashCode());
		
		
		System.out.println("UPDATE EACH OBJECT");
		
		str = "Hello Universe";
		System.out.println(str + " :: " +  str.hashCode());
		
		std.setId(82);
		std.setName("CDAC");
		System.out.println(std + " :: " + std.hashCode());
		
		
	}
}
