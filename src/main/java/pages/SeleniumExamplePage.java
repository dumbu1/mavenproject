package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonMethods;

public class SeleniumExamplePage {
  CommonMethods obj_CommonMethods=new CommonMethods();
	public SeleniumExamplePage(WebDriver wd) {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath = "//body/div[1]/form[1]/input[1]")
	WebElement link_SeleniumExamplePage;

	
	public void enterData(String text) {
		obj_CommonMethods.sendingDataOnThePage(link_SeleniumExamplePage, text);
		
	}
}
