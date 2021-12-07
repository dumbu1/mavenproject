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
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement text_Form_Elements;
	
	@FindBy(xpath = "//textarea[@name='textarea']")
	WebElement text_TextArea;
	
	@FindBy(xpath = "//input[@id='submitbtn']")
	WebElement button_Submit;

	
	public void enterData_Form_Elements(String text) {
		obj_CommonMethods.enterData(text_Form_Elements, text);
		
	}
	
	public void enterData_Text_Area(String text) {
		obj_CommonMethods.enterData(text_TextArea, text);
		
	}
	
	public void click_Submit() {
		obj_CommonMethods.element_Click(button_Submit);
	}
}
