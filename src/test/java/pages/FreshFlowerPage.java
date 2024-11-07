package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreshFlowerPage extends BasePage {

    public FreshFlowerPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//img[@alt='Birthday']")
    public WebElement birthdayArrangements;

    public <T> T clickOnBirthday() {
        birthdayArrangements.click();
        return (T) PageFactory.initElements(driver, BirthdayFlowerArrangements.class);
    }

}
