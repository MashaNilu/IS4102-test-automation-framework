package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CakePage extends BasePage {

    public CakePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@id='price_filter_range_iv']")
    public WebElement radioOptionFour;

    @FindBy(xpath = "//*[contains(text(), 'Ribbon Cake')]")
    public WebElement openCake;

    public void clickRadioOptionFour() {
        radioOptionFour.click();
    }

    public <T> T clickToOpenCake() {
        openCake.click();
        return (T) PageFactory.initElements(driver, CakeDetails.class);
    }

}
