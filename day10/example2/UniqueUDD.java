package day10.example2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Unique User Define Object with HashSet
 */
public class UniqueUDD {
	public static void main(String[] args) {
		
		Set<Student> set = new TreeSet<Student>();
		
		// Add Student Object
		Student s1 = new Student(1, "Kharghar");
		Student s2 = new Student(2, "Belapur");
		Student s3 = new Student(3, "Vashi");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println("****** OUTPUT ******** ");
		for(Student s : set) {
			System.out.println(s.getName());
		}
		
	}
}
