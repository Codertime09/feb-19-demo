import java.io.DataInputStream;

public class Demo {
	public static void main(String[] args) throws Exception{
		
		
		
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Name : ");
        String name = dis.readUTF();
        dis.readChar();
        System.out.println(name);
        
        System.out.println("Enter Id : ");
        long id = dis.readLong();
        dis.readChar();
        System.out.println(id);
		
	}
}