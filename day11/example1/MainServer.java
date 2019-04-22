package day11.example1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	public static void main(String[] args) throws Exception {
		
		// START A SERVER AT PORT 5000
		ServerSocket server = new ServerSocket(5000);
		
		System.out.println("SERVER STARTED :: WAITING FOR CONNECTION");
		Socket socket = server.accept();
		
		// TRYING TO READ INPUT FROM CLIENT
		InputStream is = socket.getInputStream();
		DataInputStream input = new DataInputStream(is);
		
		// READING THE MESSAGE
		String clientMesage = input.readUTF();
		System.out.println("MSG FROM CLIENT :: " +  clientMesage);
		
		
	}
}
