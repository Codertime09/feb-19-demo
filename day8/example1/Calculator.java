package day8.example1;

/**
 * MAKING CLASS SINGLETON 
 */
public class Calculator {
	
	/**
	 * CREATE STATIC MEMBER OF SAME CLASS TYPE
	 */
	private static Calculator instance;

	/**
	 * MARK THE CONSTRUCTOR PRIVATE
	 */
	private Calculator() {
		
	}
	
	public static Calculator getInstance() {
		if(instance == null) {
			instance = new Calculator();
		} 
		
		return instance;
	}
}





