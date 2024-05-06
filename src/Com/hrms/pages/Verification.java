package Com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Com.Utilitys.Log;
import Com.utility.Baseclass;

public class Verification extends Baseclass {
	
	public static void Verify(String Title1) {
		
	if(driver.getTitle().equals("Title1")) {
		System.out.println("title matched");
		Reporter.log("title match");
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
		Reporter.log("title not match");
	    Log.info("Verification");

	}
		
	}
	
}
