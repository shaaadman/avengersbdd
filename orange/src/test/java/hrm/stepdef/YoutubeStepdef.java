package hrm.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.YoutubeActions;

public class YoutubeStepdef {
	
	YoutubeActions Active = new YoutubeActions();
	

@Given("^I open Chrome and go to OrangeHrm homepage$")
public void i_open_Chrome_and_go_to_OrangeHrm_homepage(){
	Active.Youtubepage();
 
}

@When("^I click on the Youtube icon$")
public void i_click_on_the_Youtube_icon(){
	Active.Ytube();
  
}

@Then("^I should arrive at Youtube page$")
public void i_should_arrive_at_Youtube_page(){
	Active.Home();
}


}
