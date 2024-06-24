package practice;

import java.awt.RenderingHints.Key;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledifferentTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver =	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.Myntra.com");
		String Ptab = driver.getWindowHandle();
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Kurtas",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		Set<String> tabs = driver.getWindowHandles();
		int count = tabs.size();
		System.out.println(count);
		for (String tab:tabs)
		{
			driver.switchTo().window(tab);
		}
		if(Ptab.equals(tab))
		{
			String S = driver.getTitle();
			System.out.println(S);
		}
		else
		{
			driver.findElement(By.xpath("//P[text()='M']/ancester::div[@class='size-buttons-buttoncontainer']")).click();
		}
	}

}
