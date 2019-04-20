package day10.example3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadInputFromTerminal {
	public static void main(String[] args) throws Exception {
		
		// Converts stream into reader from console
		Reader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		System.out.println("Enter your name : ");
		String username = br.readLine();
		
		System.out.println("Enter Password");
		String password = br.readLine();
		
		System.out.println("********************");
		System.out.println("Username :  " + username);
		System.out.println("Password :  " + password);
		System.out.println("********************");
		
		br.close();
	}
}
