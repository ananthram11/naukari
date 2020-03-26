$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/hp/Downloads/NaukariProject (2)/NaukariProject/src/main/resources/features/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "naukri website",
  "description": "",
  "id": "naukri-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@naukri_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "To check that the user can login naukri account",
  "description": "",
  "id": "naukri-website;to-check-that-the-user-can-login-naukri-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks login",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 13639981400,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_opens_naukri_homepage()"
});
formatter.result({
  "duration": 25839924500,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_clicks_login()"
});
formatter.result({
  "duration": 29236889500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "To check that the user able to do advancesearch",
  "description": "",
  "id": "naukri-website;to-check-that-the-user-able-to-do-advancesearch",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tc02_advancesearch"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user launched the chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user opens naukrihomepage",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Click on jobs and move to advancesearch",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "alert page is opened enter all the required fields",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "click on advancesearch",
  "keyword": "And "
});
formatter.match({
  "location": "advancesearch_step.user_launched_the_chromebrowser()"
});
formatter.result({
  "duration": 9523729400,
  "status": "passed"
});
formatter.match({
  "location": "advancesearch_step.user_opens_naukrihomepage()"
});
formatter.result({
  "duration": 24963880300,
  "status": "passed"
});
formatter.match({
  "location": "advancesearch_step.click_on_jobs_and_move_to_advancesearch()"
});
formatter.result({
  "duration": 16074192500,
  "status": "passed"
});
formatter.match({
  "location": "advancesearch_step.alert_page_is_opened_enter_all_the_required_fields()"
});
formatter.result({
  "duration": 6298199700,
  "status": "passed"
});
formatter.match({
  "location": "advancesearch_step.click_on_advancesearch()"
});
formatter.result({
  "duration": 6765721300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Check the user able to get information about website",
  "description": "",
  "id": "naukri-website;check-the-user-able-to-get-information-about-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@tc03_About"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user has launched the  chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user has opens naukrihomepage",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "scroll down to end of page and click on about us",
  "keyword": "Then "
});
formatter.match({
  "location": "about_step.user_has_launched_the_chromebrowser()"
});
formatter.result({
  "duration": 9890170500,
  "status": "passed"
});
formatter.match({
  "location": "about_step.user_has_opens_naukrihomepage()"
});
formatter.result({
  "duration": 19387989900,
  "status": "passed"
});
formatter.match({
  "location": "about_step.scroll_down_to_end_of_page_and_click_on_about_us()"
});
formatter.result({
  "duration": 37990981400,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "check that user able to handlewindows",
  "description": "",
  "id": "naukri-website;check-that-user-able-to-handlewindows",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@tc04_govtjobs"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user has launched the  chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user has opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "click on govtjobs and choose defence/govt jobs",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click on one of option based on requirement",
  "keyword": "And "
});
formatter.match({
  "location": "windowhandling_step.user_has_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 9765460100,
  "status": "passed"
});
formatter.match({
  "location": "windowhandling_step.user_has_opens_naukri_homepage()"
});
formatter.result({
  "duration": 14471071800,
  "status": "passed"
});
formatter.match({
  "location": "windowhandling_step.click_on_govtjobs_and_choose_defence_govt_jobs()"
});
formatter.result({
  "duration": 14962681800,
  "status": "passed"
});
formatter.match({
  "location": "windowhandling_step.click_on_one_of_option_based_on_requirement()"
});
formatter.result({
  "duration": 5024623400,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "check that user retrive contact information",
  "description": "",
  "id": "naukri-website;check-that-user-retrive-contact-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@tc05_Contact"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user has launched the   browser",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "users has opens naukri homepage",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "click on contact us",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "then retrive contact information",
  "keyword": "And "
});
formatter.match({
  "location": "retrievecontact_step.user_has_launched_the_browser()"
});
formatter.result({
  "duration": 9818438600,
  "status": "passed"
});
formatter.match({
  "location": "retrievecontact_step.users_has_opens_naukri_homepage()"
});
formatter.result({
  "duration": 17279731700,
  "status": "passed"
});
formatter.match({
  "location": "retrievecontact_step.click_on_contact_us()"
});
formatter.result({
  "duration": 21698793700,
  "status": "passed"
});
formatter.match({
  "location": "retrievecontact_step.then_retrive_contact_information()"
});
formatter.result({
  "duration": 5429722100,
  "status": "passed"
});
});