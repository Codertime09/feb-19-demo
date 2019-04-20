package day10.example6;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello World");
		sb.append("\n");
		sb.append("Hello CDAC!!");
		
		System.out.println(sb);
		
		
		String str = String.format("|%5.4s|", "Kharghar");
		System.out.println(str);
		
	}
}
