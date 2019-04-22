package Steps;

import Pages.BasePage;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {

  // CONSTRUCTOR

  public LoginSteps(BasePage basePage) {
    driver = basePage.getDriver();
    loginPage = new LoginPage(driver);
  }

  private WebDriver driver;
  private LoginPage loginPage;

  // VARIABLES, LOCATORS

  @Given("^I open Rory page for online visit$")
  public void iOpenRoryPageForOnlineVisit() {
    loginPage = new LoginPage(driver);
    loginPage.openPage();
  }

  @And("I check if Rory logo exist$")
  public void iCheckIfRoryLogoExist() {
    String actualLogoUrl = loginPage.getLogoSrc();
    String expectedLogoSrc = loginPage.getExpectedLogoSrc();
    Assert.assertEquals(actualLogoUrl, expectedLogoSrc,
        "Expected and actual logo src are different.");
  }

  @And("^I enter email \"([^\"]*)\"$")
  public void iEnterEmailAddress(String email) {
    loginPage.inputEmailAddress(email);
  }

  @And("^I enter first name \"([^\"]*)\"$")
  public void iEnterFirstName(String firstname) {
    loginPage.inputFirstName(firstname);
  }

  @And("^I enter last name \"([^\"]*)\"$")
  public void iEnterLastName(String lastname) {
    loginPage.inputLastName(lastname);
  }

  @And("^I enter password \"([^\"]*)\"$")
  public void iEnterPassword(String password) {
    loginPage.inputPassword(password);
  }

  @And("^I mark terms, privacy policy and consent of Telehealth$")
  public void iMarkRequiredTermsAndPolices() {
    loginPage.setTermsAndConditions();
  }

  @When("^I click Start My Visit button$")
  public void iClickLoginButton() {
    loginPage.clickStartVisitButton();
    loginPage.waitForUrlToChange();
  }
}
