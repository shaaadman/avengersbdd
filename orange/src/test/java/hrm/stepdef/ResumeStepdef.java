package hrm.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.ResumeActions;

public class ResumeStepdef {
	ResumeActions Operate = new ResumeActions();
	
	@Given("^I am on OrangeHrm homepage$")
	public void i_am_on_OrangeHrm_homepage(){
		Operate.Resumepage();
	}
	@When("^I click on careers$")
	public void i_click_on_careers(){
		Operate.careerlink();

	}

	@When("^I click on a job posting$")
	public void i_click_on_a_job_posting(){
		Operate.qalink();

	}

	@When("^I click on apply$")
	public void i_click_on_apply(){
		Operate.applybutton();

	}

	@Then("^I should see option to upload resume$")
	public void i_should_see_option_to_upload_resume(){
		Operate.resumeup();
	 
	}

}
