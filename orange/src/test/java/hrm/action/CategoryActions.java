package hrm.action;

import org.openqa.selenium.support.PageFactory;

import hrm.elements.HrmElements;
import hrm.utilities.HrmDrivers;

public class CategoryActions {
	HrmElements CatTest;
	
	public CategoryActions() {
		this.CatTest= new HrmElements();
		PageFactory.initElements(HrmDrivers.driver, CatTest);
			
	}
	public String Blogpage() {
		HrmDrivers.driver.get("https://www.orangehrm.com/");
		
		String tittle = HrmDrivers.driver.getTitle();
		return tittle; 

}
	public void blogs() {
		CatTest.blog.click();
}
	public void menu() {
	 CatTest.categories.isDisplayed();
	}
}


