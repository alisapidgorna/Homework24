package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEbayPageLocators {

    @FindBy(xpath = "//*[@id=\"gh-eb-My\"]/div/a[1]")
    public WebElement myEbay;

    @FindBy(xpath = "//*[@id=\"gh-eb-My-o\"]/ul/li[9]/a")
    public WebElement messages;
}
