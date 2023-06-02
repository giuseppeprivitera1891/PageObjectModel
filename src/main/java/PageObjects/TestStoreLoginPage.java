package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestStoreLoginPage {
	WebDriver driver;

	public TestStoreLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.cssSelector("section input[name='email']");
	By password = By.cssSelector("input[name='password']");
	By loginBtn = By.cssSelector("button#submit-login");
}
