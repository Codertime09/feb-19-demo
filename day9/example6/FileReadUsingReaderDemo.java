package day9.example6;

import java.io.FileReader;
import java.io.Reader;

public class FileReadUsingReaderDemo {
	public static void main(String[] args) throws Exception {
		
		// THE ABS PATH OF THE FILE IN FILE_SYSTEM
		String fileAbsPath = "/Users/santosh/Desktop/workspace19/feb-19-java/src/todo.txt";
		Reader reader = new FileReader(fileAbsPath);
		
		// LETS READ ONE CHARACTER
		// char ch = (char)reader.read();
		// System.out.println(ch);
		
		
		int data = reader.read();
		while(data != -1) {
			
			char ch = (char) data;
			System.out.print(ch);
			
			// READ THE NEXT CHAR
			data = reader.read();
		}
		
		// CLOSE THE READER
		reader.close();
		
	}
}



