package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public  class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"user-nae\"]")
    private List<WebElement> allUsers;


    @FindBy(xpath = "//android.widget.CheckBox[@content-desc=\"users\"])")
    private List<WebElement> userCardLink;
    public List<WebElement> findUsers(){return allUsers;}

}
