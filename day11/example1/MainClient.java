package day11.example1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MainClient {
	public static void main(String[] args) throws Exception {
		
		Socket client = new Socket("127.0.0.1", 5000);
		
		OutputStream os = client.getOutputStream();
		DataOutputStream out = new DataOutputStream(os);
		
		// PASSING MESSAGE TO SERVER
		out.writeUTF("Hello World!!!");
	}
}
