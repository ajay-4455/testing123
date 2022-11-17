package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Datapro {
	
	@Test(dataProvider="ajjudata")
	public void test(String username , String password) 
	{
		System.out.println(username+"======"+password);
	}
	@DataProvider(name = "ajjudata")
	public Object[][] test1(){
//	{
//		Object[][] data = new Object[4][2];
//		
//		//firstrow
//		data[0][0]="user1";
//		data[0][1]="user1";
//		
//
//		//Secondrow
//		data[1][0]="user2";
//		data[1][1]="passord2";
//
//		//Thirdrow
//		data[2][0]="user3";
//		data[2][1]="passord3";
//		
//		//Fourthrow
//		data[3][0]="user3";
//		data[3][1]="passord3";
//		
//		return data;
	

	return new Object[][] {
		
		{"username1" ,"passowrd1"},
		{"username2" ,"passowrd2"},
		{"username3" ,"passowrd3"},
		{"username4" ,"passowrd4"},
		
	};
		
}
}
