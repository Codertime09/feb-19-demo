package day5.bill;

public class Main6 {
	public static void main(String args[]) {
		
		String compName = "Abcd Pvt Ltd";
		String partyName = "Ranveer Singh";
		
		String str1 = String.format("|%-25s|", compName);
		
		String str2 = String.format("%-25s|", partyName);
		
		String finalLine = str1  + str2;
		System.out.println(finalLine);
	}
}
