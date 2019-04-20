package day10.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sort ArrayList of User Define DataType. 
 */
public class SortArrayListOfUDD {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		// ADD OBJECT
		Student s1 = new Student(11, "Amey");
		Student s2 = new Student(112, "Nagina");
		Student s3 = new Student(30, "Scholar");
		Student s4 = new Student(144, "Priya");
		Student s5 = new Student(50, "xyz");
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println("********* BEFORE SORTING *********");
		for(Student s : list) {
			System.out.println(s.getName() + " :: " + s.getId());
		}
		System.out.println("**********************************");
		
		
		// SORT :: DEFAULT SORT USING COMPARABLE
		// Collections.sort(list);
		
		// COMPARATOR :: ID COMPARATOR
		StudentIdComparator comp = new StudentIdComparator();
		Collections.sort(list, comp);
		
		
		System.out.println("********* AFTER SORTING *********");
		for(Student s : list) {
			System.out.println(s.getName() + " :: " + s.getId());
		}
		System.out.println("**********************************");
	}
}
