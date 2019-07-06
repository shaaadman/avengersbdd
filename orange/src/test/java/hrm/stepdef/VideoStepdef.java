package hrm.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hrm.action.VideoActions;

public class VideoStepdef {
	VideoActions Play = new VideoActions();
	
	@Given("^I am on homepage$")
	public void i_am_on_homepage(){
		Play.storypage();

	}

	@When("^I click on the Success Story button$")
	public void i_click_on_the_Success_Story_button(){
		Play.streamv();

	}

	@Then("^I see a video playing$")
	public void i_see_a_video_playing(){
		Play.playvideo();

	}


}
