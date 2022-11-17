package groups;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test(groups = "userregistration")
public class groups {
	
	@BeforeTest(groups ="regreession")
	public void method1() {
		
		System.out.println("hello this is Ajay Reddy");
	}
	
	@AfterTest(groups = "regression")
	public void method2() {
		System.out.println("hello this is shree");
	}

	@Test(groups = {"bvt","regression"})
	public void method3() {
		System.out.println("testing 3");
	}
	@BeforeMethod(groups = {"bvt","regression"})
	public void method4() {
		System.out.println("db connected");
	}
	@AfterMethod(groups = "private")
	public void method5() {
		System.out.println("db discconnedted");
	}
	
	@Test(groups = "private")
	public void newmethod(){
		System.out.println("new method");
	}
}
