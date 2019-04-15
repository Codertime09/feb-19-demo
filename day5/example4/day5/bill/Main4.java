package day5.bill;

public class Main4 {
	public static void main(String[] args) {
		String companyName="A Enterprise";
		String companyAddress="Kharghar, New Mumbai";
		String companyMobileNumber="9930626729";
		String companyGstin="1234567890";
		
		String partyName="Bob Enterprise";
		String partyAddress="Panvel, New Mumbai";
		String partyMobileNumber="9930626789";
		String partyGstin="1234567290";
		
		String bill="\t \t Tax Invoice";
		bill += "\n";
		
		bill += "|"+companyName+"\t"+"\t|"+partyName+"\t\t|";
		bill += "\n";
		
		bill += "|"+companyAddress+"\t"+"\t|"+partyAddress+"\t|";
		bill += "\n";
		
		bill += "|Mobile No.:"+companyMobileNumber+"\t"+"\t|Mobile No.:"+partyMobileNumber+"\t|";
		bill += "\n";
		
		bill += "|GSTIN"+companyGstin+"\t"+"\t|GSTIN"+partyGstin+"\t|";
		bill += "\n";

				
		System.out.println(bill);
		
		
		
	}
}
