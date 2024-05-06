package Com.hrms.pages;

import org.openqa.selenium.By;

import Com.Utilitys.Log;
import Com.utility.Baseclass;

public class Logoutpage extends Baseclass{

	static By logoutbtn = By.linkText("Logout");
	
	public static void logout() {
		driver.findElement(logoutbtn).click();
	    Log.info("Logout");

	}
	
}
