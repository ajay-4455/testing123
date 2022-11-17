package test1;

import java.rmi.server.Operation;
import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int numb1 =scanner.nextInt();

		System.out.println("Enter Second Number");
		int numb2 =scanner.nextInt();

		System.out.println("Enter target Operation");
		String operation =scanner.next();
		int result=0;
		switch(operation) {

		case "+":
			result= numb1 + numb2;
			break;

		case "-":
			result= numb1- numb2;
			break;

		case "*":
			result= numb1* numb2;
			break;

		case "%":
			result= numb1% numb2;
			break;

		default:
			System.out.println("incorrect operation");
			System.out.println(result);
			scanner.close();


		}
	}
}
















