package Steps;

import static org.testng.Assert.assertEquals;

import Pages.BasePage;
import Pages.NavBar;
import Pages.ReportingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class ReportingSteps {

    // CONSTRUCTOR

    public ReportingSteps(BasePage basePage) {
        driver = basePage.getDriver();
        reportingPage = new ReportingPage(driver);
        navBar = new NavBar(driver);

    }

    private WebDriver driver;
    private ReportingPage reportingPage;
    private NavBar navBar;

    @Then("^A Reporting page should be displayed$")
    public void aReportingPageShouldBeDisplayed() {
        String actualReportingPageUrl = driver.getCurrentUrl();
        String expectedReportingPageUrl = reportingPage.getExpectedReportingUrl();
        assertEquals(actualReportingPageUrl, expectedReportingPageUrl, "Expected and actual Reporting Page urls are different.");
        }

    @And("^I can see (\\d+) in top menu$")
    public void iCanSeeInTopMenu(int numbOfTopMenuItems) {
        int actualNumberOfItems = navBar.countTopMenuItems();
        assertEquals(actualNumberOfItems, numbOfTopMenuItems, "Number of Top Menu elements is different then expected.");
    }
}
