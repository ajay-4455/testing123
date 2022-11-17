package basicsestng;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicsoftestng {
	
	@Test(priority = 3)
	public void method1() {
		
		System.out.println("hello this is Ajay Reddy");
	}
	
	@Test(priority = 2)
	public void method2() {
		System.out.println("hello this is shree");
	}

	@Test(priority = 1,description = "sucess")
	public void method3() {
		System.out.println("testing 3");
	}
}
