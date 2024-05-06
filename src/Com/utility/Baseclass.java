package Com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Baseclass {

public static WebDriver driver;

public static void openapp() {
	driver = new FirefoxDriver();
	driver.get("http://183.82.103.245/nareshit/index.php");
    System.out.println("open complete");	
}
	
public static void closeapp() {
	driver.close();
	Reporter.log("close successful");

}

}



