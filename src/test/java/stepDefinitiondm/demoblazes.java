package stepDefinitiondm;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import demoblaze.com.action.homepageActiondm;
import demoblaze.com.action.loginpageActiondm;
import demoblaze.com.utility.basedm_class;

public class demoblazes extends basedm_class{
	homepageActiondm HomepageActionsdm = new homepageActiondm();
	loginpageActiondm LoginpageActiondm= new loginpageActiondm();
	@Given("^Open \"([^\"]*)\" demo$")
	public void open_demo(String URL) throws Throwable {
	  geturl(URL);
	}

@Then("^navigate to login page dm$")
public void navigate_to_login_page_dm() throws Throwable {
	HomepageActionsdm.clickloginbuttondm();
}

@Then("^enter usernamme and password andclick login button dm$")
public void enter_usernamme_and_password_andclick_login_button_dm() throws Throwable {
	LoginpageActiondm.UserCredential(propdm.getProperty("username"), propdm.getProperty("password"));
}





@Then("^verify user login successfully dm$")
public void verify_user_login_successfully_dm() throws Throwable {
    
}



}
