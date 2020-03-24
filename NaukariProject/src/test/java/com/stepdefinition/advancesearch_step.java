package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Advancesearch_Main;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class advancesearch_step {
    WebDriver driver;
	Advancesearch_Main ad =new Advancesearch_Main(driver);
	
	@Given("^user launched the chromebrowser$")
	public void user_launched_the_chromebrowser() throws Throwable {
	 ad.launchChrome();
	}

	@When("^user opens naukrihomepage$")
	public void user_opens_naukrihomepage() throws Throwable {
	  ad.url();
	   ad.loginn();
	}
	@Then("^Click on jobs and move to advancesearch$")
	public void click_on_jobs_and_move_to_advancesearch() throws Throwable {
		 ad.clickonadvancesearch();
	}

	@When("^alert page is opened enter all the required fields$")
	public void alert_page_is_opened_enter_all_the_required_fields() throws Throwable {
	ad.enterdata();
	}

	@When("^click on advancesearch$")
	public void click_on_advancesearch() throws Throwable {
	   ad.advancesearch();
	}
}
