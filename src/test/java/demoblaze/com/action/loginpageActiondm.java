package demoblaze.com.action;

import demoblaze.com.locator.loginpageLocatordm;
import demoblaze.com.utility.basedm_class;


public class loginpageActiondm extends basedm_class{
	loginpageLocatordm LoginpageLocatorsdm = new loginpageLocatordm();

public void UserCredential 	(String us, String ps) throws InterruptedException {
	
	LoginpageLocatorsdm.enteruser.sendKeys("us");
	LoginpageLocatorsdm.enterpass.sendKeys("ps");
	
	Thread.sleep(3000);
	LoginpageLocatorsdm.enterclicklogin.click();
	
}

}

