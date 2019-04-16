package day6.excption;

public class Main {
	public static void main(String args[]) {
		try {
			float a = 10;
			float b = 0;
			
			// HANDLING BOUNDARY CASE
			if(b == 0) {
				// throw new Exception("DIVIDE BY ZERO NOT ALLOWED");
				Exception er = new Exception("DIVIDE BY ZERO NOT ALLOWED");
				throw er;
			}
			
			float c = a/b;
			System.out.println(c);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
