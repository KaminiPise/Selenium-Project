package com.myntra.page;

import org.testng.Reporter;
import java.time.Duration;

public class Myntra_Operations extends Utils {
	public void LoginPage() throws InterruptedException {
	openBrowser("chrome", "https://www.makemytrip.com/");
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	String ExpectedTitle = ("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
	if (ActualTitle.equals(ExpectedTitle)) {
		System.out.println("====Login Page Verification Passed====");
		Reporter.log("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
	} else {
		System.out.println("====Login Page Verification Failed====");
	}

	Thread.sleep(30000);
}
	
	
}
	
	
	

