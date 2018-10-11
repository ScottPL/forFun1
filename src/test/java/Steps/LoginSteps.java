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

    // private Properties globalProperties = PropertiesUtil.loadGlobalProperties();


    @Given("^I open Engage Console login page$")
    public void iOpenEngageConsoleLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.openPage();
    }

    @And("I check if TDL logo exist$")
    public void iCheckIfTdlLogoExist() {
        String actualLogoUrl = loginPage.getTdlLogoText();
        String expectedLogoUrl = loginPage.getExpectedLogoUrl();
        Assert.assertEquals(actualLogoUrl, expectedLogoUrl, "Expected and actual logo urls are different.");
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("^I click login button$")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
        loginPage.waitForUrlToChange();
    }

//    @Given("^I log in$")
//    public void iLogIn () {
//        iOpenEngageConsoleLoginPage();
//        iEnterUsername(String arg0);
//        iEnterPassword(String arg0);
//        iClickLoginButton();
//        iShouldAReportingPageShouldBeDisplayed();
//    }
}
