package day5.inheritance;

public class MainPolymorphismDemo {
	
	public static void main(String[] args) {
		
		// BASE REFERENCE WITH BASE OBJECT
		Sort s = new Sort();
		s.sortArray();
		
		// BASE CLASS REFERENCE VARIABL WITH CHILD OBJECT
		Sort s1 = new HashSort();
		s1.sortArray();
		
		Sort s2 = new QuickSort();
		s2.sortArray();
		
	}

}
