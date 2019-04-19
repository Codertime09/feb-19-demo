package day9.example2;

import java.util.Set;
import java.util.TreeSet;

/**
 * Set
 * TreeSet 
 */
public class Main2 {
	
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		
		// ADD OBJECT
		set.add("GAURAV");
		set.add("SAGAR");
		set.add("SAGAR");
		set.add("KULDIP");
		
		System.out.println(set);
		
		set.add("ANKIT");
		System.out.println(set);
		
	}
}
