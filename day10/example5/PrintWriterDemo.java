package day10.example5;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {
		
		// AT TERMINAL :: CONSOLE
		PrintWriter out = new PrintWriter(System.out);
		out.println("Hello World Using PrintWriter");
		out.close();
		
		// WRITE TO A FILE
		File file = new File("pw.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println("Hello CDAC!!!");
		pw.println("Hello DAC!!!");
		pw.println("Hello WORLD!!!");
		
		
		pw.close();
	}
	
}
