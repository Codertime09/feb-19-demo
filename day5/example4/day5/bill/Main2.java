package day5.bill;

public class Main2 {
	public static void main(String[] args) {
		String companyName="A Enterprise";
		String companyAddress="Kharghar, New Mumbai";
		String companyMobileNumber="9930626729";
		String companyGstin="1234567890";
		
		String partyName="Bob Enterprise";
		String partyAddress="Panvel, New Mumbai";
		String partyMobileNumber="9930626789";
		String partyGstin="1234567290";
		
		String line1="\t \t Tax Invoice";
		String line2="|"+companyName+"\t"+"\t|"+partyName+"\t\t|";
		String line3="|"+companyAddress+"\t"+"\t|"+partyAddress+"\t|";
		String line4="|Mobile No.:"+companyMobileNumber+"\t"+"\t|Mobile No.:"+partyMobileNumber+"\t|";
		String line5="|GSTIN"+companyGstin+"\t"+"\t|GSTIN"+partyGstin+"\t|";
		
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);
		System.out.println(line5);
		
		
		
	}
}
