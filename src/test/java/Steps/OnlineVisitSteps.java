package Steps;

import static org.testng.Assert.assertEquals;

import Pages.BasePage;
import Pages.OnlineVisitPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class OnlineVisitSteps {

    // CONSTRUCTOR

    public OnlineVisitSteps(BasePage basePage) {
        driver = basePage.getDriver();
        onlineVisitPage = new OnlineVisitPage(driver);
    }

    private WebDriver driver;
    private OnlineVisitPage onlineVisitPage;

    @Then("^I log in for online visit$")
    public void aReportingPageShouldBeDisplayed() {
        String actualOnlineVisitPageUrl = driver.getCurrentUrl();
        String expectedOnlineVisitPageUrl = onlineVisitPage.getExpectedOnlineVisitPageUrl();
        assertEquals(actualOnlineVisitPageUrl, expectedOnlineVisitPageUrl, "Expected and actual Online Visit Page urls are different.");
        }

}
