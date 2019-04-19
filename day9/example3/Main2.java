package day9.example3;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Working with Map
 * LinkedHashMap
 *
 */
public class Main2 {
	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<>();
		
		// ADD OBJECT
		map.put("bikaner", "PRATIK");
		map.put("milku", "KAJAL");
		map.put("mika", "NAYANDA");
		map.put("lawani", "RAHUL");
		map.put("lawani", "RAHUL TUSHAR");
		
		System.out.println(map);
		
	}
}






