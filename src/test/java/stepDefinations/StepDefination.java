package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import myHooks.MyHooks;
import pages.HomePage;
import pages.SeleniumExamplePage;


public class StepDefination {
	
	private static WebDriver wd;
	private static HomePage obj_HomePage;
	private static SeleniumExamplePage obj_SeleniumExamplePage;

	
	@Given("user is on {string} page")
	public void user_is_on_page(String expTitle) {
		
		MyHooks obj_MyHooks=new MyHooks();
		wd=obj_MyHooks.getDriver();
		
		Assert.assertEquals(wd.getTitle(), expTitle);
	   
	}

	@When("user clicks on {string} link")
	public void user_clicks_on_link(String string) {
	   obj_HomePage=new HomePage(wd);
	   obj_HomePage.click_Selenium_Example_Page();
	}

	@Then("system should display {string} page")
	public void system_should_display_page(String expTitle) {
		Assert.assertEquals(wd.getTitle(), expTitle);
	}
	
	@When("user enters {string} on form elements text box")
	public void user_enters_on_form_elements_text_box(String names1) {
	    obj_SeleniumExamplePage=new SeleniumExamplePage(wd);
	    obj_SeleniumExamplePage.enterData_Form_Elements(names1);
	}
	
	@When("user enters {string} on form elements text area")
	public void user_enters_on_form_elements_text_area(String names2) {
		obj_SeleniumExamplePage.enterData_Text_Area(names2);
	}

	@When("user clicks on {string} button")
	public void user_clicks_on_submit_button(String butName) {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   obj_SeleniumExamplePage.click_Submit();
	}


}
