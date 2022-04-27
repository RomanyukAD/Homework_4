import Page.MainPage;
import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.boot.SpringApplication;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ClickBeforeListener;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class CourcesPageTest {

    private EventFiringWebDriver driver;
    private MainPage mainPage;

    @Before
    public static void startRemote() {
        Configuration.remote = "http://127.0.0.1:4445/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "98.0";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        capabilities.setCapability("enableLog", true);
        Configuration.browserCapabilities = new ChromeOptions();
    }

    @After
    public void teamDown() {
        driver.quit();
    }


    @Test(enabled = false)
    public void ClickCourse(){
        mainPage
                .openOtus()
                .ClickCourse(Integer.parseInt(System.getProperty("nameOpenCourse")));
    }



    @Test
    public void SelectSpecialCourses(){
        mainPage
                .openOtus()
                .CoursesSpecial(System.getProperty("nameSpecialCourse"));
    }

    @Test
    public void SelectBeforePopularCourses(){
        mainPage
                .openOtus()
                .BeforePopularCourse();
    }

    @Test
    public void SelectAfterPopularCourse(){
        mainPage
                .openOtus()
                .PopularCourseAfter();
    }

    @Test
    public void SelectBeforeSpecialCourse(){
        mainPage
                .openOtus()
                .BeforeSpecialCourse();
    }

    @Test
    public void SelectAfterSpecialCourse(){
        mainPage
                .openOtus()
                .AfterSpecialCourse();
    }


    @Test
    public void SelectMorePopularCourse(){

        mainPage
                .openOtus()
                .MorePopularCourse(System.getProperty("namePopularCourse"));
    }


}