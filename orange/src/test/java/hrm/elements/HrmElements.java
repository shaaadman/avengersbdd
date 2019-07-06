package hrm.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HrmElements {

	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[1]/li[1]/a")
	public WebElement featureButton;
	
	
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/h4")
	
	public WebElement text;
	
	@FindBy(css = "#header-navbar > ul.nav.navbar-nav.navbar-right.extended-nav > li.lang-nav.esp-nav > a")
	public WebElement languagebutton;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/a")
	public WebElement confirm;
	
	@FindBy(xpath = "/html/body/footer/div[2]/div/div/div[5]/ul/li[4]/a")
	public WebElement icon;
	
	@FindBy(xpath = "//*[@id=\"tabsContent\"]/paper-tab[1]/div")
	public WebElement confirmation;
	
	@FindBy(xpath = "/html/body/div[7]/div/div/div/div[2]/a")
	public WebElement downloadtip;
	
	@FindBy(xpath = "//*[@id=\"firstname-027eb1c5-2562-4050-89e0-72101ad5b695_8129\"]")
	public WebElement gettip;
	
	
	@FindBy(xpath = "/html/body/footer/div[2]/div/div/div[2]/ul/li[4]/a")
	public WebElement career;
	
	@FindBy(xpath = "//*[@id=\"vacancy_79\"]/div[1]/span[1]")
	public WebElement qa;
	
	@FindBy(xpath = "//*[@id=\"vacancy_79\"]/div[2]/div[1]/a")
	public WebElement apply;
	
	@FindBy(xpath = "//*[@id=\"applicationForm_resume\"]")
	public WebElement resumes;
	
	@FindBy(css = "#header-navbar > ul.nav.navbar-nav.navbar-left.default-nav > li:nth-child(3) > a")
	public WebElement story;
	
	@FindBy(css = "#services > div.row > div > div.services-description > p:nth-child(3) > video")
	public WebElement success;
	
	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[2]/li[1]/a")
	public WebElement contactsales;

	@FindBy(xpath = "//*[@id=\"firstname-40929fcd-ed29-4e47-af56-dc8899a6898a\"]")
	public WebElement name;
	
	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[1]/li[4]/a")
	public WebElement partners;
	@FindBy(css = "body > div.container-fluid.modular-block.modern-partner-page.no-padding > div.container.work-together > div > div.col-lg-6.col-xs-12 > figure > img")
	public WebElement handshake;
	
	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[1]/li[5]/a")
	public WebElement blog;
	@FindBy(css = "#cat-chooser")
	public WebElement categories;
	
	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[2]/li[2]/a")
	public WebElement trialbutton;
	@FindBy(id= "Form_submitForm_SetDummyData")
	public WebElement checkbox;
}
