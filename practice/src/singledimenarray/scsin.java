package singledimenarray;

import java.util.Scanner;

public class scsin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int sizearray =sc.nextInt();
		int x[] = new int[sizearray];
		for(int i=0;i<sizearray;i++) {
			System.out.println("enter  value:");
			x[i]=sc.nextInt();
		}
		System.out.println("print array values");
		for(int i=0;i<sizearray;i++) {
			System.out.println(x[i]);
		}
	}

}
