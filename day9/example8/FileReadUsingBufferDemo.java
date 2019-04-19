package day9.example8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class FileReadUsingBufferDemo {
	public static void main(String[] args)throws Exception {
		
		String fileAbsPath = "/Users/santosh/Desktop/workspace19/feb-19-java/src/todo.txt";
	
		// OPTION -1
		// BufferedReader br = new BufferedReader(new FileReader(fileAbsPath));
		
		// OPTION -2 
		Reader reader = new FileReader(fileAbsPath);
		BufferedReader br = new BufferedReader(reader);
		
		// ONLY 1 CHAR
		// char ch = (char)br.read();
		// System.out.println(ch);
		
		int data = br.read();
		while(data != -1) {
			
			char ch = (char) data;
			System.out.print(ch);
			
			// READ THE NEXT CHAR
			data = br.read();
		}
		
		reader.close();
	}
}
