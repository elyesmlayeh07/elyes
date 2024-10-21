package testsuit;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Loginpage;

public class Loginstepdef {
	@Given("admin is in login page")
	public void admin_is_in_login_page() {
	   Config.driver=new ChromeDriver();
	   Config.confchrom();
	   Config.maximisewindow();
	   String url = "https://www.mytek.tn/customer/account/login/referer/aHR0cHM6Ly93d3cubXl0ZWsudG4vY3VzdG9tZXIvYWNjb3VudC9sb2dvdXRTdWNjZXNzLw~~/";
	   Config.driver.get(url);
	}

	@When("admin enter correct user name and correct password")
	public void admin_enter_correct_user_name_and_correct_password() throws Exception {
	 Loginpage page=new Loginpage ();
	 page.connect("bbounguicha3@gmail.com", "Proservice");
	}

	@Then("admin is directed to the home page")
	public void admin_is_directed_to_the_home_page() {
	    
	}
}
