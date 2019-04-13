
public class Main {
	public static void main(String[] args) {
		
		// STRING POOL CONCEPT
		String s1 = "Hello";
		System.out.println(s1 + " : " + s1.hashCode());
		
		String s2 = "Hello";
		System.out.println(s2 + " : " + s2.hashCode());
		
		// MODIFYING S1 :: IM-MUTABLE :: NEW OBJECT WILL BE CREATED
		System.out.println("MODIFY S1");
		s1 = "World";
		System.out.println(s1 + " : " + s1.hashCode());
		
		s2 = "UNIVERSE";
		System.out.println(s2 + " : " + s2.hashCode());
		
		String s3 = "Hello";
		System.out.println(s3 + " : " + s3.hashCode());
	}
}
