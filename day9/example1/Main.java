package day9.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Working with List of String 
 * ArrayList
 * LinkedList
 */
public class Main {
	public static void main(String[] args) {
		
		// ARRAY LIST 
		List<String> list = new ArrayList<String>();
		
		// ADD ELEMENT/OBJECT INTO LIST
		list.add("AMOL");
		list.add("ANKIT");
		list.add("PRIYA");
		list.add("SHITAL");
		
		System.out.println(list);
		
		// REMOVE ELEMENT/OBJECT FROM LIST
		list.remove("ANKIT");
		
		System.out.println(list);
		
		
		// TRAVERSE EACH ELEMENT/OBJECT
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}




