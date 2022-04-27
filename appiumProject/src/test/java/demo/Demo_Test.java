package demo;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.SeleniumWebDriver;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.MainPage;



public class Demo_Test {
  public static AppiumDriver driver;
  public static MainPage mainPage;


  @BeforeAll
  public static void config () {
    closeWebDriver();
    Configuration.browserSize = null;
    Configuration.browser = SeleniumWebDriver.class.getName();
    mainPage = new MainPage(driver);
  }


  @Test
  public void allUsersTest() {
    mainPage.findUsers();
  }


  @Test
  public void firstTest() {
    $(By.xpath("//android.widget.CheckBox[@content-desc=\"users\"])")).click();
  }


}
