package Steps;

import static org.testng.Assert.assertEquals;

import Pages.BasePage;
import Pages.WelcomePage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class WelcomeSteps {

  // CONSTRUCTOR

  public WelcomeSteps(BasePage basePage) {
    driver = basePage.getDriver();
    welcomePage = new WelcomePage(driver);
  }

  private WebDriver driver;
  private WelcomePage welcomePage;

  @Then("^I am logged in to Rory welcome page for online visit$")
  public void aWelcomePageShouldBeDisplayed() {
    String actualWelcomePageUrl = driver.getCurrentUrl();
    String expectedWelcomePageUrl = welcomePage.getExpectedWelcomePageUrl();
    assertEquals(actualWelcomePageUrl, expectedWelcomePageUrl,
        "Expected and actual Welcome Rory Page urls are different.");
  }

}
