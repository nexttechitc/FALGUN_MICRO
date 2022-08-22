package demoblaze.com.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import demoblaze.com.utility.basedm_class;

public class loginpageLocatordm extends basedm_class {
	
public loginpageLocatordm () {
		
		PageFactory.initElements(driver,this);   //pagefactory we import from selenium
	}
	
	@FindBy(how=How.ID,using="loginusername")
	public WebElement enteruser;
	
	@FindBy(how=How.ID,using="loginpassword")
	public WebElement enterpass;
	 
	@FindBy(how=How.LINK_TEXT,using="Log in")
	public WebElement enterclicklogin;
	
	


}
