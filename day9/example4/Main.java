package day9.example4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Working with WRAPPER CLASSES - INTEGER
 * ArrayList
 * HashMap
 */
public class Main {
	public static void main(String[] args) {
		
		// ARRAYLIST
		List<Integer> list = new ArrayList<>();
		
		// ADD OBJECT
		list.add(82);
		list.add(1);
		list.add(92);
		list.add(2);
		list.add(2);
		System.out.println(list);
		
		
		
		// MAP WITH WRAPPER CLASS
		Map<String, Integer> map = new HashMap<>();
		
		// Add Object
		map.put("priyanaka", 86);
		map.put("priyanaka", 86);
		map.put("snehal", 121);
		map.put("pallavi", 69);
		map.put("khushbu", 50);
		System.out.println(map);
	}
}








