package Com.hrms.pages;

import org.openqa.selenium.By;

import Com.Utilitys.Log;
import Com.utility.Baseclass;

public class Editpage extends Baseclass {

	static By ebtn = By.name("EditMain");
	static By fn1 = By.name("txtEmpFirstName");
	static By ln1 = By.name("txtEmpLastName");
	static By svbtn = By.name("btnEdit");
	static By bcbtn = By.xpath("value=Back");
	
	
	public static void edit(String fn1,String ln1) {
		driver.switchTo().frame("rightMenu");
		driver.findElement(ebtn).click();
//		driver.findElement(fn1).clear();
//		driver.findElement(fn1).sendKeys(fn1);
//		driver.findElement(ln1).clear();
//		driver.findElement(ln1).sendKeys(fn1);
		driver.findElement(svbtn).click();
		driver.findElement(bcbtn).click();
		
	    driver.switchTo().defaultContent();
	    Log.info("Edit");

		
	}
	
	
	
	
}
