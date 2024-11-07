package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PerfumePage extends BasePage {

    public PerfumePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='price_filter_from']")
    public WebElement priceFromField;

    @FindBy(xpath = "//input[@id='price_filter_to']")
    public WebElement priceToField;

    @FindBy(xpath = "//button[@id='price_filter_submit']")
    public WebElement btnToSubmitPriceRange;

    public void typePriceFrom(String priceFrom){
        priceFromField.sendKeys(priceFrom);
    }

    public void typePriceTo(String priceTo){
        priceToField.sendKeys(priceTo);
    }

    public void clickToSubmitPriceRange(){
        btnToSubmitPriceRange.click();
    }

}
