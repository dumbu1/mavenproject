package myHooks;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.CommonMethods;

public class WritingData {
@Parameters({"browser","url"})
@Test
public void enterDataInPropertyFile(String browser,String url) {
		CommonMethods obj_CommonMethods=new CommonMethods();
		
		String path=System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties";
		
		obj_CommonMethods.enterBrowserUrlInPropertyFile(path, browser, url);
		
	}

}
