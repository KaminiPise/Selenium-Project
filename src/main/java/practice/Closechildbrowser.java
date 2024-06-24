package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closechildbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver =	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.Naukri.com");
		Set<String> WHs= driver.getWindowHandles();
		int count = WHs.size();
		System.out.println(count);
		for(String W:WHs)
		{
			driver.switchTo().window(W);
			String S = driver.getTitle();
			if(S.contains("croma"));
			driver.close();
				
		}
	}

}
