package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActitimeprog1 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver =	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://integrator.actitime.com/auth/at");	
		driver.findElement(By.name("actiTimeUrl")).sendKeys("manager");
		driver.findElement(By.name("username")).sendKeys("manager1");
		driver.findElement(By.name("password")).sendKeys("admin");
//		driver.findElement(By.className("_2m183 _2E5C_")).click();
		Thread.sleep(2000);
		String aTitle = driver.getTitle();
		String eTitle = ("Login");
		Thread.sleep(2000);
		if(aTitle.equals(eTitle))
		{
			System.out.println("pass");
		
		}
		else
		{
			System.out.println("fail");

		}
	}

}
