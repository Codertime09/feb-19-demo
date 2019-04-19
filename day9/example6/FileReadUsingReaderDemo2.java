package day9.example6;

import java.io.FileReader;
import java.io.Reader;

public class FileReadUsingReaderDemo2 {
	public static void main(String[] args) throws Exception {
		
		// THE ABS PATH OF THE FILE IN FILE_SYSTEM
		String fileAbsPath = "/Users/santosh/Desktop/workspace19/feb-19-java/src/todo.txt";
		Reader reader = new FileReader(fileAbsPath);
		
		// LETS READ ONE CHARACTER
		String str = "";
		char ch = (char)reader.read();
		str+= ch;
		
		char ch1 = (char)reader.read();
		str+=ch1;
		
		
		System.out.println(str);
		
		
		
		
	}
}



