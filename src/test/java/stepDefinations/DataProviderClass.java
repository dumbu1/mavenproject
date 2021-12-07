package stepDefinations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	

	@DataProvider(name="mm")
	public  String[] fun2() {
		
		String[] myData= {"krishna","mohan","satya"};
		return myData;
	}
	
	@Test(dataProvider = "mm" )
	public void fun1(String names) {
		System.out.println(names);
	}

}
