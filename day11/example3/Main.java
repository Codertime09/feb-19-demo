package day11.example3;

public class Main {
	public static void main(String[] args) throws Exception{
		
		System.out.println("I AM MAIN PROCESS/THREAD");
		
		// STEP-2
		Runnable r = new SimpleThread(10);
		Thread t = new Thread(r, "tab1");
		
		// STEP-3 :: IT STARTS THREAD
		t.start();

		
	}
}
