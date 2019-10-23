$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Features/Login.feature");
formatter.feature({
  "name": "Check Login functionality for OrangeHRM",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a User, I should be able to log-in with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDefs.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on log-in button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_log_in_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: Reached error page: about:neterror?e\u003dredirectLoop\u0026u\u003dhttps%3A//opensource-demo.orangehrmlive.com/index.php\u0026c\u003dUTF-8\u0026f\u003dregular\u0026d\u003dFirefox%20has%20detected%20that%20the%20server%20is%20redirecting%20the%20request%20for%20this%20address%20in%20a%20way%20that%20will%20never%20complete.\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BOMHOMELP\u0027, ip: \u0027192.168.1.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_212\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 69.0.3, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20191009172106, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 5200, moz:profile: C:\\Users\\Vinod Nehete\\AppDa..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5a748336-209e-4112-a628-fe38f35a898d\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat OrangeHRMScenarioHomeWork.Utils.clickElement(Utils.java:35)\r\n\tat OrangeHRMScenarioHomeWork.HomePage.clickOnLoginButton(HomePage.java:31)\r\n\tat OrangeHRMScenarioHomeWork.MyStepDefs.user_clicks_on_log_in_button(MyStepDefs.java:33)\r\n\tat ✽.user clicks on log-in button(file:src/test/Resources/Features/Login.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should be logged in and able to see welcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_should_be_logged_in_and_able_to_see_welcome_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("!!!!!!!!!.......Scenario Failed........!!!!!!!!! Please see attached screen shot");
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});