package day6.excption;

import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		
		try {
			int[] iarr = new int[10];
			System.out.println(iarr[10]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("ARRAY INDEX EXCEPTION");
		}catch(Exception e) {
			// DETAIL EXPLAINATION
			e.printStackTrace();
			
			// THIS IS THE MESSAGE WE WOULD LIKE TO SHOW TO USER
			System.out.println("EXCEPTION HANDLING");
			System.out.println("INVALID INPUT");
		}
		
	}
}
