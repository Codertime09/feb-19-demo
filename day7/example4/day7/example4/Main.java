package day7.example4;

public class Main {
	public static void main(String[] args) {
		
		// FIRST USING PERSON OBJECT
		Person p = new Person();
		p.setName("PARITOSH");
		
		System.out.println("INITAL VALUE :: " + p.getName());
		Main.passByRefWithInheritance(p);
		System.out.println("AFTER :: " + p.getName());
		
		
		// PASSING CHILD OBJECT AS PARAMETER
		Student std = new Student();
		std.setName("AMINA");
		std.setCollegeName("CDAC");
		
		System.out.println("INITAL :: " + std.getName());
		Main.passByRefWithInheritance(std);
		System.out.println("AFTER :: "  +std.getName());
	}
	
	/**
	 * IT IS OF TYPE OF BASE CLASS
	 * @param p
	 */
	public static void passByRefWithInheritance(Person p) {
		p.setName(p.getName() + " CDACIAN!!!");
		
		// DOWNCASTING :: SAFTY CHECK
		if(p instanceof Student) {
			Student std = (Student) p;
			System.out.println(std.getCollegeName());
		}
	}
}




