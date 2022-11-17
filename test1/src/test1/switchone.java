package test1;

import java.util.Scanner;

public class switchone {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value");
		int number =scanner.nextInt();
		int remainder=number%2;
		switch(remainder) {

		case 0:
			System.out.println("The given number is even");
			break;


		case 1:
			System.out.println("the given number is odd");
			break;
		}
		scanner.close();
	}
}