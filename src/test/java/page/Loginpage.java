package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class Loginpage {
	@FindBy (id="email")
	WebElement username;
	@FindBy (id="password")
	WebElement password;
	@FindBy (id="send2")
	WebElement btnlogin;
	public Loginpage() {
	 PageFactory.initElements(Config.driver, this);
	}
	public void connect (String name, String pwd) throws InterruptedException {
		username.sendKeys(name);
		Thread.sleep(4000);
		password.sendKeys(pwd);
		btnlogin.click();
	}		
}
