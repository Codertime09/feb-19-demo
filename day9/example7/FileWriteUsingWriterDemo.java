package day9.example7;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriteUsingWriterDemo {

	public static void main(String[] args) throws Exception {
		
		Writer out = new FileWriter("output.txt");
		
		out.write("Hello World Returns!!!");
		
		out.close();
	}
	
}
