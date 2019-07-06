package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class LanguageActions {
	HrmElements language;
	
	public LanguageActions() {
		this.language = new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, language);
	}
	public String Webpage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		
		String tittle = HrmDrivers.driver.getTitle();
				return tittle;
	}
	public void langbutton() {
		language.languagebutton.click();
	}
	public boolean page() {
		//validation;
		return language.confirm.isDisplayed();
	}

}