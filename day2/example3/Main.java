public class Main {
	public static void main(String args[]) {
		System.out.println("*** VARIABLE PARAMS ***");
		
		DemoMemberFunction ref = new DemoMemberFunction();
		ref.demo("PRITESH");
		
		ref.demo("A", "B");
	}
}