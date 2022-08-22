package demoblaze.com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basedm_class {
	public static Properties propdm;
	public static WebDriver driver;
	
	public basedm_class() {
		propdm = new Properties();
		
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\demoblaze\\com\\configure\\cofiguredm.properties");
			 propdm.load(fls);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void initializeBrowser() {
		String browser = propdm.getProperty("Browserdm1");
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\webdriverdm\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(testdm.pageLoadTimeout,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(testdm.implicitlyWait,TimeUnit.SECONDS);
			System.out.println();
			}
		else if (browser.equals("FF"));
		
		}
	public static void geturl(String URL) {
		driver.get(propdm.getProperty("url"));
	}
	
	
			
		
	}


