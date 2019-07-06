package hrm.stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.CategoryActions;

public class CategoryStepdef {
	CategoryActions category = new CategoryActions();
	
	@When("^I click on Blog$")
	public void i_click_on_Blog(){
		category.Blogpage();

	}

	@Then("^I can select Development from Category$")
	public void i_can_select_Development_from_Category(){
		category.menu();

	}


}
