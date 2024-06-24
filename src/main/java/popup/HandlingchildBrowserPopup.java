package popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingchildBrowserPopup {

static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		
		String pw = driver.getWindowHandle();
		Set <String> Wns = driver.getWindowHandles();
		
		int count = Wns.size();
		System.out.println(count);
		for(String W:Wns) {
			driver.switchTo().window(W);
			driver.close();
		}
	} 
	
	
}
