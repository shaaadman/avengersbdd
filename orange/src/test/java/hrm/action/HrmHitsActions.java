package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class HrmHitsActions {
	//Full project completed
	HrmElements TTest;
	
	public HrmHitsActions() {
		this.TTest= new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, TTest);
			
	}
	public String Webpage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		
		String tittle = HrmDrivers.driver.getTitle();
		return tittle; 
		
	}
	
	public void feature() {
		TTest.featureButton.click();
		
	}
	public boolean text() {
		return TTest.text.isDisplayed();
		
		
		 
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
