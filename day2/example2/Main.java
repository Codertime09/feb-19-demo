public class Main {
	public static void main(String[] args) {
		System.out.println("***** CALCULATOR *****");
		
		Calculator c = new Calculator();
		int output = c.add(10, 10);
		System.out.println("ADDITION : " + output);
		
		System.out.println("***** OVERLOADED ADD FUNC *****");
		int output1 = c.add(10, 10, 10);
		System.out.println("OVERLOADED ADD : " + output1);
	}
}