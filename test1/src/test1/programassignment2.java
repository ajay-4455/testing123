package test1;

import java.util.Scanner;

public class programassignment2 {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Result");
int result = scanner.nextInt();
if(result <35 ) {
	System.out.println("Your are Fail");
}
	
	
     else if(result ==35 ) {
		System.out.println("Your are fail");
}
     else if(result>35 &&  result<70 ) {
 		System.out.println("thrid class");
 }
     else if(result>=70 && result<85 ) {
  		System.out.println("Second class");
  }

     else if(result >85 ) {
  		System.out.println("first class");
  		scanner.close();
  }
}
}

