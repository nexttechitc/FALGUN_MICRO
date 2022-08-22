package demoblaze.com.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import demoblaze.com.utility.basedm_class;

public class homepageLocatordm extends basedm_class{

	public homepageLocatordm () {
		
		PageFactory.initElements(driver,this);   //pagefactory we import from selenium
	}
	
	@FindBy(how=How.ID,using="login2")
	public WebElement LoginLinkdm;
	
	
}
