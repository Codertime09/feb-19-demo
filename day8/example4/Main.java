package dat8.example4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		// List list = new ArrayList();
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		
		System.out.println(list);
		
		list.remove("A");
		System.out.println(list);
		
		// SIZE
		System.out.println(list.size());
		
		// CLEAR
		list.clear();
		System.out.println(list);
		
	}
}
