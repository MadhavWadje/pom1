package Com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Com.Utilitys.Log;
import Com.utility.Baseclass;


public class Addpage extends Baseclass{

	static By abtn = By.xpath("//input[@value='Add']");
	static By txtfn =  By.name("txtEmpFirstName");
	static By txtln = By.name("txtEmpLastName");
	static By svbtn = By.id("btnEdit");
	static By bckbtn = By.xpath("//input[@value='Back']");

	public static void add(String fn,String ln) {
		driver.switchTo().frame("rightMenu");
		driver.findElement(abtn).click();
	    driver.findElement(txtfn).sendKeys(fn);
	    driver.findElement(txtln).sendKeys(ln);
	    
	  WebElement fileinput=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
      fileinput.sendKeys("C:\\Users\\dell\\Pictures\\minimize.PNG");
	    
	    driver.findElement(svbtn).click();
	    driver.findElement(bckbtn).click();

	  //  driver.switchTo().defaultContent();
	    Reporter.log("add complete");
	    Log.info("Add");
	}
	
}
