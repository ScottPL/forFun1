package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // CONSTRUCTOR
        public LoginPage (WebDriver driver) {

            super(driver);
    }

    // VARIABLES, LOCATORS

    @FindBy(className = "app-header-logo")
    private WebElement theRoryLogo; 

//    @FindBy(id = "username")
//    private WebElement usernameInput;
//
//    @FindBy(id = "password")
//    private WebElement passwordInput;
//
//    @FindBy(id = "login-submit")
//    private WebElement loginButton;

    String baseUrl = "https://start.ro.co/rory/vaginal-dryness";
    String expectedLogoUrl = "data:image/svg+xml,%3Csvg width='69' height='14' "
        + "viewBox='0 0 69 14' fill='none' xmlns='http://www.w3.org/2000/svg'%3E "
        + "%3Cpath d='M57.0296 13.9751H60.2813L68.2007 0H64.949L61.304 6.43624L56.8985 "
        + "0H53.4895L59.7568 9.17997L57.0296 13.9751Z' fill='%23DDADA6'/%3E "
        + "%3Cpath d='M39.6438 6.46114V2.76864H46.0422C47.0649 2.76864 47.904 3.58919 47.904 "
        + "4.61489C47.904 5.64058 47.0649 6.46114 46.0422 6.46114H39.6438ZM47.5631 9.23052C47.5107 "
        + "9.17923 47.432 9.10231 47.3796 9.05102C49.2939 8.48689 50.7099 6.71756 50.7099 "
        + "4.64053C50.7099 2.10194 48.6121 0.0249023 46.0422 "
        + "0.0249023H36.8379V14H39.6438V9.25616H42.0563C43.7346 9.25616 44.495 10.0511 45.544 "
        + "11.1537C46.7502 12.4358 48.2449 14 51.313 14V11.2306C49.4512 11.205 48.6645 10.3588 "
        + "47.5631 9.23052Z' fill='%23DDADA6'/%3E "
        + "%3Cpath d='M3.63937 6.46188V2.76938H10.0378C11.0605 2.76938 11.8996 3.58993 11.8996 "
        + "4.61563C11.8996 5.64132 11.0605 6.46188 10.0378 6.46188H3.63937ZM11.585 "
        + "9.23126C11.5325 9.17997 11.4539 9.10305 11.4014 9.05176C13.3157 8.46199 14.7317 "
        + "6.69266 14.7317 4.61563C14.7317 2.07703 12.6339 0 10.064 "
        + "0H0.833496V13.9751H3.63937V9.23126H6.05189C7.73017 9.23126 8.49064 10.0262 9.53957 "
        + "11.1288C10.7458 12.4109 12.2405 13.9751 15.3349 13.9751V11.2057C13.4468 "
        + "11.2057 12.6601 10.3595 11.585 9.23126Z' fill='%23DDADA6'/%3E "
        + "%3Cpath d='M25.7193 2.79502C23.2281 2.79502 21.1827 4.69256 21.1827 7.00037C21.1827 "
        + "9.30818 23.2281 11.2057 25.7193 11.2057C28.2105 11.2057 30.2559 9.30818 30.2559 "
        + "7.00037C30.2559 5.89775 29.7839 4.84641 28.9447 4.0515C28.0794 3.23094 26.9255 "
        + "2.79502 25.7193 2.79502ZM25.7193 13.9751C21.6547 13.9751 18.3506 10.8467 18.3506 "
        + "6.97473C18.3506 3.12837 21.6547 0 25.7193 0C27.6598 0 29.5216 0.717987 30.8852 "
        + "2.02575C32.3013 3.35915 33.0617 5.10283 33.0617 7.00037C33.0617 10.8467 29.7576 "
        + "13.9751 25.7193 13.9751Z' fill='%23DDADA6'/%3E %3C/svg%3E";

    // METHODS

    //Go to Login page
    public void openPage() {
        driver.get(baseUrl);
    }

    public String getExpectedLogoUrl() {
        return expectedLogoUrl;
    }

    //Check the page is Rory by its logo's src
    public String getLogoSrc() {
        return theRoryLogo.getAttribute("src");
    }

//    public void inputUsername(String user) {
//        usernameInput.sendKeys(user);
//    }
//
//    //Input password
//    public void inputPassword(String password) {
//        passwordInput.sendKeys(password);
//    }
//
//    //Click Login button
//    public void clickLoginButton () {
//        loginButton.click();
//    }
//
//    //Waiting for different URL then login page
//    public void waitForUrlToChange () {
//        for (int i=0; i<=5; i++) {
//           if (driver.getCurrentUrl().equals(baseUrl)) {
//               hardWait(1);
//            }
//            else {
//               break;
//           }
//        }
//    }
}