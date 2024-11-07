package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WishqueHome loadURL(String url) {
        driver.get(url);
        return PageFactory.initElements(driver, WishqueHome.class);
    }

    public void scrollPage(WebDriver driver, int x, int y) {
        new Actions(driver).scrollByAmount(x, y).perform();
    }

}
