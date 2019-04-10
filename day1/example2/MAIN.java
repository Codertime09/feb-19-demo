/**
 * DATA/INSTANCE MEMBER
 * PRIMITIVE VARIABLE
 * REFERENCE VRIALBLE
 * LOCAL VARIABLE
 * GLOBAL VRAIABLE
 */
public class MAIN {
	public static void main(String[] args) {
		System.out.println("I AM MAIN FUNCTION !!!");

		Student std1 = new Student();
		std1.id = 82;
		std1.name = "Pritesh";
		
		System.out.println("************************");
		System.out.println(std1.id + " " + std1.name);
		
		Student std2 = new Student();
		std2.id = 102;
		std2.name = "SAURAV";
		
		System.out.println("************************");
		System.out.println(std2.id + " " + std2.name);
		System.out.println("************************");
	}
}