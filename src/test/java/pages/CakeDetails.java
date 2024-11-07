package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CakeDetails extends BasePage {

    public CakeDetails(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//label[contains(text(), '1.1lb')]")
    public WebElement selectWeight;

    @FindBy(xpath="//button[@id='main_add_cart_btn']")
    public WebElement btnAddToCart;

    public void clickWeight(){
        selectWeight.click();
    }

    public void clickAddToCart(){
        btnAddToCart.click();
    }

}
