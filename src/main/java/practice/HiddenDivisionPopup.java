package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver =	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.Flipkart.com");
		driver.switchTo().getClass();
		driver.findElement(By.xpath("input[@class='_2IX2- VJZDxU']")).sendKeys("selenium");
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	}

}
