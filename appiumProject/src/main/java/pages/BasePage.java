package pages;

import drivers.SeleniumWebDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.codeborne.selenide.WebDriverRunner;

public abstract class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver){
        BasePage.driver = SeleniumWebDriver.createDriver();
        WebDriverRunner.setWebDriver(BasePage.driver);
        PageFactory.initElements(new AppiumFieldDecorator(BasePage.driver), this);
    }
}
