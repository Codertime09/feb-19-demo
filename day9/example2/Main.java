package day9.example2;

import java.util.HashSet;
import java.util.Set;

/**
 * WOKRING WITH SET OF STRING
 * HashSet
 */
public class Main {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// ADD OBJECT
		set.add("PRAVIN");
		set.add("VAIBHAW");
		set.add("PRITESH");
		set.add("PRITESH");
		
		System.out.println(set);
		set.add("ANKIT");
		System.out.println(set);
		
		// REMOVE THE OBJECT
		set.remove("ANKIT");
		
		System.out.println(set);
		
		
	}
}
