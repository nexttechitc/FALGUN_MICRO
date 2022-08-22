package demoblaze.com.action;

import demoblaze.com.locator.homepageLocatordm;
import demoblaze.com.utility.basedm_class;

public class homepageActiondm extends basedm_class {
	
	homepageLocatordm HomepageLocatorobj = new homepageLocatordm();

	//method name has to be same name as cucumber case step name
	public void clickloginbuttondm() {
		
		HomepageLocatorobj.LoginLinkdm.click();
		
		
	}
	 
	
	
	
	
}
