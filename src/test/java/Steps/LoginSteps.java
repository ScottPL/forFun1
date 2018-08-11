package Steps;

import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

    // DEPENDENCIES

    private WebDriver driver;
    private LoginPage loginPage;

    @Autowired
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Autowired
    private void setLoginPage(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    // VARIABLES, LOCATORS

    // private Properties globalProperties = PropertiesUtil.loadGlobalProperties();

public class LoginSteps {

    @Given("^I navigate to Engage Console login page for particular \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iNavigateToEngageConsoleLoginPageForParticularAnd(String arg0, String arg1)
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should a Reporting page should be displayed$")
    public void iShouldAReportingPageShouldBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
