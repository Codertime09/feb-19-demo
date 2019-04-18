package day8.example3;

public class AxisBank implements Bank {

	@Override
	public boolean withdraw(int amount) {
		System.out.println("WITHDRAW MONEY");
		return false;
	}

	@Override
	public String printStatement(String accountNumber) {
		System.out.println("PRINT STATEMENT");
		return null;
	}

	@Override
	public float checkBalance(String accountNumber) {
		System.out.println("CHECK BALANCE");
		return 0;
	}
	
	

}
