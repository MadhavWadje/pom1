package Com.Tscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.pages.Addpage;
import Com.hrms.pages.Loginpage;
import Com.hrms.pages.Verification;
import Com.hrms.pages.deletepage;
import Com.utility.Baseclass;

public class TC001 {
//public static void main(String[] args) {
	
  @Test
  public static void pom() {
	  DOMConfigurator.configure("log4j.xml");
	Baseclass baseclass = new Baseclass();
	Baseclass.openapp();
	Verification.Verify("hrms");
	Loginpage.login("nareshit", "nareshit");
	Addpage.add("madhav","wadje");
//	Editpage.edit("4lpa","6lpa");
	deletepage.delete("0544");
	Baseclass.closeapp();
	
}
	
}

