package day9.example6;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileReadUsingStreamDemo {
	public static void main(String[] args) throws Exception{
		
		// PATH OF THE FILE AS PARAM :: 
		String fileAbsPath = "/Users/santosh/Desktop/workspace19/feb-19-java/src/todo.txt";
		InputStream is = new FileInputStream(fileAbsPath);
		
		// READING ONE BYTE
		//char ch = (char)is.read();
		// System.out.println(ch);
		
		// READING ENTIRE FILE UNITIL IT REACHES END OF FILE -1
		int content = is.read();
		while(content  != -1) {
			
			char ch = (char)content;
			System.out.print(ch);
			
			// INCREMENT MOVING TO NEXT BYTE
			content = is.read();
		}
		
		// CLOSE THE STREAM
		is.close();
		
	}
}
