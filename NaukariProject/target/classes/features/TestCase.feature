@naukri_Feature
Feature: naukri website

@tc01_login
Scenario:check that the user can login naukri account	
	Given  user launched the chrome browser 
	When  user opens naukri homepage 
	Then user clicks login 
	
@tc02_advancesearch
Scenario:Check that the user able to do advancesearch
  
  
  Given user launched the chromebrowser
  When  user opens naukrihomepage
  Then Click on jobs and move to advancesearch
  When alert page is opened enter all the required fields
  And click on advancesearch
  
@tc03_About
Scenario: Check the user able to get information about website
 
  Given user has launched the  chromebrowser
  When user has opens naukrihomepage
  Then scroll down to end of page and click on about us
 
@tc04_govtjobs
  Scenario: check that user able to handlewindows
   
  Given user has launched the  chrome browser
  When user has opens naukri homepage
  Then click on govtjobs and choose defence/govt jobs 
  And click on one of option based on requirement
  
 @tc05_Contact
 Scenario:check that user retrive contact information
 
   Given user has launched the   browser
   When users has opens naukri homepage
   Then click on contact us
   And then retrive contact information