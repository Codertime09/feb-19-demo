package day10.example6;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateBillVer4 {
	public static void main(String[] args) throws Exception {

		BillManager bill = new BillManager();
		String finalBill = bill.generateBill();
		
		System.out.println(finalBill);
	}
}
