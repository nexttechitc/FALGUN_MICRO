package demoblaze.com.action;

import org.testng.Assert;

import demoblaze.com.locator.profilepageLocatordm;
import demoblaze.com.utility.basedm_class;

public class profilepageActiondm extends basedm_class{
	
	profilepageLocatordm ProfilepageLocatordm = new profilepageLocatordm();
	
	public void verifyuserloginsuccessfullydmprofilepage() throws InterruptedException {
		boolean profilepagedm = ProfilepageLocatordm.profiledm.isDisplayed();
		Assert.assertTrue(profilepagedm);
		Thread.sleep(3000);
		
		
		
	}
	
	
}
