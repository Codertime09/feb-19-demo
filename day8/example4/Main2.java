package dat8.example4;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.add(4);
		
		System.out.println(list);
		
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}
}
