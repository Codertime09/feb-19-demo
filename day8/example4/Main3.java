package dat8.example4;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		list.add(s1);
		list.add(s2);
		
		System.out.println(list);
		
		
		// ITERATE EACH ELEMENT OF LIST
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(0);
			System.out.println(s);
		}
		
		
		// NEW FOR LOOP
		for(Student std : list) {
			System.out.println(std);
		}
	}
}
