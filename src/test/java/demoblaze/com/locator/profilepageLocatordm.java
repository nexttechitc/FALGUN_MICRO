package demoblaze.com.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import demoblaze.com.utility.basedm_class;

public class profilepageLocatordm extends basedm_class {
	
	
public profilepageLocatordm () {
		
		PageFactory.initElements(driver,this);   
	}
	
	@FindBy(how=How.ID,using="nameofuser")
	public WebElement profiledm;

}
