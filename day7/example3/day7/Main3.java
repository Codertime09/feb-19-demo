package day7;

public class Main3 {
	public static void main(String[] args) {
		
		String str = "Hello";
		System.out.println("INITIAL VALUE :: " + str);
		
		Main3.passByReferenceUsingString(str);
		
		System.out.println("AFTER VALUE :: " + str);
		
		
		System.out.println("******** STRING BUFFER *********");
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("INITAL VALVE SB :: " + sb);
		
		Main3.passByReferenceUsingStringBuffer(sb);
		System.out.println("AFTER VALUE SB :: " + sb);
	}
	
	
	public static void passByReferenceUsingString(String str) {
			str += " World";
	}	
	
	
	public static void passByReferenceUsingStringBuffer(StringBuffer sb) {
		sb.append(" World");
	}
}






