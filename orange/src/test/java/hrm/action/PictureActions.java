package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class PictureActions {
	
HrmElements PicTest;
	
	public PictureActions() {
		this.PicTest= new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, PicTest);
			
	}
	public String Webpage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		
		String tittle = HrmDrivers.driver.getTitle();
		return tittle; 

}
	public void partner() {
		PicTest.partners.click();
}
	public boolean image() {
		return PicTest.handshake.isDisplayed();
	}
	}