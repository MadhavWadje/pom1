package Com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Com.Utilitys.Log;
import Com.utility.Baseclass;


public class deletepage extends Baseclass {

	static By srchbx = By.xpath("//input[@value='Search']");	
	static By srchbtn =  By.xpath("//input[@value='Search']");	
	static By ckbx = By.name("chkLocID[]");
	static By dbtn =  By.xpath("//input[@value='Delete']");
	
	
	public static void delete(String ID) {
		//driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name("loc_code")));
       st.selectByVisibleText("Emp. ID");
		driver.findElement(srchbx).sendKeys(ID);
		driver.findElement(srchbtn).click();
		driver.findElement(ckbx).click();
		driver.findElement(dbtn).click();
	    driver.switchTo().defaultContent();
	    Log.info("Delete");

	}
	
}
