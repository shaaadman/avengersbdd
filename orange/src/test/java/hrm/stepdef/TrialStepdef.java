package hrm.stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.TrialActions;

public class TrialStepdef {
	TrialActions trial = new TrialActions();
	
	
	@When("^I click on the trial button$")
	public void i_click_on_the_trial_button(){
		trial.Trialpage();
	}

	@Then("^I should check the checkbox$")
	public void i_should_check_the_checkbox(){
		trial.trials();

	}


}
