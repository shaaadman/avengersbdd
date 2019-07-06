package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class TrialActions {

	HrmElements TrialTest;
	
	public TrialActions() {
		this.TrialTest = new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, TrialTest);
	}
	public String Trialpage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		
		String tittle = HrmDrivers.driver.getTitle();
				return tittle;
	}
	public void trials() {
		TrialTest.trialbutton.click();
	}
	public boolean check() {
		
		return TrialTest.checkbox.isDisplayed();
	}

}

