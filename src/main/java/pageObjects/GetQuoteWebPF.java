package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetQuoteWebPF {

	public WebDriver driver;

	public GetQuoteWebPF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// buttons

	@FindBy(xpath = "//span[@class='singleFilledButton']")
	public WebElement singleFilledBtn;

	@FindBy(xpath = "//span[@class='filled-btn-text']")
	public WebElement filledBtn;

	@FindBy(xpath = "//span[contains(text(),\"Let's go\")]")
	public WebElement letsGoBtn;

	@FindBy(xpath = "//span[contains(text(),\"I'll do it later\")]")
	public WebElement laterBtn;

	@FindBy(xpath = "//span[contains(text(),'Right now')]")
	public WebElement dateNowBtn;

	@FindBy(xpath = "//span[contains(text(),'Pick a date')]")
	public WebElement pickDateLaterBtn;
	@FindBy(xpath = "//span[contains(text(),'R11.48 Due Now')]")
	public WebElement dueNowBtn;
	@FindBy(xpath = "//span[@class='open-btn-text']")
	public WebElement addPaymentTypeBtn;

	@FindBy(xpath = "//h6[contains(text(),'Add a Credit Card')]")
	public WebElement addCreditCardBtn;

	@FindBy(xpath = "//span[contains(text(),'Accept')]")
	public WebElement acceptBtn;

	// Get Cover page objects

	@FindBy(xpath = "//span[@class='singleOpenButton'][1]")
	public WebElement getCoverTopLeft;

	@FindBy(xpath = "//*[contains(text(), 'Add more items')]")
	public WebElement addMoreItems;

	// Home Category

	@FindBy(xpath = "//div[contains(text(),'Home')]")
	public WebElement home;

	@FindBy(xpath = "//div[contains(text(),'TV')]")
	public WebElement tv;

	@FindBy(xpath = "//div[contains(text(),'Home Appliance')]")
	public WebElement homeAppliance;

	// Gaming Category

	@FindBy(xpath = "//div[contains(text(),'Gaming')]")
	public WebElement gaming;

	// Gadgets

	@FindBy(xpath = "//div[contains(text(),'Gadgets')]")
	public WebElement gadgets;

	// Musical Equipment

	@FindBy(xpath = "//div[contains(text(),'Musical Equipment')]")
	public WebElement musicalEquipment;

	// Cyclist

	@FindBy(xpath = "//div[contains(text(),'Cyclist')]")
	public WebElement cyclist;

	// Travel

	@FindBy(xpath = "//div[contains(text(),'Travel')]")
	public WebElement travel;

	// Jewellery

	@FindBy(xpath = "//div[contains(text(),'Jewellery')]")
	public WebElement jewellery;

	// Desktop PC

	@FindBy(xpath = "//div[contains(text(),'Desktop PC')]")
	public WebElement desktopPC;

	// tell me more about device
	@FindBy(xpath = "//input[@class='jss1705 jss1690 jss1706 jss1691']")
	public WebElement tellMeMore;

	// enter device value

	@FindBy(xpath = "//input[@class='jss1840 jss1825 jss1843 jss1828']")
	public WebElement enterValue;

	// understand policy tab

	@FindBy(xpath = "//input[@class='jss2180']")
	public WebElement radioBtnAgree;

	public WebElement radioBtnAgree() {
		return driver.findElement(By.xpath("//input[@class='jss2180']"));
	}

	// name of card

	@FindBy(xpath = "//input[@id='standard-name']")
	public WebElement cardName;

	// payment date

	@FindBy(xpath = "//div[@class='jss2610 jss2613 jss2597 jss2582']")
	public WebElement paymentDate;

	@FindBy(xpath = "//body//li[2]")
	public WebElement day2;

	@FindBy(xpath = "//input[@class='jss2633']")
	public WebElement defaultPaymentDay;

}
