package skiptestcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skip {

	Boolean Setup = true;  // condition based exception
	
	@Test(enabled=false)
	public void skiptestcase() {
		System.out.println("skipping this test case by enable");
	}
	
	@Test
	public void skiptestcase1() {
		throw new SkipException("casualy skiping");
	
	}
	
	@Test
	public void skiptestcase2() {                 //condition based skip
		if(Setup==true) {
			System.out.println("test running");
		}
		else {
			System.out.println("it should skip");
			throw new SkipException("justtesting");
		}
	}
}