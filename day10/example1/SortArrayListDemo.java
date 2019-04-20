package day10.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * SORT ARRAYLIST OF STRING FIRST
 *
 */
public class SortArrayListDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// ADD OBJECT
		list.add("KHARGHAR");
		list.add("BELAPUR");
		list.add("NERUL");
		list.add("VASHI");
		list.add("PANVEL");
		
		System.out.println("********* BEFORE SORTING *********");
		System.out.println(list);
		System.out.println("**********************************");
		
		
		// TO SORT STRING OF ARRAYLIST
		Collections.sort(list);
		
		System.out.println("********* AFTER SORTING *********");
		System.out.println(list);
		System.out.println("**********************************");
		
	}
}















