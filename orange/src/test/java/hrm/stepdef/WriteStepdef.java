package hrm.stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.WriteActions;

public class WriteStepdef {
	
	WriteActions write = new WriteActions();
	
	@When("^I click on Contact Sales$")
	public void i_click_on_Contact_Sales(){
		write.Writepage();
	}

	@When("^I click on First Name textbox$")
	public void i_click_on_First_Name_textbox(){
		write.contacts();
		

	}

	@Then("^I can write my name$")
	public void i_can_write_my_name(){
		write.names();

	}


}
