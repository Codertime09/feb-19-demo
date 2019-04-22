package day10.example6;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillManager {
	
	public String generateBill() throws Exception{
		// THIS WILL CONTAINS ALL THE LINE
				StringBuffer bill = new StringBuffer();

				StringBuffer starLine = new StringBuffer();
				for (int i = 0; i < 80; i++) {
					starLine.append("-");
				}

				Scanner sc = new Scanner(System.in);
				// VARIABLES AT TOP
				System.out.println("Enter Company Name : ");
				String compName = sc.nextLine();

				System.out.println("Enter Company Add1 : ");
				String compAdd1 = sc.nextLine();

				System.out.println("Enter Company Add2 : ");
				String compAdd2 = sc.nextLine();

				System.out.println("Enter Company Mobile : ");
				String compMobile = sc.nextLine();

				String partyName = "Cdac Client";
				String partyAdd1 = "Sector - xyz, Road Unknown";
				String partyAdd2 = "Near Pahadi Road";
				String partyMobile = "3434343434";

				// LET S PREPARE TITLE BLOCK
				bill.append(starLine);
				bill.append("\n");

				// TAX INVOICE LINE
				bill.append(String.format("|%34s", ""));
				bill.append(String.format("%11.11s", "Tax Invoice"));
				bill.append(String.format("%33s|", ""));

				bill.append("\n");
				bill.append(starLine);

				// COMPNAY NAME AND PARTY NAME
				bill.append("\n");
				bill.append(String.format("|%-39.39s|", compName));
				bill.append(String.format("%-38.38s|", partyName));

				// ADDRESS-1
				bill.append("\n");
				bill.append(String.format("|%-39.39s|", compAdd1));
				bill.append(String.format("%-38.38s|", partyAdd1));

				// ADDRESS-2
				bill.append("\n");
				bill.append(String.format("|%-39.39s|", compAdd2));
				bill.append(String.format("%-38.38s|", partyAdd2));

				// TELEPHONE
				bill.append("\n");
				bill.append(String.format("|%-39.39s|", compMobile));
				bill.append(String.format("%-38.38s|", partyMobile));

				// PRINT STAR LINE
				bill.append("\n");
				bill.append(starLine);

				// LINE FOR INVOICE ROW
				bill.append("\n");
				bill.append(String.format("|%-27.27s|", "Invoice Number : A001"));
				bill.append(String.format("%-24.24s|", "Inv Date : 20-04-2019"));
				bill.append(String.format("%-25.25s|", "Salesman : Paritosh"));

				// LINE FOR INVOICE ROW
				bill.append("\n");
				bill.append(String.format("|%-27.27s|", "PO Number : P001"));
				bill.append(String.format("%-24.24s|", "PO Date : --"));
				bill.append(String.format("%-25.25s|", ""));

				// PRINT STAR LINE
				bill.append("\n");
				bill.append(starLine);

				// PRINT HEADER BLOCK
				bill.append("\n");
				bill.append(String.format("|%-8.8s|", "HSNC"));
				bill.append(String.format("%-13.13s|", "PROD DESC"));
				bill.append(String.format("%-7.7s|", "MRP"));
				bill.append(String.format("%-7.7s|", "Box"));
				bill.append(String.format("%-7.7s|", "Rate"));
				bill.append(String.format("%-7.7s|", "Scheme"));
				bill.append(String.format("%-7.7s|", "GST%"));
				bill.append(String.format("%-7.7s|", "GST AMT"));
				bill.append(String.format("%-7.7s|", "Net AMT"));

				// PRINT STAR LINE
				bill.append("\n");
				bill.append(starLine);

				// THIS LOOP FOR DATA CAPTURE
				Sales sales = new Sales();
				List<LineItem> list = new ArrayList<>();
				for (int i = 0; i < 2; i++) {
					System.out.println("*******Enter New Product ****");

					System.out.println("Enter HSN :: ");
					String hsn = sc.nextLine();

					System.out.println("Enter DESC :: ");
					String desc = sc.nextLine();

					String mrp = "100";
					int box = 2;
					float rate = 75;
					String scheme = "0";
					String gstPer = "18";

					LineItem line = new LineItem();
					line.setHsn(hsn);
					line.setPdesc(desc);
					line.setMrp(mrp);
					line.setBox(box);
					line.setRate(rate);
					line.setScheme(scheme);
					line.setGstPercent(gstPer);

					float netAmt = line.getRate() * line.getBox();
					line.setNetAmt(netAmt);

					// CALCULATIING THE FOOTER
					sales.setFinalAmount(sales.getFinalAmount() + netAmt);

					list.add(line);
				}

				// THIS LOOP IS FOR PRINTING
				for (LineItem item : list) {

					bill.append("\n");

					bill.append(String.format("|%-8.8s|", item.getHsn()));
					bill.append(String.format("%-13.13s|", item.getPdesc()));
					bill.append(String.format("%-7.7s|", item.getMrp()));
					bill.append(String.format("%-7.7s|", item.getBox()));
					bill.append(String.format("%-7.7s|", item.getRate()));
					bill.append(String.format("%-7.7s|", item.getScheme()));
					bill.append(String.format("%-7.7s|", item.getGstPercent()));
					bill.append(String.format("%-7.7s|", item.getGstAmt()));
					bill.append(String.format("%7.2f|", item.getNetAmt()));
				}

				for (int i = 0; i < 5; i++) {

					bill.append("\n");

					bill.append(String.format("|%-8.8s|", ""));
					bill.append(String.format("%-13.13s|", ""));
					bill.append(String.format("%-7.7s|", ""));
					bill.append(String.format("%-7.7s|", ""));
					bill.append(String.format("%-7.7s|", ""));
					bill.append(String.format("%-7.7s|", ""));
					bill.append(String.format("%-7.7s|", ""));
					bill.append(String.format("%-7.7s|", ""));
					bill.append(String.format("%7.2s|", ""));
				}

				// PRINT STAR LINE
				bill.append("\n");
				bill.append(sales.getFinalAmount());

				// PRINT STAR LINE
				bill.append("\n");
				bill.append(starLine);

				// WRITE TO FILE
				PrintWriter out = new PrintWriter("bill.txt");
				out.println(bill);
				out.close();

				return bill.toString();
	}
}
