package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xandycoordinatesoftextbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		WebElement user = driver.findElement(By.name("email"));
		int h = user.getSize().height;
		System.out.println("Height of the textbox is  "+h);
		int w = user.getSize().width;
		System.out.println("Width of the textbox is  "+w);

		
	}

}
