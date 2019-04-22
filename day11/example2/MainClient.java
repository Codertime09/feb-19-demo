package day11.example2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {
	public static void main(String[] args) throws Exception {
		
		while(true) {
			Socket client = new Socket("127.0.0.1", 5000);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Message");
			String msg = sc.nextLine();
			
			OutputStream os = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(os);
			
			// PASSING MESSAGE TO SERVER
			out.writeUTF(msg);
		}
		
	}
}
