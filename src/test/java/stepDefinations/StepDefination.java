package stepDefinations;

import io.cucumber.java.en.*;

public class StepDefination {
	
	
	@Given("user is on {string} page")
	public void user_is_on_page(String string) {
	   System.out.println("given");
	}

	@When("user clicks on {string} link")
	public void user_clicks_on_link(String string) {
	   System.out.println("when");
	}

	@Then("system should display {string} page")
	public void system_should_display_page(String string) {
	   System.out.println("then");
	}
	
	@When("user enters {string} on form elements text box")
	public void user_enters_on_form_elements_text_box(String string) {
	    System.out.println("when2");
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() {
	   System.out.println("when3");
	}


}
