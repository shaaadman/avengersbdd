package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class TipSheetActions {
	HrmElements Testsheet;
	
	public TipSheetActions() {
		this.Testsheet= new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, Testsheet);
	}
	public String Tippage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		String tittle = HrmDrivers.driver.getTitle();
		return tittle;
	}
	public void dwnload() {
		Testsheet.downloadtip.click();
	}
	public boolean gettips() {
		return Testsheet.gettip.isDisplayed();
	}

}
