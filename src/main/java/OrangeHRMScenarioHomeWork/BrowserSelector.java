package OrangeHRMScenarioHomeWork;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

import java.net.MalformedURLException;

public class BrowserSelector extends Utils {

 public static LoadProp prop = new LoadProp();
  public static  final String USERNAME = prop.getProperty("SAUCE_USERNAME");
  public static final String ACCESS_KEY = prop.getProperty("SAUCE_ACCESS_KEY");
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub/";
//public static final String URL ="https://ondemand.saucelab.com/wd/hub";

  public static final boolean SAUCE_LAB = Boolean.parseBoolean(System.getProperty("Sauce"));
  public static final String browser = System.getProperty("browser");

  // Here we created a method named selectBrowser
  public void setUpBrowser() {
    //if sauce lab is true ----
    if (SAUCE_LAB){
      System.out.println("Running in SauceLab .... with browser" + browser );

      if (browser.equalsIgnoreCase("Safari")){
        DesiredCapabilities caps = DesiredCapabilities.safari();
        caps.setCapability("platform", "OSX 10.10");
        caps.setCapability("version", "8.0");

        try{
          driver = new RemoteWebDriver(new URL(URL),caps);
        } catch (MalformedURLException e){
          e.printStackTrace();
        }
      }
      else if( browser.equalsIgnoreCase("IE")) {
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("platform", "Windows 8");
        caps.setCapability("version", "10.0");
        try {
          driver = new RemoteWebDriver(new URL(URL), caps);
        } catch (MalformedURLException e) {
          e.printStackTrace();
        }
      }

else if(browser.equalsIgnoreCase("Chrome")){
        MutableCapabilities sauceOptions = new MutableCapabilities();

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "77.0");
        browserOptions.setCapability("sauce:options", sauceOptions);
          try{
            driver = new RemoteWebDriver(new URL(URL), browserOptions);
          } catch (MalformedURLException e){
            e.printStackTrace();
      }}

else if(browser.equalsIgnoreCase("Firefox")){

        MutableCapabilities sauceOptions = new MutableCapabilities();

        FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "69.0");
        browserOptions.setCapability("sauce:options", sauceOptions);
        try{
          driver = new RemoteWebDriver(new URL(URL), browserOptions);
        } catch (MalformedURLException e){
          e.printStackTrace();
        }


      }
      else {
        System.out.println("Wrong browser name " + browser);
      }
    }
    // if SauceLab is False ----
    else{
      if (browser.equalsIgnoreCase("Chrome")) {
        System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
      }
      else if (browser.equalsIgnoreCase("IE")) {
        System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
      }
      else if (browser.equalsIgnoreCase("FireFox")) {
        System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
      }
      // The below else is for the purpose - if all the above fail - it would print whatever is present in the TestData file in front of Browser
      else
      {
        System.out.println("wrong browser name or empty : " + browser);
      }
    }
  }














//  public void setUpBrowser(){
//
//    String browser = prop.getProperty("browser");
//
//    //String browser = System.getProperty("browser");
//
//    if(browser.equalsIgnoreCase("Firefox")){
//
//      System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
//
//
//      driver = new FirefoxDriver();
//    }
//    else if (browser.equalsIgnoreCase("chrome")){
//
//      System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
//
//
//
//      driver = new ChromeDriver();
//
//
//    } else if(browser.equalsIgnoreCase("ie")){
//
//      System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
//
//      driver = new InternetExplorerDriver();
//
//    }
//    else{
//
//      System.out.println("Browser name is empty or typed wrong "+ browser );
//    }
//
//
//  }
//


}
