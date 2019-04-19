package day9.example3;

import java.util.HashMap;
import java.util.Map;

/**
 * Working with Map of String 
 * HashMap
 */
public class Main {
	public static void main(String[] args) {
		
		// CREATE HASHMAP :: OBJECT OF HASHMAP
		Map<String, String> map = new HashMap<String, String>();
		
		// ADD OBJECT
		map.put("singer", "JAYESH");
		map.put("dinu", "DINESH");
		map.put("dasbabu", "SAYEN");
		map.put("dinu", "DINESH SAWANT");
		
		System.out.println(map);
		
		// GET OBJECT
		String output = map.get("dinu");
		System.out.println(output);
		
		// ADD OBJECT
		map.put("amar", "ANKIT");
		System.out.println(map);
		
		// REMOVE OBJECT
		map.remove("amar");
		
		System.out.println(map);
		
		
		
	}
}



