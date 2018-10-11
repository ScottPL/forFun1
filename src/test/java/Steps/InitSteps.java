package Steps;

import Pages.BasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitSteps {

    public InitSteps(BasePage basePage){
        this.basePage = basePage;
    }

    private WebDriver driver;
    private BasePage basePage;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        basePage.setDriver(driver);
    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        if (driver != null ){
            driver.quit();
        }
    }
}
