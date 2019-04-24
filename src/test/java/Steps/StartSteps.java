package Steps; 

import Pages.BasePage;
import Pages.StartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StartSteps {

  // CONSTRUCTOR

  public StartSteps(BasePage basePage) {
    driver = basePage.getDriver();
    startPage = new StartPage(driver);
  }

  private WebDriver driver;
  private StartPage startPage;

  // VARIABLES, LOCATORS

  @Given("^I open Rory start page for online visit$")
  public void iOpenRoryPageForOnlineVisit() {
    startPage = new StartPage(driver);
    startPage.openPage();
  }

  @And("I check if double-picture exist$")
  public void iCheckIfRoryLogoExist() {
    String actualLogoSrc = startPage.getCurrentLogoSrc();
    String expectedLogoSrc = startPage.getExpectedLogoSrc();
    Assert.assertEquals(actualLogoSrc, expectedLogoSrc,
        "Expected and actual logo src are different.");
  }

  @And("^I enter email \"([^\"]*)\"$")
  public void iEnterEmailAddress(String email) {
    startPage.inputEmailAddress(email);
  }

  @And("^I enter first name \"([^\"]*)\"$")
  public void iEnterFirstName(String firstname) {
    startPage.inputFirstName(firstname);
  }

  @And("^I enter last name \"([^\"]*)\"$")
  public void iEnterLastName(String lastname) {
    startPage.inputLastName(lastname);
  }

  @And("^I enter password \"([^\"]*)\"$")
  public void iEnterPassword(String password) {
    startPage.inputPassword(password);
  }

  @And("^I mark terms, privacy policy and consent of Telehealth checkbox$")
  public void iMarkRequiredTermsAndPolices() {
    startPage.setTermsAndConditions();
  }

  @When("^I click Start My Visit button$")
  public void iClickLoginButton() {
    startPage.clickStartVisitButton();
    startPage.waitForUrlToChange();
  }
}
