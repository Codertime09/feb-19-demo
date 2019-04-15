package day5.bill;

public class Main {
	public static void main(String[] args) {
		String companyName="Pritish Enterprise";
		String companyAddress="Kharghar, New Mumbai";
		String companyMobileNumber="9930626729";
		String companyGstin="1234567890";
		
		String partyName="Bob Enterprise";
		String partyAddress="Panvel, New Mumbai";
		String partyMobileNumber="9930626789";
		String partyGstin="1234567290";
		
		System.out.println("\t \t Tax Invoice");
		System.out.println("|"+companyName+"\t"+"\t|"+partyName+"\t\t|");
		System.out.println("|"+companyAddress+"\t"+"\t|"+partyAddress+"\t|");
		System.out.println("|Mobile No.:"+companyMobileNumber+"\t"+"\t|Mobile No.:"+partyMobileNumber+"\t|");
		System.out.println("|GSTIN"+companyGstin+"\t"+"\t|GSTIN"+partyGstin+"\t|");
		
		
		
	}
}
