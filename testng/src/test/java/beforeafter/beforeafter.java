package beforeafter;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class beforeafter {
	
	@BeforeClass
	public void method1() {
		
		System.out.println("hello this is Ajay Reddy");
	}
	
	@AfterClass
	public void method2() {
		System.out.println("hello this is shree");
	}

	@Test
	public void method3() {
		System.out.println("testing 3");
	}
}
