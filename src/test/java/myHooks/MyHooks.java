package myHooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	private static WebDriver wd;
	
	@Before(order = 1)
	public void invokeBrowser() {
		System.out.println("before1");
	}
	
	@Before(order = 2)
	public void enterUrl() {
		System.out.println("before2");
	}
	
	
	@After
	public void closeBrowser() {
		System.out.println("after");
	}
	
	
	

}
