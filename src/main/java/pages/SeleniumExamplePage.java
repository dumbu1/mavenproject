package pages;

import java.util.List;

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
	private WebElement text_Form_Elements;
	
	@FindBy(xpath = "//textarea[@name='textarea']")
	private WebElement text_TextArea;
	
	@FindBy(xpath = "//input[@id='submitbtn']")
	private WebElement button_Submit;

	@FindBy(xpath = "//select[@id='dropdown']")
	private WebElement select_Option;
	
	public void enterData_Form_Elements(String text) {
		obj_CommonMethods.enterData(text_Form_Elements, text);
		
	}
	
	public void enterData_Text_Area(String text) {
		obj_CommonMethods.enterData(text_TextArea, text);
		
	}
	
	public void click_Submit() throws InterruptedException {
		obj_CommonMethods.element_Click(button_Submit);
	}
	
	public List<String> select_Options(){
		return obj_CommonMethods.select_Options(select_Option);
	}
}
