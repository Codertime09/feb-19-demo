package day9.example8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class FileWriterUsingBufferDemo {
	public static void main(String[] args) throws Exception{
		
		Writer out = new FileWriter("output-2.txt");
		BufferedWriter bw = new BufferedWriter(out);
		
		bw.write("HELLO CDAC!!");
		
		bw.close();
	}
}
