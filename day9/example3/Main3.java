package day9.example3;

import java.util.Map;
import java.util.TreeMap;

/**
 * Working with Map
 * TreeMap
 */
public class Main3 {
	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<>();
		
		// ADD OBJECT
		map.put("nick", "PRIYANKA");
		map.put("cr", "AMOL");
		map.put("dora", "SHRADDHA");
		map.put("dr", "SUYOG");
		map.put("bhajipav", "POOJA");
		
		
		System.out.println(map);
		
		
	}
}
