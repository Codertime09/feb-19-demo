package day8.example3;

public interface Bank {

	public boolean withdraw(int amount);
	
	public String printStatement(String accountNumber);
	
	public float checkBalance(String accountNumber);
}
