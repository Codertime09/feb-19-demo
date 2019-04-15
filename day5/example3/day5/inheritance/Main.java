package day5.inheritance;

public class Exampl3 {
	public static void main(String[] args) {
		
		// UPCASTING AND DOWNCASTING
		Sort s = new QuickSort();	// UPCASTING // CAN ONLY WATCH BASE CLASS FUNCTIONS
		s.sortArray();
		
		// DOWNCASTING
		QuickSort qs = (QuickSort) s;
		qs.sortArray();
		qs.sortStringArray();
			
	}
}
