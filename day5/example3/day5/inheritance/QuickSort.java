package day5.inheritance;

public class QuickSort extends Sort {
	
	// OVERRID THE MEMBER FUNCTION
	public void sortArray() {
		System.out.println("QUICK SORT");
	}
	
	// NEW METHOD ADDED NOT A PART OF BASE CLASS
	public void sortStringArray() {
		System.out.println("PROPERY BELONGS TO ONLY CHILD CLASS!!");
	}
}
