package test1;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System .in);
	System.out.println("Please enter a value");
	int number =scanner.nextInt();
	if(number%2==0) {
		System.out.println("it is a even number");
	}
	else {
		System.out.println("it is a odd number");
	}
	
	scanner.close();
	}

}
