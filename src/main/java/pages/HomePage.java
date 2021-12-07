package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonMethods;

public class HomePage {
	CommonMethods obj_CommonMethods=new CommonMethods();
	public HomePage(WebDriver wd) {
		PageFactory.initElements(wd, this);
		
	}

	@FindBy(xpath = "//a[contains(text(),'Selenium Example Page')]")	
	WebElement link_Selenium_Example_Page;
	
	public void click_Selenium_Example_Page() {
		
	obj_CommonMethods.element_Click(link_Selenium_Example_Page);	
	}
}
