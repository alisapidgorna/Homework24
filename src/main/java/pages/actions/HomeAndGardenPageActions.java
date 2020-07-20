package pages.actions;

import gherkin.lexer.Pa;
import org.openqa.selenium.support.PageFactory;
import pages.locators.ElectronicsPageLocators;
import pages.locators.HomeAndGardenPageLocators;
import utils.SeleniumDriver;

public class HomeAndGardenPageActions {
    HomeAndGardenPageLocators homeAndGardenPageLocators = null;
    public HomeAndGardenPageActions(){
        this.homeAndGardenPageLocators = new HomeAndGardenPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), homeAndGardenPageLocators); }

public void clickOnPriceButtonLink(){homeAndGardenPageLocators.submitPriceButton.click();}
}