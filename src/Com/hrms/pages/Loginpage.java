package Com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Com.Utilitys.Log;
import Com.utility.Baseclass;

public class Loginpage extends Baseclass{
//objectives
	static By txtun = By.name("txtUserName");	
	static By txtpw = By.name("txtPassword");	
	static By loginbtn = By.name("Submit");
	
	
//functions
	public static void login(String un,String pw) {
		driver.findElement(txtun).sendKeys(un);
		driver.findElement(txtpw).sendKeys(pw);
		driver.findElement(loginbtn).click();
		Reporter.log("login complete");
	    Log.info("Login");

	}
	
	
}
