package day7;

public class Main {
	public static void main(String[] args) {
		
		int i = 10;
		System.out.println("INITIAL VALUE :: " + i);
		
		Main.passByValueDemo(i);
		
		System.out.println("AFTETR CALLING :: " + i);
	}
	
	/**
	 * DATA TYPE IS PRIMITIVE
	 */
	public static void passByValueDemo(int i) {
		
		i = 11;
		System.out.println("WITHIN METHOD :: " + i);
	}
}
