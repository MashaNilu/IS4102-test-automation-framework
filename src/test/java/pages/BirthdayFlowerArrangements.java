package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BirthdayFlowerArrangements extends BasePage{

    public BirthdayFlowerArrangements(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@href, '#price')]")
    public WebElement priceToggle;

    @FindBy(xpath = "//span[@id='price_filter_range_v']")
    public WebElement radioOptionFive;

    public void clickPriceToggle() {
        priceToggle.click();
    }

    public void clickRadioOptionFive() {
        radioOptionFive.click();
    }

}
