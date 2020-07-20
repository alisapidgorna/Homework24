package pages.actions;

import gherkin.lexer.Pa;
import org.openqa.selenium.support.PageFactory;
import pages.locators.ElectronicsPageLocators;
import utils.SeleniumDriver;

public class ElectronicsPageActions {
    ElectronicsPageLocators electronicsPageLocators = null;
    public ElectronicsPageActions(){
        this.electronicsPageLocators = new ElectronicsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), electronicsPageLocators);
    }
    public void clickOnSmartWatchesItem(){
        electronicsPageLocators.smartWatches.click();
    }
}