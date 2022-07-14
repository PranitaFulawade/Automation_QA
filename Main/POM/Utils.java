package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	public WebDriver driver;
	WebDriverWait wait;
	
	public Utils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
}
