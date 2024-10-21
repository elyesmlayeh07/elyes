package helper;

import org.openqa.selenium.WebDriver;

public class Config {
	public static WebDriver driver;
	public static void confchrom() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
	}
	public static void maximisewindow () {
		driver.manage().window().maximize();
	}

}
