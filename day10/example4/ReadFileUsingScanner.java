package day10.example4;

import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScanner {
	
	public static void main(String[] args) throws Exception {
		
		String fileAbsPath = "/Users/santosh/Desktop/workspace19/feb-19-java/src/todo.txt";
		
		File file = new File(fileAbsPath);
		Scanner sc = new Scanner(file);
		
		// READ ENTIRE FILE
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		// close
		sc.close();
	}
}
