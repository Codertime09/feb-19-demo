
public class Main5 {
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("cdac");
		s2.setName("cdac");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
