package day8.example1;

public class Main {
	public static void main(String[] args) {
		
		Calculator c = Calculator.getInstance();
		System.out.println(c);
		
		Calculator c1 = Calculator.getInstance();
		System.out.println(c1);
		
		System.out.println(c == c1);
		System.out.println(c.equals(c1));
	}
}
