package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxDisplayedornot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver =	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
		
		WebElement UN = driver.findElement(By.name("email"));
		if(UN.isDisplayed())
		
		{
			System.out.println("Textbox displayed");
		}
		else
		{
		
			System.out.println("Textbox not displayed");

		}
		
	}

}
