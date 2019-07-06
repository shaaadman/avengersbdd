package hrm.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.LanguageActions;

public class LangStepdeff {
	LanguageActions langactions = new LanguageActions();
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() {
		langactions.Webpage();
	}

	@When("^I click the provided language change button$")
	public void i_click_the_provided_language_change_button() {
		langactions.langbutton();
	   
	}

	@Then("^I should see the page translated$")
	public void i_should_see_the_page_translated(){
		langactions.langbutton();
	   
	}

}
