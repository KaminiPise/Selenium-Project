package com.myntra.page;



import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Utils {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "./driver/gickodriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	}

	public static WebDriver driver;

	public static void openBrowser(String sbrowser, String serverURL) {

		if (sbrowser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get(serverURL);
			System.out.println("chrome browser opened sucessfully");
			Reporter.log("chrome browser opened sucessfully and connected to given Url");
		} else if (sbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("firefox browser opened sucessfully");
			Reporter.log("firefox driver opened sucessfully and connected to given Url");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get(sbrowser);

		} else {
			System.out.println("Please Enter Correct Browser");
			Assert.fail();
			Reporter.log("Please Enter Correct Browser");
		}

	}




	@AfterMethod
	public void closeApplication() {
		Reporter.log("closing The Browser.....");
	}

}
