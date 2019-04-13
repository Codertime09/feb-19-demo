
public class Main1 {
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		boolean o1 = (s1 == s2);
		System.out.println("Output : " + o1);
		
		String s3 = new String("hello");
		boolean o2 = (s1 == s3);
		System.out.println("Output2 : " + o2);
		
		System.out.println(s1.hashCode() + " :: " + s3.hashCode());
	}
}
