package day5.inheritance;

public class Main {
	public static void main(String args[]) {
		System.out.println("INHERITANCE DEMO");
		
		// ACCESSING BASE CLASS
		Sort s = new Sort();
		s.sortArray();
		
		// CHILD CLASS1
		HashSort hs = new HashSort();
		hs.sortArray();
		
		// CHILD CLASS 2
		QuickSort qs = new QuickSort();
		qs.sortArray();
	}
}
