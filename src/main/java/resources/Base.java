package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//resources//data.properties");
		// "/Users/faatima/eclipse-workspace/DemoWorkspace/global-kinetic-web/src/main/java/resources/data.properties");

		prop.load(fis);
		// String browserName = "chrome";
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "//Users//faatimabismilla//Documents//chromedriver");

			String path = System.getProperty("user.dir"); // return project folder path

			String driverpath = path + "//libs//chromedriver"; // return driver folder path

			System.setProperty("webdriver.chrome.driver", driverpath);

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public void getScreenshot(String result) throws IOException {
		// File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new File("C://test//" + result + "screenshot.png"));
		// // put correct file path in mac ??

	}

}
