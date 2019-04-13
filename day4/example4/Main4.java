
public class Main4 {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		// Reference Check
		boolean o1= (s1==s2);
		System.out.println(o1);
		
		// equality check.
		boolean o2 = s1.equals(s2);
		System.out.println(o2);
		
		
		// STRING POINT OF VIEW
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
	
}
