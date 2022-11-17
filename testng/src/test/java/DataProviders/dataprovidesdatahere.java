package DataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataprovidesdatahere {

	@DataProvider(name = "sacedata")
	
	public Object[][] dataset(Method m)
	{
		
	Object[][] testdata =null;
	
	if(m.getName().equals("dataprovidersprac"))
	{
		testdata = new Object[][]
		//return new Object[][]                       //secondmethod 
		{
	{"standard_user","secret_sauce"},
	{"locked_out_user","secret_sauce"},
	{"problem_user","secret_sauce"},
	{"performance_glitch_user","secret_sauce"},
		};
	}
		
		else if(m.getName().equals("three"))
		{
			testdata = new Object[][]
		
	
			{
				{"standard_user","secret_sauce","456"},
				{"locked_out_user","secret_sauce","546"},
				{"problem_user","secret_sauce","789"},
				{"performance_glitch_user","secret_sauce","789"},
					};
			
					
	
	}
	return testdata;
	}
}


