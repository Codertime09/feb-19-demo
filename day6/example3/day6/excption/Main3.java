package day6.excption;

public class Main3 {
	public static void main(String[] args) {
		
		try {
			// PLAN A
			String[] str = new String[10];
			str[0].length();
			
			// clsosing
		} catch(Exception e) {
			// PLAN B
			System.out.println("HANDLLE ANY EXCEPTION!!!");
			
			// DOWNCAST :: SAFETY CHECK
			if(e instanceof NullPointerException) {
				NullPointerException ne = (NullPointerException) e;
				System.out.println(ne);
			}
			
			// ALSO TRHOWING THE EXCPTION
			throw e;
		} finally {
			System.out.println("THIS WILL EXECUTE IN EITHER CASE.");
		}
		
	}
}

