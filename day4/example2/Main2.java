
public class Main2 {
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println("FIRST USE CASE");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("SECOND USE CASE");
		String s3 = new String("hello"); 
		System.out.println(s1==s3);				// Reference COMAPRISION
		System.out.println(s1.equals(s3));		// Object COMPARISION
	}
}
