package day9.example2;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Set
 * Working with LinkedHashSet of String
 */
public class Main1 {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		// add object
		set.add("VIJAY");
		set.add("AKSHATA");
		set.add("MANGESH");
		set.add("NEHA");
		set.add("NEHA");
		System.out.println(set);
		
		
		// ADD MORE OBJECT
		set.add("ANKIT");
		
		System.out.println(set);
		
		// REMOVE 
		set.remove("ANKIT");
		
		// TRAVERSING
		for(String str : set) {
			System.out.println(str);
		}
		
	}
}
