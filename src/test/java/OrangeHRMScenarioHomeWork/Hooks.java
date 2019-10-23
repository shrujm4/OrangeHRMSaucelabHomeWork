package OrangeHRMScenarioHomeWork;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {


  BrowserSelector browserSelector = new BrowserSelector();
  LoadProp prop = new LoadProp();

  @Before

  public void setUPBrowser() {

    browserSelector.setUpBrowser();
    driver.get("https://opensource-demo.orangehrmlive.com/index.php");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //driver.manage().deleteAllCookies();



  }

  @After

  public void tearDown(Scenario scenario) {

    if (scenario.isFailed()) {
      TakesScreenshot ts = (TakesScreenshot) driver;
      File scrFile = ts.getScreenshotAs(OutputType.FILE);

      try {
        FileUtils.copyFile(scrFile, new File("src\\test\\Resources\\ScreenShots" + timeStamp() + ".png"));
        System.out.println("ScreenShot Taken");

        scenario.write("!!!!!!!!!.......Scenario Failed........!!!!!!!!! Please see attached screen shot");
        scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
      } catch (IOException e) {
// TODO Auto-generated catch block
        e.printStackTrace();
      }

    }
  }

@After
  public void closeBrowser() {

    driver.quit();

  }
}




