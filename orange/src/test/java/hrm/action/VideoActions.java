package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class VideoActions {
	HrmElements videoact;
	
	public VideoActions() {
		this.videoact= new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, videoact);
	}
	public String storypage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		String tittle = HrmDrivers.driver.getTitle();
		return tittle;
	}
	public void streamv() {
		videoact.story.click();
	}
	public boolean playvideo() {
		return videoact.success.isDisplayed();
	}

}
