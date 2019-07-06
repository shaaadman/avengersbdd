package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class WriteActions {
	
	HrmElements WriteTest;
	
	public WriteActions() {
		this.WriteTest= new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, WriteTest);
			
	}
	public String Writepage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		
		String tittle = HrmDrivers.driver.getTitle();
		return tittle; 
		
	}
	
	public void contacts() {
		WriteTest.contactsales.click();
		
	}
	public boolean names() {
		return WriteTest.name.isDisplayed();
		
		
		 
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
