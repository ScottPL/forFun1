package Steps;

import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {

    // CONSTRUCTOR

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver driver;
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

//    @And("^I enter username \"([^\"]*)\"$")
//    public void iEnterUsername(String username) {
////        if(arg0.equals("admin")) {
////
////        }else if(arg0.equals("readonly")) {
////
////        }
//        LoginPage webElement = new LoginPage();
//        webElement.inputUsername(username);
//    }
//
//    @And("^I enter password \"([^\"]*)\"$")
//    public void iEnterPassword(String password) {
//        LoginPage webElement = new LoginPage();
//        webElement.inputPassword(password);
//    }
//
//    @And("^I click login button$")
//    public void iClickLoginButton() {
//        LoginPage webElement = new LoginPage();
//        webElement.clickLoginButton();
//    }
//
//    @Then("^A Reporting page should be displayed$")
//    public void iShouldAReportingPageShouldBeDisplayed() {
//        LoginPage webElement = new LoginPage();
//        webElement.checkReportingPage();
//    }
//
//    @Given("^I log in$")
//    public void iLogIn () {
//        iOpenEngageConsoleLoginPage();
//        iEnterUsername(String arg0);
//        iEnterPassword(String arg0);
//        iClickLoginButton();
//        iShouldAReportingPageShouldBeDisplayed();
//    }
}
