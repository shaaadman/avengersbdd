package hrm.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.TipSheetActions;

public class TipSheetStepdef {
	TipSheetActions Operations = new TipSheetActions();
	
	@Given("^I am on OrangeHRM homepage$")
	public void i_am_on_OrangeHRM_homepage(){
		Operations.Tippage();

	}

	@When("^I click on Download Tip Sheet$")
	public void i_click_on_Download_Tip_Sheet(){
		Operations.dwnload();
	 
	}

	@Then("^I see a file downloaded$")
	public void i_see_a_file_downloaded(){
		Operations.gettips();
	}

}
