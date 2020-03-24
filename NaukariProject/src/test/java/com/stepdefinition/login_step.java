package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Login_Main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_step {
	WebDriver driver;
	Login_Main lo=new Login_Main(driver);
	@Given("^user launched the chrome browser$")
	public void user_launched_the_chrome_browser() throws Throwable {
		 lo.launchChrome();
	   
	}

	@When("^user opens naukri homepage$")
	public void user_opens_naukri_homepage() throws Throwable {
		 lo.url();
	}

	@Then("^user clicks login$")
	public void user_clicks_login() throws Throwable {
		 lo.loginn();
	}
}

