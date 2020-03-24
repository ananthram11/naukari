package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.About_Main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class about_step {
	WebDriver driver;
	About_Main ab = new About_Main(driver);

	@Given("^user has launched the  chromebrowser$")
	public void user_has_launched_the_chromebrowser() throws Throwable {
		ab.launchChrome();
	}

	@When("^user has opens naukrihomepage$")
	public void user_has_opens_naukrihomepage() throws Throwable {
		ab.url();
		ab.loginn();
	}

	@Then("^scroll down to end of page and click on about us$")
	public void scroll_down_to_end_of_page_and_click_on_about_us() throws Throwable {
		ab.scrolldown();
		ab.TakeScreenshot();
	}

}

