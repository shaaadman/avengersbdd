package hrm.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.HrmHitsActions;
import junit.framework.Assert;

public class HrmHitsStepdef {
	HrmHitsActions Actions = new HrmHitsActions();
	
	@Given("^I on the homepage$")
	public void i_on_the_homepage()  {
		Actions.Webpage();
	    
	}

	@When("^I press on provided link$")
	public void i_press_on_provided_link() {
	  
		Actions.feature();
		
		
	}

	@Then("^I should see the feature page$")
	public void i_should_see_the_feature_page() {
	    Actions.feature();
	}


	
	
	

}
