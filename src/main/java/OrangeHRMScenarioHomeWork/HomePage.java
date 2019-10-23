package OrangeHRMScenarioHomeWork;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.openqa.selenium.By.id;

public class HomePage extends Utils {

LoadProp prop = new LoadProp();

private By _username = id("txtUsername");
private By _password = id("txtPassword");
private By _login = id("btnLogin");
private By _errorMessage = By.id("spanMessage");






public void enterValidLoginCredentials(){

clearAndEnterText(_username,prop.getProperty("loginname"));
clearAndEnterText(_password,prop.getProperty("passwordLogin") );

}

public void clickOnLoginButton(){

  clickElement(_login);

}



public void assertUrlSuccess(){

    String URL = driver.getCurrentUrl();
    Assert.assertEquals(URL, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers1" );
  }

  public void enterInvalidCredentials(String username, String password){

  clearAndEnterText(_username,username);
  clearAndEnterText(_password, password);

  }


  public void toVerifyErrorMessage(String error_message){
    Assert.assertEquals(getTextFromElement(_errorMessage) ,error_message);
  }

}



