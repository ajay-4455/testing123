package test1;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Hello ,Whats your Name?");
		String name =scanner.nextLine();
		System.out.printf("Hey %s How are you Doing? \n",name);
		String Status=scanner.nextLine();
		System.out.printf("Hey %s Whats you Age? \n",name);
		int age=scanner.nextInt();
		System.out.println("Thanks for Information");
		scanner.close();
		
		
	}

}
