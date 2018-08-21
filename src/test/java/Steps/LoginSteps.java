package Steps;

import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

    // DEPENDENCIES

    public WebDriver driver;

    @Autowired
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    // VARIABLES, LOCATORS

    // private Properties globalProperties = PropertiesUtil.loadGlobalProperties();


    @Given("^I open Engage Console login page$")
    public void iOpenEngageConsoleLoginPage() {
        LoginPage webElement = new LoginPage();
        webElement.openPage();
    }

    @And("I check if TDL logo exist$")
    public void iCheckIfTdlLogoExist() {
        LoginPage webElement = new LoginPage();
        webElement.checkTdlLogo();
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String arg0) {
        LoginPage webElement = new LoginPage();
        webElement.inputUsername(arg0);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String arg0) {
        LoginPage webElement = new LoginPage();
        webElement.inputPassword(arg0);
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        LoginPage webElement = new LoginPage();
        webElement.clickLoginButton();
    }

    @Then("^A Reporting page should be displayed$")
    public void iShouldAReportingPageShouldBeDisplayed() {
        LoginPage webElement = new LoginPage();
        webElement.checkReportingPage();
    }
}
