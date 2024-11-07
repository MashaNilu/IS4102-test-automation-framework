package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;
import utilities.ExcelTestDataProvider;
import utilities.ExcelTestDataRow;
import utilities.Utilities;

import java.util.List;

public class WebDriver extends Utilities {

    @Test
    public void searchCakes () throws InterruptedException {

        BasePage baseUrl = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        WishqueHome wishqueHome = baseUrl.loadURL("https://www.wishque.com/");
        wishqueHome.typeInSearchBox("cakes");
        CakePage cakePage = wishqueHome.clickSearchButton("cakes");
        Thread.sleep(3000);
        cakePage.scrollPage(browserFactory.getDriver(), 0, 350);
        Thread.sleep(5000);
        cakePage.clickRadioOptionFour();
        CakeDetails cakeDetails = cakePage.clickToOpenCake();
        Thread.sleep(1000);
        cakeDetails.clickWeight();
        Thread.sleep(1000);
        cakeDetails.clickAddToCart();
        Thread.sleep(1000);

    }

    @Test(dataProvider = "testData")
    public void searchPerfumes(ExcelTestDataRow testData) throws InterruptedException {

        BasePage baseUrl = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        WishqueHome wishqueHome = baseUrl.loadURL("https://www.wishque.com/");
        wishqueHome.typeInSearchBox("perfumes");
        PerfumePage perfumePage = wishqueHome.clickSearchButton("perfumes");
        Thread.sleep(3000);
        perfumePage.scrollPage(browserFactory.getDriver(),0, 500);
        Thread.sleep(5000);
        perfumePage.typePriceFrom(testData.getPriceFrom());
        perfumePage.typePriceTo(testData.getPriceTo());
        perfumePage.clickToSubmitPriceRange();
        Thread.sleep(1000);

    }

    @Test
    public void searchFreshFlowers() throws InterruptedException {

        BasePage baseUrl = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        WishqueHome wishqueHome = baseUrl.loadURL("https://www.wishque.com/");
        wishqueHome.scrollPage(browserFactory.getDriver(),0, 250);
        FreshFlowerPage freshFlowerPage = wishqueHome.clickFreshFlowers();
        BirthdayFlowerArrangements birthdayFlowerArrangements = freshFlowerPage.clickOnBirthday();
        Thread.sleep(1000);
        birthdayFlowerArrangements.scrollPage(browserFactory.getDriver(),0, 350);
        Thread.sleep(1000);
        birthdayFlowerArrangements.clickPriceToggle();
        Thread.sleep(500);
        birthdayFlowerArrangements.clickRadioOptionFive();
        Thread.sleep(500);

    }

    @DataProvider(name = "testData")
    public Object[] provideTestData() throws Exception {
        List<ExcelTestDataRow> testDataList = ExcelTestDataProvider.getData();
        return testDataList.toArray(new Object[testDataList.size()]);
    }

}
