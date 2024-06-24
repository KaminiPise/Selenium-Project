package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadpopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.Actitime.com");
WebElement Linktext = driver.findElement(By.xpath("//a[@target='_blank']"));
Linktext.click();
String pw = driver.getWindowHandle();
Set <String> tab = driver.getWindowHandles();
int count = tab.size();
System.out.println(count);
for(String tab1:tabs)
{
driver.switchTo().window(tab1);
if(pw.equals(tab1))
{
String PtabTitle = driver.getTitle();
System.out.println("parent tab title is "+PtabTitle);
}
else
{
String ctabTitle = 	driver.getTitle();
System.out.println("child tab title is "+ctabTitle);
}
Actions action = new Actions(driver);
WebElement hcTab = driver.findElement(By.xpath("//a[text()='Help Center']"));
action.moveToElement(hcTab).perform();
WebElement csLink = driver.findElement(By.xpath("//a[text()='Contact support']"));
csLink.click();
int yaxis = driver.findElement(By.xpath("//label[text()='Question']")).getLocation().getY();
JavascriptExecutor jse = (JavaScriptExecutor)driver;
jse.executeScript("window.scrollTo(0 , "+yaxis+")");
String filepath = "C:\\Users\\Kamini Pise\\Desktop\\Testing material";
driver.findElement(By.id("FileUpload")).sendKeys(filepath);
}
		
		
		
	}

}
