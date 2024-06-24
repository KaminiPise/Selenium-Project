package practice_operations;

import org.testng.Reporter;

import practice.Utils;
import java.time.Duration;

public class FontSizeOfTextbox_operation extends Utils{

	public void TextBoxSize() throws InterruptedException {
		openBrowser("chrome", "https://www.facebook.com");
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = ("actiTIME - Time Tracking Software for Cost-Effective Projects");
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("====Login Page Verification Passed====");
			Reporter.log("actiTIME - Time Tracking Software for Cost-Effective Projects");
		} else {
			System.out.println("====Login Page Verification Failed====");
		}

		Thread.sleep(30000);
	}
}