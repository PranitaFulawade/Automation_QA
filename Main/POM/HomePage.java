package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Utils {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	By editBtn = By.xpath("//h5[text()='Edit']");

	public HomePage clickOnEditBtn() {
		driver.findElement(editBtn).click();
		return this;
	}
}
