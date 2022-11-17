package multidimentialarray;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arraysize =sc.nextInt();
	
		int x [][]=new int[arraysize][arraysize];
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
		{
			
			System.out.println("enter the values in array");
			x[i][j]=sc.nextInt();

			/*
			 * System.out.println("print values in array"); System.out.println(x[i][j]);
			 */
			
		}
	}
}



