package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class ResumeActions {
	HrmElements Testresume;
	
	public ResumeActions() {
		this.Testresume = new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, Testresume);
	}
	public String Resumepage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		String title = HrmDrivers.driver.getTitle();
		return title;
		
	}
	public void careerlink() {
		Testresume.career.click();
	}
	public void qalink() {
		Testresume.qa.click();
	}
	public void applybutton() {
		Testresume.apply.click();
	}
	public boolean resumeup() {
		return Testresume.resumes.isDisplayed();
	}

}
