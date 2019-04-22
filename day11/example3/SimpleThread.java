package day11.example3;

public class SimpleThread implements Runnable {
	private int start;
	
	public SimpleThread(int start) {
		this.start = start;
	}
	
	public void run() {
		// THIS PLACE WILL WORK AS INDEPMENT OF MAIN THREAD
		System.out.println("I M THREAD");
		
		int end = this.start + 10;
		for(int i=this.start; i<end; i++) {
			String name = Thread.currentThread().getName();
			System.out.println("CHILD  " + name + " :: " + i);
		}
	}
}
