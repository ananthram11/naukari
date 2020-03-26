package com.stepdefinition;

import com.pages.retrievecontact_main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class retrievecontact_step {
	retrievecontact_main rt=new retrievecontact_main();
	@Given("^user has launched the   browser$")
	public void user_has_launched_the_browser() throws Throwable {
	rt.launchApplication("chrome");//Accessing launchapplication method for launching browser
	}

	@When("^users has opens naukri homepage$")
	public void users_has_opens_naukri_homepage() throws Throwable {
	   rt.url();//Accessing url method for opening website
	   rt.loginn();//Accessing login method for login to the application
	}

	@Then("^click on contact us$")
	public void click_on_contact_us() throws Throwable {
	 rt.clickoncontactus();//calling on clickoncontactus method
	}

	@Then("^then retrive contact information$")
	public void then_retrive_contact_information() throws Throwable {
	rt.retrieve();//Accessing retrieve method for retrieving contact details
	}
}
