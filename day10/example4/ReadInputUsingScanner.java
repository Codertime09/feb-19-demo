package day10.example4;

import java.util.Scanner;

public class ReadInputUsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name - ");
		String name = sc.nextLine();
		
		System.out.println("Enter Age - ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Password - ");
		String password = sc.nextLine();
		
		System.out.println("********************");
		System.out.println("Name - " + name);
		System.out.println("Age - " + age);
		System.out.println("Password - " + password);
		System.out.println("********************");
		
		
		sc.close();
	}
}
