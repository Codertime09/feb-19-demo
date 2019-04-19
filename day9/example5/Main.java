package day9.example5;

import java.util.ArrayList;
import java.util.List;

/**
 * Working with ArrayList : Student
 * @author santosh
 *
 */
public class Main {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		// ADD OBJECT
		Student std1 = new Student(1, "ABHINAV");
		list.add(std1);
		
		Student std2 = new Student(2, "CHIKU");
		list.add(std2);
		
		Student std3 = new Student(3, "Abhishek");
		list.add(std3);
		
		// FOR LOOP
		for(Student std : list) {
			System.out.println(std.getId() + " :: " + std.getName());
		}
		
		
	}
}
