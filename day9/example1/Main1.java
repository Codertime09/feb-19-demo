package day9.example1;

import java.util.LinkedList;
import java.util.List;

/**
 * Working with List of Strin
 * LinkedList
 */
public class Main1 {
	public static void main(String[] args) {
		
		// DECALARE LINKEDLIST
		LinkedList<String> list = new LinkedList<String>();
		
		// ADD ELEMENT/OBJECT
		list.add("AMAN");
		list.add("NUPUR");
		list.add("LAXMI");
		list.add("SMITA");
		
		System.out.println(list);
		list.addFirst("ANKIT");
		
		System.out.println(list);
		
		// remove object from linkedlist
		list.remove("ANKIT");
		
		System.out.println(list);
		
		
		// ITERATE THE LIST
		for(String str : list) {
			System.out.println(str);
		}
		
		
	}
}
