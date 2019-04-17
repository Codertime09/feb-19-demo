package day7.example5;

public class Main {
	public static void main(String[] args) {
		
		Student std = new Student();
		System.out.println(std);
		
		// CALING PARAMETRIZED CONST
		Student std1 = new Student(82, "Paritosh");
		System.out.println("ID :: " + std1.getId());
		System.out.println("NAME :: " + std1.getName());
	}
}
