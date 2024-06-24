package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenMyntraclickHomeandliving {

	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver =	new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.myntra.com");
	driver.findElement(By.linkText("Home & Living")).click();
	
	
		
	}

}
