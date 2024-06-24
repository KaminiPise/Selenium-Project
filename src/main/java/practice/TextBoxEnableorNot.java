package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxEnableorNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		WebElement UN = driver.findElement(By.name("email"));
		if (UN.isEnabled())
		{
			System.out.println("Textbox is Enabled");
		}
		else
		{
			System.out.println("Textbox is Disabled");

		}
		driver.findElement(By.name("email")).sendKeys("Kamini");
		System.out.println("Textbox is Enabled");

	}

}
