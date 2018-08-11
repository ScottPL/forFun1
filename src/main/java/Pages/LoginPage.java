package Pages;

import java.util.List;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Data
@Component
public class LoginPage extends BasePage {

    // CONSTRUCTOR

    public LoginPage(WebDriver driver){
        super(driver);
    }

    // VARIABLES, LOCATORS

    @FindBy(css = "a[class='dd-selected']")
    private WebElement countryDropdown;

    @FindBy(css = "ul[class='dd-options dd-click-off-close']")
    private WebElement countryDropdownList;

    @FindBy(id = "spllanguage-list")
    private WebElement selectYourLanguageList;

    private By COUNTRY_LIST_ITEM_LOC = By.cssSelector("li");
    private By LANGUAGE_LIST_ITEM_LOC = By.cssSelector("li > a");

    // METHODS

    private List<WebElement> getCountriesList() {
        return countryDropdownList.findElements(COUNTRY_LIST_ITEM_LOC);
    }

    public void clickDropdown() {
        countryDropdown.click();
    }

    public void selectCountry(String countryName) {
        List<WebElement> countriesList = getCountriesList();
        for(WebElement countryOption : countriesList) {
            if(countryOption.getText().equals(countryName)) {
                countryOption.click();
                break;
            }
        }
    }

    private List<WebElement> getLanguagesToSelectList() {
        return selectYourLanguageList.findElements(LANGUAGE_LIST_ITEM_LOC);
    }

    public boolean isLanguageOnTheList(String languageName) {
        List<WebElement> languagesList = getLanguagesToSelectList();
        for(WebElement language : languagesList) {
            String languageLabel = language.getText().replaceAll("> ", "");
            if(languageLabel.equals(languageName)) {
                return true;
            }
        }
        return false;
    }

    public void selectLanguage(String languageName) {
        List<WebElement> languagesList = getLanguagesToSelectList();
        for(WebElement language : languagesList) {
            String languageLabel = language.getText().replaceAll("> ", "");
            if(languageLabel.equals(languageName)) {
                language.click();
                break;
            }
        }
    }

    public void waitForUrlToChange(String expectedUrl) {
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
    }

}