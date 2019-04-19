package day9.example5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Working with Set - TreeSet :: Student
 */
public class Main2 {
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		// ADD OBJECT
		Student std1 = new Student(1, "ABHINAV");
		set.add(std1);
		
		Student std11 = new Student(1, "ABHINAV");
		set.add(std11);
		
		Student std2 = new Student(2, "CHIKU");
		set.add(std2);
		
		Student std3 = new Student(3, "Abhishek");
		set.add(std3);
		
		System.out.println("SIZE :: " + set.size());
		
		
		for(Student std : set) {
			System.out.println(std.getId() + " :: " + std.getName());
		}
		
	}
}
