package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copyfromonetoanotherwithoutshortkeysprog5 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		WebElement user = driver.findElement(By.name("email"));
		user.sendKeys("admin");
		Thread.sleep(2000);
		user.sendKeys(Keys.CONTROL+"ac");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys(Keys.CONTROL+"v");

	}

}
