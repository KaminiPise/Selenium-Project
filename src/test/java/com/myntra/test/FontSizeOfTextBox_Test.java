package com.myntra.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import practice.Utils;


public class FontSizeOfTextBox_Test extends Utils{
	
	@Test
	public void TextBoxTest() throws InterruptedException {

		WebElement UN = driver.findElement(By.name("email"));
		UN.sendKeys("admin");
		String FS=UN.getCssValue("font-size");
		System.out.println(FS);


}
}