package OrangeHRMScenarioHomeWork;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

  LoadProp prop = new LoadProp();
  HomePage homePage = new HomePage();




//User Login Scenario

  @Given("User is on homepage")
  public void user_is_on_homepage() {

  }

  @When("user enters valid username and password")
  public void user_enters_valid_username_and_password() {

    homePage.enterValidLoginCredentials();

  }

  @When("user clicks on log-in button")
  public void user_clicks_on_log_in_button() {

    homePage.clickOnLoginButton();
  }

  @Then("user should be logged in and able to see welcome message")
  public void user_should_be_logged_in_and_able_to_see_welcome_message() {
homePage.assertUrlSuccess();

  }

  @When("I enter Username as {string} and Password as {string}")
  public void i_enter_Username_as_and_Password_as(String username, String password) {

    homePage.enterInvalidCredentials(username,password);

  }

  @When("User click on login button")
  public void user_click_on_login_button() {

    homePage.clickOnLoginButton();

  }

  @Then("User should not be logged in with error message {string}")
  public void user_should_not_be_logged_in_with_error_message(String error_message) {

    homePage.toVerifyErrorMessage(error_message);
  }











}

