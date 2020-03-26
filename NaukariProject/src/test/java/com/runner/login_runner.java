package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\hp\\Downloads\\NaukariProject (2)\\NaukariProject\\src\\main\\resources\\features\\TestCase.feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
tags = {"@tc01_login,@tc02_advancesearch,@tc03_About,@tc04_govtjobs, @tc05_Contact"},
glue = {"com.stepdefinition"},
monochrome = true
)
public class login_runner {
	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
