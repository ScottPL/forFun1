package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

  // CONSTRUCTOR
  public StartPage(WebDriver driver) {

    super(driver);
  }

  // VARIABLES, LOCATORS

  @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div/div/div/div/div[1]/div/ul/li[1]/div[1]/img")
  private WebElement theDoubledPicture;

  @FindBy(id = "temporaryEmail")
  private WebElement emailInput;

  @FindBy(id = "firstName")
  private WebElement firstNameInput;

  @FindBy(id = "lastName")
  private WebElement lastNameInput;

  @FindBy(id = "password")
  private WebElement passwordInput;

  @FindBy(className = "checkbox-label")
  private WebElement termsAndConditionsCheckBox;

  @FindBy(className = "button--primary")
  private WebElement startVisitButton;

  String baseUrl = "https://start.ro.co/rory/vaginal-dryness";
  String expectedLogoSrc = "https://rotests-api-staging.s3.amazonaws.com/s3_uploaded_images/rory_docs.png";


  public void openPage() {
    driver.get(baseUrl);
  }

  public String getExpectedLogoSrc() {
    return expectedLogoSrc;
  }

  public String getCurrentLogoSrc() {
    return theDoubledPicture.getAttribute("src");
  }

  //Provide consecutive input data
  public void inputEmailAddress(String email) {
    emailInput.sendKeys(email);
  }

  public void inputFirstName(String firstname) {
    firstNameInput.sendKeys(firstname);
  }

  public void inputLastName(String lastname) {
    lastNameInput.sendKeys(lastname);
  }

  public void inputPassword(String password) {
    passwordInput.sendKeys(password);
  }

  public void setTermsAndConditions() {
    termsAndConditionsCheckBox.click();
  }

  //Click start visit button
  public void clickStartVisitButton() {
    startVisitButton.click();
  }

  //Waiting for different URL then login page
  public void waitForUrlToChange() {
    for (int i = 0; i <= 5; i++) {
      if (driver.getCurrentUrl().equals(baseUrl)) {
        hardWait(1);
      } else {
        break;
      }
    }
  }
}