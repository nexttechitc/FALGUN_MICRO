package demoblaze.com.Testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import demoblaze.com.utility.basedm_class;

@CucumberOptions(
		features = { "src/test/resources/FeatureAll"}, // "feature-- --folders path[not feature file path]. from properties
		plugin = { "json:target/cucumber.json" },
				glue= {"stepDefinitiondm"}) // step definition package name. --go to step def package. rc --refactor--rename--copy name


public class demoTestrunnerclass extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void stdmur() {
		basedm_class test1 = new basedm_class();
		test1.initializeBrowser();
	}
	@AfterTest
	public void cldmurl() {
		basedm_class test1 =new basedm_class();
		
		test1.driver.quit();
		
	}

}
