package granadilla;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.GetCoverWebPF;
import pageObjects.LoginPage;
import resources.Browsers;

public class GetCoverWeb extends Browsers {

	public static Logger log = LogManager.getLogger(Browsers.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test // (dataProvider="getData")

	public void basePageNavigation() throws IOException, InterruptedException {

		String Username = "841111111";
		String Password = "9535";

		// one is inheritance
//WebDriverWait wait = new WebDriverWait(driver, 50);
		
		
		// creating object to that class and invoke methods of it
		driver.get("http://getcover-dev.caramelcoffee.co.za");
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("name"); //can delete session cookies etc check what is needed 
		LoginPage login = new LoginPage(driver);
		GetCoverWebPF getCover = new GetCoverWebPF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		login.BtnClick.click();
		log.info("Located sign in button");
		System.out.println("Located Sign in button");

		login.enterPhoneNumber.sendKeys(Username);

		js.executeScript("window.scrollBy(0,600)");
		login.BtnClick.click();
		System.out.println("Located Continue button");
		// login.enterPhoneNumber().sendKeys(Keys.RETURN);

		login.enterPassword.sendKeys(Password);
		js.executeScript("window.scrollBy(0,600)");
		login.BtnClick.click();
		System.out.println("Located Continue button2");

		// login.enterPassword().sendKeys(Keys.RETURN);
		login.enterOtp1.sendKeys("1");
		login.enterOtp2.sendKeys("2");
		login.enterOtp3.sendKeys("3");
		login.enterOtp4.sendKeys("4");
		login.enterOtp5.sendKeys("5");
		login.enterOtp6.sendKeys("6");

		login.BtnClick.click();
		System.out.println("Logged in successfully");
		WebDriverWait wait=new WebDriverWait(driver, 10); 
			Thread.sleep(3000);
			//js.executeScript("document.body.style.zoom='67%'");
			
		//	driver.findElement(By.id("granadilla-img")).click();
			js.executeScript("window.scrollBy(0,600)");
			//driver.findElement(By.xpath("//img[@src='/static/media/coverEmpty.a6d08950.png']")).click();
			System.out.println("scroll ");
			
			driver.findElement(By.cssSelector("#granadilla-button")).click();
			
			
			//driver.findElement(By.xpath("//div[2]//div[1]//div[3]//div[1]//p[1]//span[1]//span[1]")).click();
			// driver.findElement(By.xpath("//div[2]//div[1]//div[3]//div[1]//p[1]//span[1]//span[2]")).click();
			System.out.println("clicked");
			 
			 
		/*boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("granadilla-button")));
		if(invisible) {
			
			WebElement element = driver.findElement(By.xpath("//span[@class='open-btn-text']"));
			element.click();
		}*/
		
	   //driver.findElement(By.xpath("//span[@class='open-btn-text']"));
		
	    
	    
	   
		
	    
	    login.BtnClick.click();
		
        
        
	    driver.findElement(By.xpath("//span[contains(text(),'PAST')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getCover.home.click();
		getCover.singleFilledBtn.click();
		getCover.tv.click();
		getCover.filledBtn.click();
		getCover.enterValue.sendKeys("6000");
		getCover.singleFilledBtn.click();
		getCover.laterBtn.click();
		getCover.enterValue.click();
		getCover.dateNowBtn.click();
		getCover.filledBtn.click();
		getCover.radioBtnAgree.click();
		getCover.dueNowBtn.click();
		
		

		// log.info(text);

		// lp.getLogin().click();

	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver = null;

	}

	/*
	 * @DataProvider public Object[][] getData() { // Row stands for how many
	 * different data types test should run //coloumn stands for how many values per
	 * each test
	 * 
	 * // Array size is 2 // 0,1 Object[][] data=new Object[2][3]; //0th row
	 * data[0][0]="nonrestricteduser@qw.com"; data[0][1]="123456";
	 * data[0][2]="Restrcited User"; //1st row data[1][0]="restricteduser@qw.com";
	 * data[1][1]="456788"; data[1][2]= "Non restricted user";
	 * 
	 * return data; }
	 */

}
