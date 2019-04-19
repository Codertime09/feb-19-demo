package day9.example7;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWriteUsingStream {
	public static void main(String[] args)throws Exception {
		
		OutputStream os = new FileOutputStream("output.txt");
		
		char ch = 'H';
		os.write(ch);
		
		String str = "Hello Universe!!";
		for(int i=0; i<str.length(); i++) {
			
			char ch1 = str.charAt(i);
			os.write(ch1);
		}
		
		os.close();
	}

}
