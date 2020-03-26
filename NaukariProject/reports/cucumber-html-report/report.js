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
  "duration": 10594993400,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_opens_naukri_homepage()"
});
formatter.result({
  "duration": 20875811600,
  "status": "passed"
});
formatter.match({
  "location": "login_step.user_clicks_login()"
});
formatter.result({
  "duration": 25900577500,
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
  "duration": 9404129000,
  "status": "passed"
});
formatter.match({
  "location": "advancesearch_step.user_opens_naukrihomepage()"
});
formatter.result({
  "duration": 19395163200,
  "status": "passed"
});
formatter.match({
  "location": "advancesearch_step.click_on_jobs_and_move_to_advancesearch()"
});
formatter.result({
  "duration": 22831800400,
  "status": "passed"
});
formatter.match({
  "location": "advancesearch_step.alert_page_is_opened_enter_all_the_required_fields()"
});
formatter.result({
  "duration": 34427400900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"dd_adv_workExp_year\"]/div[1]/span\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027LAPTOP-0E4BENU1\u0027, ip: \u0027192.168.43.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\hp\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:62610}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f65dab2f6b9bd32efb4077d7affc6854\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"dd_adv_workExp_year\"]/div[1]/span}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.pages.Advancesearch_Main.enterdata(Advancesearch_Main.java:105)\r\n\tat com.stepdefinition.advancesearch_step.alert_page_is_opened_enter_all_the_required_fields(advancesearch_step.java:33)\r\n\tat ✽.When alert page is opened enter all the required fields(C:/Users/hp/Downloads/NaukariProject (2)/NaukariProject/src/main/resources/features/TestCase.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "advancesearch_step.click_on_advancesearch()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 9403768500,
  "status": "passed"
});
formatter.match({
  "location": "about_step.user_has_opens_naukrihomepage()"
});
formatter.result({
  "duration": 23555065000,
  "status": "passed"
});
formatter.match({
  "location": "about_step.scroll_down_to_end_of_page_and_click_on_about_us()"
});
formatter.result({
  "duration": 88029095600,
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
  "duration": 9434068400,
  "status": "passed"
});
formatter.match({
  "location": "windowhandling_step.user_has_opens_naukri_homepage()"
});
formatter.result({
  "duration": 22976505300,
  "status": "passed"
});
formatter.match({
  "location": "windowhandling_step.click_on_govtjobs_and_choose_defence_govt_jobs()"
});
formatter.result({
  "duration": 19454561000,
  "status": "passed"
});
formatter.match({
  "location": "windowhandling_step.click_on_one_of_option_based_on_requirement()"
});
formatter.result({
  "duration": 4677835100,
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
  "duration": 10116803700,
  "status": "passed"
});
formatter.match({
  "location": "retrievecontact_step.users_has_opens_naukri_homepage()"
});
formatter.result({
  "duration": 20005208500,
  "status": "passed"
});
formatter.match({
  "location": "retrievecontact_step.click_on_contact_us()"
});
formatter.result({
  "duration": 17869883600,
  "status": "passed"
});
formatter.match({
  "location": "retrievecontact_step.then_retrive_contact_information()"
});
formatter.result({
  "duration": 5163658900,
  "status": "passed"
});
});