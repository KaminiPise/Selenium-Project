package practice;

import java.io.IOException;
import java.lang.annotation.Target;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopupprog1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver =	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.findElement(By.name("actiTimeUrl")).sendKeys("ABC");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Manager");
		driver.findElement(By.className("_2m183 _2E5C_")).click();
		WebDriverWait wait = new WebDriverWait(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='context administration']")));
		driver.findElement(By.xpath("//a[@text()='Logo & Color Scheme']"));
		driver.findElement(By.id("upload New Logo Option")).click();
		driver.findElement(By.id("form Modified Div Button")).click();
		TargetLocator S= driver.switchTo();
		Alert al = S.alert();
		String alertText = al.getText();
		System.out.println(alertText);
		al.dismiss();

	}

}
