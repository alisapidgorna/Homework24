package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPageLocators {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/section[1]/div[2]/a[2]/div[2]")
    public WebElement smartWatches;
}