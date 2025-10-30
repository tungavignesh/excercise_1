package Com.Gmail.Users.StepDef;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Com.Gmail.Users.Pages.UserInteractions3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginTable {

	WebDriver driver=Hooks.driver;
	ExtentTest Test=Hooks.test;
	UserInteractions3 lm;
//	Base base;
	@Given("table login page")
	public void login_page() {
		driver.get("https://demo.guru99.com/test/newtours/");

		lm=new UserInteractions3(driver, Test);
	}

	@And("enter {string} and {string}")
	public void enter(String s1,String s2) {
		lm.enterdetails(s1, s2);
	}

	@And("table click sigin")
	public void click_sigin() {
		lm.sigin();
	}
	@Then("table check correct navigation {string}")
	public void check_correct_navigation(String s1) {
		lm.navigation(s1);
	}

}
