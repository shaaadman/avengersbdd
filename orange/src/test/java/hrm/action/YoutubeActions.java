package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class YoutubeActions {
	HrmElements links;
	
	public YoutubeActions() {
		this.links = new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, links);
	}
	public String Youtubepage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		String tittle = HrmDrivers.driver.getTitle();
		return tittle;
		
	}
	public void Ytube() {
		links.icon.click();
	}
	public boolean Home() {
		return links.confirmation.isDisplayed();
	}

}
