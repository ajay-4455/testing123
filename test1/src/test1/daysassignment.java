package test1;

import java.util.Scanner;

public class daysassignment {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the day");
String day =scanner.nextLine();
if (day.equals("Monday") ||
  day.equals("Tuesday")  ||
  day.equals("Wednesday") ||
  day.equals("Thurusday") ||
   day.equals("Friday")) 
		System.out.println("Uff its a weekday");
	else if(day.equals("Saturday") ||
	day.equals("Sunday"))
	System.out.println("its a weekedn");
scanner.close();
}	
		
}
	


